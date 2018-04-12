<%@page import="com.sysware.wopiserver.utils.StringUtil"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
	String basePath = StringUtil.BASE_PATH;
%>
<html>
<head>
	<title>index</title>
	<link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css">
	<link rel="stylesheet" href="<%=basePath%>css/dataTables.bootstrap.min.css"> 
	<script type="text/javascript" src="<%=basePath%>js/jquery-1.12.4.js"></script>
	<!-- http://www.datatables.club/ -->
	<script type="text/javascript" src="<%=basePath%>js/jquery.dataTables.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/dataTables.bootstrap.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/String.js"></script>
	<script type="text/javascript">
	$(function(){
		var basePath = "<%=basePath%>";
		var OFFICE_WEBAPP_SERVER_HOST_2013 = "http://192.168.10.116/hosting/discovery";
		var WOPISrc = "http://192.168.11.102:8080/wopihost/wopi/files/{0}&access_token={access_token}_{canedit}";
		
		//$("#office_webapp_2013").attr("href",OFFICE_WEBAPP_SERVER_HOST+"hosting/discovery");
		
		$.ajax({
			url : basePath+"data/access_token.json",
			dataType:"json",
			success:function(data){
				var i=0;
				for(var id in data){
					var p = {
						value : id,
						isSelected : "",
						name : data[id].userName
					};
					if(i==0){
						p.isSelected = 'selected="selected"';
					}
					$("#user_list").append('<option value="{value}" {isSelected}>{name}</option>'.format(p));
					i++;
				}
			}
		});
		
		function getWOPIUrl(fileName){
			var ext = fileName.substring(fileName.lastIndexOf(".")+1).toLowerCase();
			var appName = "Word";
			if("xls"===ext || "xlsx"===ext){
				 appName = "Excel";
			}else if("ppt"===ext || "pptx"===ext){
				 appName = "PowerPoint";
			}
			var xpath = "/wopi-discovery/net-zone[@name='external-http']/app[@name='{0}']/action[@name='view' and @ext='{1}']".
				format(appName, ext);
			var wopiurlsrc = "";
			$.ajax({
				url : basePath+"xmlProcess/parseTag",
				type:"post",
				data : {
					"url":OFFICE_WEBAPP_SERVER_HOST_2013,
					"xpath":xpath,
					"attributes":"urlsrc"
				},
				async : false,
		        dataType:"json",
		        success:function(data){
		        	if(data){
		        		wopiurlsrc = data.urlsrc.substring(0, data.urlsrc.lastIndexOf("?"))
		        			+"?ui=zh-CN&rs=zh-CN&WOPISrc={0}";
		        	}
		        }
			});
			return wopiurlsrc;
		}
		
	    var dataSet = [];
	    $.ajax({
	    	url : basePath+"data/files.json",
	    	dataType:"json",
	    	async : false,
	    	success:function(data){
	    		for(var id in data){
	    			var WOPIUrl = getWOPIUrl(data[id].fileName).format(WOPISrc.format(id));
	    			var downURL = basePath+"wopi/files/"+id+"/contents";
	    			var row = ["<a target='_blank' href='{0}'>{1}</a>".format(downURL, data[id].fileName), 
	    				"<button href='{0}'>查看</button>".format(WOPIUrl.format({"canedit":"false"}))+
	    				"<button href='{0}'>编辑</button>".format(WOPIUrl.format({"canedit":"true"})), 
	    				"<button>在线查看</button>"];
	    			dataSet.push(row);
	    		} 
	    	}
	    });
	    
	    var title_2013 = "<a target='_blank' href='{0}'>2013</a>".format(OFFICE_WEBAPP_SERVER_HOST_2013);
	    
	    $("#main_div").DataTable( {
	    	"language":{
	    		"url":"./data/zh_cn.json"
	    	},
	        "data": dataSet,
	        "columns": [
	            { title: "文件名称" },
	            { title:  title_2013},
	            { title : "<a>2016</a>"}
	        ],
	        "bPaginate": false, //翻页功能  
	        "bLengthChange": false, //改变每页显示数据数量  
	        "bFilter": false, //过滤功能  
	        "bSort": false, //排序功能  
	        "bInfo": false, //页脚信息  
	        "bAutoWidth": true//自动宽度   
	    });
	    
	    $("#main_div").on("click", "button", function(){
	    	var href = $(this).attr("href");
	    	if(href){
	    		window.open(href.format({"access_token":$("#user_list ").val()}));
	    	}
	    });
	});
	</script>
</head>
<body class="container">
	<div class="row">
		<div class="col-md-1"></div>
		<div class="col-md-10">
			<div class="panel panel-default">
				<div class="panel-heading">
			        OFFICE ONLINE DEMO
			    </div>
			    <div class="panel-body">
			    	<div class="col-md-4">
			        	<label>选择用户</label>
						<select id="user_list" multiple class="form-control">
						</select>
			        </div>
				    <table id="main_div" class="table table-striped"></table>
			    </div>
			</div>
		</div>
		<div class="col-md-1"></div>
	</div>
</body>
</html>
