package com.sysware.wopiserver.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FileInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("HostRestUrl")
	private String HostRestUrl;

	@JsonIgnore
	public String getHostRestUrl() {
		return this.HostRestUrl;
	}

	public void setHostRestUrl(String HostRestUrl) {
		this.HostRestUrl = HostRestUrl;
	}

	@JsonProperty("RestrictedWebViewOnly")
	private boolean RestrictedWebViewOnly;

	@JsonIgnore
	public boolean getRestrictedWebViewOnly() {
		return this.RestrictedWebViewOnly;
	}

	public void setRestrictedWebViewOnly(boolean RestrictedWebViewOnly) {
		this.RestrictedWebViewOnly = RestrictedWebViewOnly;
	}

	@JsonProperty("UserCanPresent")
	private boolean UserCanPresent;

	@JsonIgnore
	public boolean getUserCanPresent() {
		return this.UserCanPresent;
	}

	public void setUserCanPresent(boolean UserCanPresent) {
		this.UserCanPresent = UserCanPresent;
	}

	@JsonProperty("BreadcrumbBrandUrl")
	private String BreadcrumbBrandUrl;

	@JsonIgnore
	public String getBreadcrumbBrandUrl() {
		return this.BreadcrumbBrandUrl;
	}

	public void setBreadcrumbBrandUrl(String BreadcrumbBrandUrl) {
		this.BreadcrumbBrandUrl = BreadcrumbBrandUrl;
	}

	@JsonProperty("BreadcrumbDocUrl")
	private String BreadcrumbDocUrl;

	@JsonIgnore
	public String getBreadcrumbDocUrl() {
		return this.BreadcrumbDocUrl;
	}

	public void setBreadcrumbDocUrl(String BreadcrumbDocUrl) {
		this.BreadcrumbDocUrl = BreadcrumbDocUrl;
	}

	@JsonProperty("Size")
	private long Size;

	@JsonIgnore
	public long getSize() {
		return this.Size;
	}

	public void setSize(long Size) {
		this.Size = Size;
	}

	@JsonProperty("CloseUrl")
	private String CloseUrl;

	@JsonIgnore
	public String getCloseUrl() {
		return this.CloseUrl;
	}

	public void setCloseUrl(String CloseUrl) {
		this.CloseUrl = CloseUrl;
	}

	@JsonProperty("TermsOfUseUrl")
	private String TermsOfUseUrl;

	@JsonIgnore
	public String getTermsOfUseUrl() {
		return this.TermsOfUseUrl;
	}

	public void setTermsOfUseUrl(String TermsOfUseUrl) {
		this.TermsOfUseUrl = TermsOfUseUrl;
	}

	@JsonProperty("HostEmbeddedViewUrl")
	private String HostEmbeddedViewUrl;

	@JsonIgnore
	public String getHostEmbeddedViewUrl() {
		return this.HostEmbeddedViewUrl;
	}

	public void setHostEmbeddedViewUrl(String HostEmbeddedViewUrl) {
		this.HostEmbeddedViewUrl = HostEmbeddedViewUrl;
	}

	@JsonProperty("SupportsFolders")
	private boolean SupportsFolders;

	@JsonIgnore
	public boolean getSupportsFolders() {
		return this.SupportsFolders;
	}

	public void setSupportsFolders(boolean SupportsFolders) {
		this.SupportsFolders = SupportsFolders;
	}

	@JsonProperty("PresenceUserId")
	private String PresenceUserId;

	@JsonIgnore
	public String getPresenceUserId() {
		return this.PresenceUserId;
	}

	public void setPresenceUserId(String PresenceUserId) {
		this.PresenceUserId = PresenceUserId;
	}

	@JsonProperty("Version")
	private long Version;

	@JsonIgnore
	public long getVersion() {
		return this.Version;
	}

	public void setVersion(long Version) {
		this.Version = Version;
	}

	@JsonProperty("AllowExternalMarketplace")
	private boolean AllowExternalMarketplace;

	@JsonIgnore
	public boolean getAllowExternalMarketplace() {
		return this.AllowExternalMarketplace;
	}

	public void setAllowExternalMarketplace(boolean AllowExternalMarketplace) {
		this.AllowExternalMarketplace = AllowExternalMarketplace;
	}

	@JsonProperty("HostViewUrl")
	private String HostViewUrl;

	@JsonIgnore
	public String getHostViewUrl() {
		return this.HostViewUrl;
	}

	public void setHostViewUrl(String HostViewUrl) {
		this.HostViewUrl = HostViewUrl;
	}

	@JsonProperty("HostName")
	private String HostName;

	@JsonIgnore
	public String getHostName() {
		return this.HostName;
	}

	public void setHostName(String HostName) {
		this.HostName = HostName;
	}

	@JsonProperty("DownloadUrl")
	private String DownloadUrl;

	@JsonIgnore
	public String getDownloadUrl() {
		return this.DownloadUrl;
	}

	public void setDownloadUrl(String DownloadUrl) {
		this.DownloadUrl = DownloadUrl;
	}

	@JsonProperty("ReadOnly")
	private boolean ReadOnly;

	@JsonIgnore
	public boolean getReadOnly() {
		return this.ReadOnly;
	}

	public void setReadOnly(boolean ReadOnly) {
		this.ReadOnly = ReadOnly;
	}

	@JsonProperty("SupportsSecureStore")
	private boolean SupportsSecureStore;

	@JsonIgnore
	public boolean getSupportsSecureStore() {
		return this.SupportsSecureStore;
	}

	public void setSupportsSecureStore(boolean SupportsSecureStore) {
		this.SupportsSecureStore = SupportsSecureStore;
	}

	@JsonProperty("DisableBrowserCachingOfUserContent")
	private boolean DisableBrowserCachingOfUserContent;

	@JsonIgnore
	public boolean getDisableBrowserCachingOfUserContent() {
		return this.DisableBrowserCachingOfUserContent;
	}

	public void setDisableBrowserCachingOfUserContent(boolean DisableBrowserCachingOfUserContent) {
		this.DisableBrowserCachingOfUserContent = DisableBrowserCachingOfUserContent;
	}

	@JsonProperty("HostEmbeddedEditUrl")
	private String HostEmbeddedEditUrl;

	@JsonIgnore
	public String getHostEmbeddedEditUrl() {
		return this.HostEmbeddedEditUrl;
	}

	public void setHostEmbeddedEditUrl(String HostEmbeddedEditUrl) {
		this.HostEmbeddedEditUrl = HostEmbeddedEditUrl;
	}

	@JsonProperty("SupportsLocks")
	private boolean SupportsLocks;

	@JsonIgnore
	public boolean getSupportsLocks() {
		return this.SupportsLocks;
	}

	public void setSupportsLocks(boolean SupportsLocks) {
		this.SupportsLocks = SupportsLocks;
	}

	@JsonProperty("SignoutUrl")
	private String SignoutUrl;

	@JsonIgnore
	public String getSignoutUrl() {
		return this.SignoutUrl;
	}

	public void setSignoutUrl(String SignoutUrl) {
		this.SignoutUrl = SignoutUrl;
	}

	@JsonProperty("SupportsCoauth")
	private boolean SupportsCoauth;

	@JsonIgnore
	public boolean getSupportsCoauth() {
		return this.SupportsCoauth;
	}

	public void setSupportsCoauth(boolean SupportsCoauth) {
		this.SupportsCoauth = SupportsCoauth;
	}

	@JsonProperty("BreadcrumbFolderUrl")
	private String BreadcrumbFolderUrl;

	@JsonIgnore
	public String getBreadcrumbFolderUrl() {
		return this.BreadcrumbFolderUrl;
	}

	public void setBreadcrumbFolderUrl(String BreadcrumbFolderUrl) {
		this.BreadcrumbFolderUrl = BreadcrumbFolderUrl;
	}

	@JsonProperty("SupportsUpdate")
	private boolean SupportsUpdate;

	@JsonIgnore
	public boolean getSupportsUpdate() {
		return this.SupportsUpdate;
	}

	public void setSupportsUpdate(boolean SupportsUpdate) {
		this.SupportsUpdate = SupportsUpdate;
	}

	@JsonProperty("TimeZone")
	private String TimeZone;

	@JsonIgnore
	public String getTimeZone() {
		return this.TimeZone;
	}

	public void setTimeZone(String TimeZone) {
		this.TimeZone = TimeZone;
	}

	@JsonProperty("UserCanAttend")
	private boolean UserCanAttend;

	@JsonIgnore
	public boolean getUserCanAttend() {
		return this.UserCanAttend;
	}

	public void setUserCanAttend(boolean UserCanAttend) {
		this.UserCanAttend = UserCanAttend;
	}

	@JsonProperty("CloseButtonClosesWindow")
	private boolean CloseButtonClosesWindow;

	@JsonIgnore
	public boolean getCloseButtonClosesWindow() {
		return this.CloseButtonClosesWindow;
	}

	public void setCloseButtonClosesWindow(boolean CloseButtonClosesWindow) {
		this.CloseButtonClosesWindow = CloseButtonClosesWindow;
	}

	@JsonProperty("WebEditingDisabled")
	private boolean WebEditingDisabled;

	@JsonIgnore
	public boolean getWebEditingDisabled() {
		return this.WebEditingDisabled;
	}

	public void setWebEditingDisabled(boolean WebEditingDisabled) {
		this.WebEditingDisabled = WebEditingDisabled;
	}

	@JsonProperty("SupportsScenarioLinks")
	private boolean SupportsScenarioLinks;

	@JsonIgnore
	public boolean getSupportsScenarioLinks() {
		return this.SupportsScenarioLinks;
	}

	public void setSupportsScenarioLinks(boolean SupportsScenarioLinks) {
		this.SupportsScenarioLinks = SupportsScenarioLinks;
	}

	@JsonProperty("HostEditUrl")
	private String HostEditUrl;

	@JsonIgnore
	public String getHostEditUrl() {
		return this.HostEditUrl;
	}

	public void setHostEditUrl(String HostEditUrl) {
		this.HostEditUrl = HostEditUrl;
	}

	@JsonProperty("BreadcrumbFolderName")
	private String BreadcrumbFolderName;

	@JsonIgnore
	public String getBreadcrumbFolderName() {
		return this.BreadcrumbFolderName;
	}

	public void setBreadcrumbFolderName(String BreadcrumbFolderName) {
		this.BreadcrumbFolderName = BreadcrumbFolderName;
	}

	@JsonProperty("FileSharingUrl")
	private String FileSharingUrl;

	@JsonIgnore
	public String getFileSharingUrl() {
		return this.FileSharingUrl;
	}

	public void setFileSharingUrl(String FileSharingUrl) {
		this.FileSharingUrl = FileSharingUrl;
	}

	@JsonProperty("SupportsCobalt")
	private boolean SupportsCobalt;

	@JsonIgnore
	public boolean getSupportsCobalt() {
		return this.SupportsCobalt;
	}

	public void setSupportsCobalt(boolean SupportsCobalt) {
		this.SupportsCobalt = SupportsCobalt;
	}

	@JsonProperty("DisableTranslation")
	private boolean DisableTranslation;

	@JsonIgnore
	public boolean getDisableTranslation() {
		return this.DisableTranslation;
	}

	public void setDisableTranslation(boolean DisableTranslation) {
		this.DisableTranslation = DisableTranslation;
	}

	@JsonProperty("IrmPolicyDescription")
	private String IrmPolicyDescription;

	@JsonIgnore
	public String getIrmPolicyDescription() {
		return this.IrmPolicyDescription;
	}

	public void setIrmPolicyDescription(String IrmPolicyDescription) {
		this.IrmPolicyDescription = IrmPolicyDescription;
	}

	@JsonProperty("BaseFileName")
	private String BaseFileName;

	@JsonIgnore
	public String getBaseFileName() {
		return this.BaseFileName;
	}

	public void setBaseFileName(String BaseFileName) {
		this.BaseFileName = BaseFileName;
	}

	@JsonProperty("PresenceProvider")
	private String PresenceProvider;

	@JsonIgnore
	public String getPresenceProvider() {
		return this.PresenceProvider;
	}

	public void setPresenceProvider(String PresenceProvider) {
		this.PresenceProvider = PresenceProvider;
	}

	@JsonProperty("UserFriendlyName")
	private String UserFriendlyName;

	@JsonIgnore
	public String getUserFriendlyName() {
		return this.UserFriendlyName;
	}

	public void setUserFriendlyName(String UserFriendlyName) {
		this.UserFriendlyName = UserFriendlyName;
	}

	@JsonProperty("OwnerId")
	private String OwnerId;

	@JsonIgnore
	public String getOwnerId() {
		return this.OwnerId;
	}

	public void setOwnerId(String OwnerId) {
		this.OwnerId = OwnerId;
	}

	@JsonProperty("UserCanNotWriteRelative")
	private boolean UserCanNotWriteRelative;

	@JsonIgnore
	public boolean getUserCanNotWriteRelative() {
		return this.UserCanNotWriteRelative;
	}

	public void setUserCanNotWriteRelative(boolean UserCanNotWriteRelative) {
		this.UserCanNotWriteRelative = UserCanNotWriteRelative;
	}

	@JsonProperty("BreadcrumbDocName")
	private String BreadcrumbDocName;

	@JsonIgnore
	public String getBreadcrumbDocName() {
		return this.BreadcrumbDocName;
	}

	public void setBreadcrumbDocName(String BreadcrumbDocName) {
		this.BreadcrumbDocName = BreadcrumbDocName;
	}

	@JsonProperty("HostNotes")
	private String HostNotes;

	@JsonIgnore
	public String getHostNotes() {
		return this.HostNotes;
	}

	public void setHostNotes(String HostNotes) {
		this.HostNotes = HostNotes;
	}

	@JsonProperty("SHA256")
	private String SHA256;

	@JsonIgnore
	public String getSHA256() {
		return this.SHA256;
	}

	public void setSHA256(String SHA256) {
		this.SHA256 = SHA256;
	}

	@JsonProperty("UserCanWrite")
	private boolean UserCanWrite;

	@JsonIgnore
	public boolean getUserCanWrite() {
		return this.UserCanWrite;
	}

	public void setUserCanWrite(boolean UserCanWrite) {
		this.UserCanWrite = UserCanWrite;
	}

	@JsonProperty("FileUrl")
	private String FileUrl;

	@JsonIgnore
	public String getFileUrl() {
		return this.FileUrl;
	}

	public void setFileUrl(String FileUrl) {
		this.FileUrl = FileUrl;
	}

	@JsonProperty("TenantId")
	private String TenantId;

	@JsonIgnore
	public String getTenantId() {
		return this.TenantId;
	}

	public void setTenantId(String TenantId) {
		this.TenantId = TenantId;
	}

	@JsonProperty("DisablePrint")
	private boolean DisablePrint;

	@JsonIgnore
	public boolean getDisablePrint() {
		return this.DisablePrint;
	}

	public void setDisablePrint(boolean DisablePrint) {
		this.DisablePrint = DisablePrint;
	}

	@JsonProperty("UserId")
	private String UserId;

	@JsonIgnore
	public String getUserId() {
		return this.UserId;
	}

	public void setUserId(String UserId) {
		this.UserId = UserId;
	}

	@JsonProperty("ClientUrl")
	private String ClientUrl;

	@JsonIgnore
	public String getClientUrl() {
		return this.ClientUrl;
	}

	public void setClientUrl(String ClientUrl) {
		this.ClientUrl = ClientUrl;
	}

	@JsonProperty("HostAuthenticationId")
	private String HostAuthenticationId;

	@JsonIgnore
	public String getHostAuthenticationId() {
		return this.HostAuthenticationId;
	}

	public void setHostAuthenticationId(String HostAuthenticationId) {
		this.HostAuthenticationId = HostAuthenticationId;
	}

	@JsonProperty("IrmPolicyTitle")
	private String IrmPolicyTitle;

	@JsonIgnore
	public String getIrmPolicyTitle() {
		return this.IrmPolicyTitle;
	}

	public void setIrmPolicyTitle(String IrmPolicyTitle) {
		this.IrmPolicyTitle = IrmPolicyTitle;
	}

	@JsonProperty("ProtectInClient")
	private boolean ProtectInClient;

	@JsonIgnore
	public boolean getProtectInClient() {
		return this.ProtectInClient;
	}

	public void setProtectInClient(boolean ProtectInClient) {
		this.ProtectInClient = ProtectInClient;
	}

	@JsonProperty("BreadcrumbBrandName")
	private String BreadcrumbBrandName;

	@JsonIgnore
	public String getBreadcrumbBrandName() {
		return this.BreadcrumbBrandName;
	}

	public void setBreadcrumbBrandName(String BreadcrumbBrandName) {
		this.BreadcrumbBrandName = BreadcrumbBrandName;
	}

	@JsonProperty("PrivacyUrl")
	private String PrivacyUrl;

	@JsonIgnore
	public String getPrivacyUrl() {
		return this.PrivacyUrl;
	}

	public void setPrivacyUrl(String PrivacyUrl) {
		this.PrivacyUrl = PrivacyUrl;
	}

}