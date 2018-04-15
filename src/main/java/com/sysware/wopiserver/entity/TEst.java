package com.sysware.wopiserver.entity;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TEst {

	public static void main2(String[] args) {
		String str = "{\r\n" + 
				" \"AllowAdditionalMicrosoftServices\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"AllowExternalMarketplace\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"BaseFileName\":{\"type\":\"string\",\"optional\":false},\r\n" + 
				" \"BreadcrumbBrandName\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"BreadcrumbBrandUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"BreadcrumbDocName\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"BreadcrumbDocUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"BreadcrumbFolderName\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"BreadcrumbFolderUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"ClientUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"CloseButtonClosesWindow\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"ClosePostMessage\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"CloseUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"DisableBrowserCachingOfUserContent\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"DisablePrint\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"DisableTranslation\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"DownloadUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"EditAndReplyUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"EditModePostMessage\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"EditNotificationPostMessage\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"FileExtension\":{\"type\":\"string\",\"default\":\"\",\"optional\":true}, \r\n" + 
				" \"FileNameMaxLength\":{\"type\":\"integer\",\"default\":250,\"optional\":true}, \r\n" + 
				" \"FileSharingPostMessage\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"FileSharingUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true}, \r\n" + 
				" \"FileUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"HostAuthenticationId\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"HostEditUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"HostEmbeddedEditUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"HostEmbeddedViewUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"HostName\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"HostNotes\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"HostRestUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"HostViewUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"IrmPolicyDescription\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"IrmPolicyTitle\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"LicenseCheckForEditIsEnabled\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"OwnerId\":{\"type\":\"string\",\"optional\":false},\r\n" + 
				" \"PostMessageOrigin\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"PresenceProvider\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"PresenceUserId\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"PrivacyUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"ProtectInClient\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"ReadOnly\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"RestrictedWebViewOnly\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"SHA256\":{\"type\":\"string\",\"optional\":true},\r\n" + 
				" \"SignInUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"SignoutUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"Size\":{\"type\":\"int\",\"optional\":false},\r\n" + 
				" \"SupportedShareUrlTypes\":{\"type\":\"string[]\",\"default\":[],\"optional\":true},\r\n" + 
				" \"SupportsCoauth\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"SupportsCobalt\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"SupportsExtendedLockLength\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"SupportsFileCreation\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"SupportsFolders\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"SupportsGetLock\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"SupportsLocks\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"SupportsRename\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"SupportsScenarioLinks\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"SupportsSecureStore\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"SupportsUpdate\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"SupportsUserInfo\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"TenantId\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"TermsOfUseUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"TimeZone\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"UniqueContentId\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"UserCanAttend\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"UserCanNotWriteRelative\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"UserCanPresent\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"UserCanRename\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"UserCanWrite\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"UserFriendlyName\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"UserId\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"UserInfo\":{\"type\":\"string\",\"default\":\"\",\"optional\":true},\r\n" + 
				" \"Version\":{\"type\":\"string\",\"optional\":false},\r\n" + 
				" \"WebEditingDisabled\":{\"type\":\"bool\",\"default\":false,\"optional\":true},\r\n" + 
				" \"WorkflowType\":{\"type\":\"string[]\",\"default\":[],\"optional\":true},\r\n" + 
				" \"WorkflowUrl\":{\"type\":\"string\",\"default\":\"\",\"optional\":true}\r\n" + 
				" }";
		JSONObject obj = JSONObject.parseObject(str);
		for(Map.Entry<String, Object> e:obj.entrySet()) {
			String key = e.getKey();
			Object value = e.getValue();
			String t = "String";
			if(value!=null) {
				JSONObject v = (JSONObject) value;
				if("bool".equals(v.getString("type"))){
					t = "boolean";
				}else if("string[]".equals(v.getString("type"))) {
					t = "String[]";
				}else if("int".equals(v.getString("type"))) {
					t = "int";
				}
			}
			System.out.println("@JsonProperty(\""+key+"\")");
			System.out.println("private "+t+" "+key+";");
			System.out.println("@JsonIgnore");
			System.out.println("public "+t+" get"+key+"(){"
					+ "return this."+key+";}");
			System.out.println("public void set"+key+"("+t+" "+key+"){"
					+ "this."+key+"="+key+";}");
		}
		
	}
	
	public static void main3(String[] args) {
		FileInfo info = new FileInfo();
		info.setHostRestUrl("ewew");
		System.out.println(JSONObject.toJSONString(info,SerializerFeature.WriteMapNullValue));
	}
	
	public static void main(String[] args) throws JsonProcessingException {
		FileInfo info = new FileInfo();
		ObjectMapper mapper = new ObjectMapper();
		String Json = mapper.writeValueAsString(info);
		System.out.println(Json);
	}

}
