<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page language="java" %>
<html>
<head>
	<title>index</title>
	<script type="text/javascript">
	String.prototype.format = function(){    
	    var args = arguments;    
	    return this.replace(/\{(\d+)\}/g,                    
	        function(m,i){    
	            return args[i];    
	        });    
	}    
	</script>
</head>
<body>
<h2>DEMO</h2>
<table>
	<tr>
		<td>Office online 2016</td>
		<td><a target="_blank" href="http://192.168.11.118/wv/wordviewerframe.aspx?ui=zh-CN&rs=zh-CN&WOPISrc=http://192.168.0.32:8080/wopiserver/wopi/files/1&access_token=aaaa1">在线查看</a></td>
	</tr>
	<tr>
		<td>Office online 2016</td>
		<td><a target="_blank" href="http://192.168.11.118/we/wordeditorframe.aspx?ui=zh-CN&rs=zh-CN&WOPISrc=http://192.168.0.32:8080/wopiserver/wopi/files/1&access_token=aaaa1">在线编辑</a></td>
	</tr>
	<tr>
		<td>Word web app 2013</td>
		<td><a target="_blank" href="http://192.168.10.116/wv/wordviewerframe.aspx?ui=zh-CN&rs=zh-CN&WOPISrc=http://192.168.0.32:8080/wopiserver/wopi/files/1&access_token=aaaa1">在线查看</a></td>
	</tr>
	<tr>
		<td>Word web app 2013</td>
		<td><a target="_blank" href="http://192.168.10.116/we/wordeditorframe.aspx?ui=zh-CN&rs=zh-CN&WOPISrc=http://192.168.0.32:8080/wopiserver/wopi/files/1&access_token=aaaa1">在线编辑</a></td>
	</tr>
</table>
</body>
</html>
