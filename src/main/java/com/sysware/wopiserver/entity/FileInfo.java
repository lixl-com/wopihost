package com.sysware.wopiserver.entity;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

public class FileInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	@JSONField(name = "HostRestUrl")
	private String HostRestUrl;

	public String getHostRestUrl() {
		return this.HostRestUrl;
	}

	public void setHostRestUrl(String HostRestUrl) {
		this.HostRestUrl = HostRestUrl;
	}

	@JSONField(name = "RestrictedWebViewOnly")
	private boolean RestrictedWebViewOnly;

	public boolean getRestrictedWebViewOnly() {
		return this.RestrictedWebViewOnly;
	}

	public void setRestrictedWebViewOnly(boolean RestrictedWebViewOnly) {
		this.RestrictedWebViewOnly = RestrictedWebViewOnly;
	}

	@JSONField(name = "UserCanPresent")
	private boolean UserCanPresent;

	public boolean getUserCanPresent() {
		return this.UserCanPresent;
	}

	public void setUserCanPresent(boolean UserCanPresent) {
		this.UserCanPresent = UserCanPresent;
	}

	@JSONField(name = "BreadcrumbBrandUrl")
	private String BreadcrumbBrandUrl;

	public String getBreadcrumbBrandUrl() {
		return this.BreadcrumbBrandUrl;
	}

	public void setBreadcrumbBrandUrl(String BreadcrumbBrandUrl) {
		this.BreadcrumbBrandUrl = BreadcrumbBrandUrl;
	}

	@JSONField(name = "BreadcrumbDocUrl")
	private String BreadcrumbDocUrl;

	public String getBreadcrumbDocUrl() {
		return this.BreadcrumbDocUrl;
	}

	public void setBreadcrumbDocUrl(String BreadcrumbDocUrl) {
		this.BreadcrumbDocUrl = BreadcrumbDocUrl;
	}

	@JSONField(name = "Size")
	private long Size;

	public long getSize() {
		return this.Size;
	}

	public void setSize(long Size) {
		this.Size = Size;
	}

	@JSONField(name = "CloseUrl")
	private String CloseUrl;

	public String getCloseUrl() {
		return this.CloseUrl;
	}

	public void setCloseUrl(String CloseUrl) {
		this.CloseUrl = CloseUrl;
	}

	@JSONField(name = "TermsOfUseUrl")
	private String TermsOfUseUrl;

	public String getTermsOfUseUrl() {
		return this.TermsOfUseUrl;
	}

	public void setTermsOfUseUrl(String TermsOfUseUrl) {
		this.TermsOfUseUrl = TermsOfUseUrl;
	}

	@JSONField(name = "HostEmbeddedViewUrl")
	private String HostEmbeddedViewUrl;

	public String getHostEmbeddedViewUrl() {
		return this.HostEmbeddedViewUrl;
	}

	public void setHostEmbeddedViewUrl(String HostEmbeddedViewUrl) {
		this.HostEmbeddedViewUrl = HostEmbeddedViewUrl;
	}

	@JSONField(name = "SupportsFolders")
	private boolean SupportsFolders;

	public boolean getSupportsFolders() {
		return this.SupportsFolders;
	}

	public void setSupportsFolders(boolean SupportsFolders) {
		this.SupportsFolders = SupportsFolders;
	}

	@JSONField(name = "PresenceUserId")
	private String PresenceUserId;

	public String getPresenceUserId() {
		return this.PresenceUserId;
	}

	public void setPresenceUserId(String PresenceUserId) {
		this.PresenceUserId = PresenceUserId;
	}

	@JSONField(name = "Version")
	private long Version;

	public long getVersion() {
		return this.Version;
	}

	public void setVersion(long Version) {
		this.Version = Version;
	}

	@JSONField(name = "AllowExternalMarketplace")
	private boolean AllowExternalMarketplace;

	public boolean getAllowExternalMarketplace() {
		return this.AllowExternalMarketplace;
	}

	public void setAllowExternalMarketplace(boolean AllowExternalMarketplace) {
		this.AllowExternalMarketplace = AllowExternalMarketplace;
	}

	@JSONField(name = "HostViewUrl")
	private String HostViewUrl;

	public String getHostViewUrl() {
		return this.HostViewUrl;
	}

	public void setHostViewUrl(String HostViewUrl) {
		this.HostViewUrl = HostViewUrl;
	}

	@JSONField(name = "HostName")
	private String HostName;

	public String getHostName() {
		return this.HostName;
	}

	public void setHostName(String HostName) {
		this.HostName = HostName;
	}

	@JSONField(name = "DownloadUrl")
	private String DownloadUrl;

	public String getDownloadUrl() {
		return this.DownloadUrl;
	}

	public void setDownloadUrl(String DownloadUrl) {
		this.DownloadUrl = DownloadUrl;
	}

	@JSONField(name = "ReadOnly")
	private boolean ReadOnly;

	public boolean getReadOnly() {
		return this.ReadOnly;
	}

	public void setReadOnly(boolean ReadOnly) {
		this.ReadOnly = ReadOnly;
	}

	@JSONField(name = "SupportsSecureStore")
	private boolean SupportsSecureStore;

	public boolean getSupportsSecureStore() {
		return this.SupportsSecureStore;
	}

	public void setSupportsSecureStore(boolean SupportsSecureStore) {
		this.SupportsSecureStore = SupportsSecureStore;
	}

	@JSONField(name = "DisableBrowserCachingOfUserContent")
	private boolean DisableBrowserCachingOfUserContent;

	public boolean getDisableBrowserCachingOfUserContent() {
		return this.DisableBrowserCachingOfUserContent;
	}

	public void setDisableBrowserCachingOfUserContent(boolean DisableBrowserCachingOfUserContent) {
		this.DisableBrowserCachingOfUserContent = DisableBrowserCachingOfUserContent;
	}

	@JSONField(name = "HostEmbeddedEditUrl")
	private String HostEmbeddedEditUrl;

	public String getHostEmbeddedEditUrl() {
		return this.HostEmbeddedEditUrl;
	}

	public void setHostEmbeddedEditUrl(String HostEmbeddedEditUrl) {
		this.HostEmbeddedEditUrl = HostEmbeddedEditUrl;
	}

	@JSONField(name = "SupportsLocks")
	private boolean SupportsLocks;

	public boolean getSupportsLocks() {
		return this.SupportsLocks;
	}

	public void setSupportsLocks(boolean SupportsLocks) {
		this.SupportsLocks = SupportsLocks;
	}

	@JSONField(name = "SignoutUrl")
	private String SignoutUrl;

	public String getSignoutUrl() {
		return this.SignoutUrl;
	}

	public void setSignoutUrl(String SignoutUrl) {
		this.SignoutUrl = SignoutUrl;
	}

	@JSONField(name = "SupportsCoauth")
	private boolean SupportsCoauth;

	public boolean getSupportsCoauth() {
		return this.SupportsCoauth;
	}

	public void setSupportsCoauth(boolean SupportsCoauth) {
		this.SupportsCoauth = SupportsCoauth;
	}

	@JSONField(name = "BreadcrumbFolderUrl")
	private String BreadcrumbFolderUrl;

	public String getBreadcrumbFolderUrl() {
		return this.BreadcrumbFolderUrl;
	}

	public void setBreadcrumbFolderUrl(String BreadcrumbFolderUrl) {
		this.BreadcrumbFolderUrl = BreadcrumbFolderUrl;
	}

	@JSONField(name = "SupportsUpdate")
	private boolean SupportsUpdate;

	public boolean getSupportsUpdate() {
		return this.SupportsUpdate;
	}

	public void setSupportsUpdate(boolean SupportsUpdate) {
		this.SupportsUpdate = SupportsUpdate;
	}

	@JSONField(name = "TimeZone")
	private String TimeZone;

	public String getTimeZone() {
		return this.TimeZone;
	}

	public void setTimeZone(String TimeZone) {
		this.TimeZone = TimeZone;
	}

	@JSONField(name = "UserCanAttend")
	private boolean UserCanAttend;

	public boolean getUserCanAttend() {
		return this.UserCanAttend;
	}

	public void setUserCanAttend(boolean UserCanAttend) {
		this.UserCanAttend = UserCanAttend;
	}

	@JSONField(name = "CloseButtonClosesWindow")
	private boolean CloseButtonClosesWindow;

	public boolean getCloseButtonClosesWindow() {
		return this.CloseButtonClosesWindow;
	}

	public void setCloseButtonClosesWindow(boolean CloseButtonClosesWindow) {
		this.CloseButtonClosesWindow = CloseButtonClosesWindow;
	}

	@JSONField(name = "WebEditingDisabled")
	private boolean WebEditingDisabled;

	public boolean getWebEditingDisabled() {
		return this.WebEditingDisabled;
	}

	public void setWebEditingDisabled(boolean WebEditingDisabled) {
		this.WebEditingDisabled = WebEditingDisabled;
	}

	@JSONField(name = "SupportsScenarioLinks")
	private boolean SupportsScenarioLinks;

	public boolean getSupportsScenarioLinks() {
		return this.SupportsScenarioLinks;
	}

	public void setSupportsScenarioLinks(boolean SupportsScenarioLinks) {
		this.SupportsScenarioLinks = SupportsScenarioLinks;
	}

	@JSONField(name = "HostEditUrl")
	private String HostEditUrl;

	public String getHostEditUrl() {
		return this.HostEditUrl;
	}

	public void setHostEditUrl(String HostEditUrl) {
		this.HostEditUrl = HostEditUrl;
	}

	@JSONField(name = "BreadcrumbFolderName")
	private String BreadcrumbFolderName;

	public String getBreadcrumbFolderName() {
		return this.BreadcrumbFolderName;
	}

	public void setBreadcrumbFolderName(String BreadcrumbFolderName) {
		this.BreadcrumbFolderName = BreadcrumbFolderName;
	}

	@JSONField(name = "FileSharingUrl")
	private String FileSharingUrl;

	public String getFileSharingUrl() {
		return this.FileSharingUrl;
	}

	public void setFileSharingUrl(String FileSharingUrl) {
		this.FileSharingUrl = FileSharingUrl;
	}

	@JSONField(name = "SupportsCobalt")
	private boolean SupportsCobalt;

	public boolean getSupportsCobalt() {
		return this.SupportsCobalt;
	}

	public void setSupportsCobalt(boolean SupportsCobalt) {
		this.SupportsCobalt = SupportsCobalt;
	}

	@JSONField(name = "DisableTranslation")
	private boolean DisableTranslation;

	public boolean getDisableTranslation() {
		return this.DisableTranslation;
	}

	public void setDisableTranslation(boolean DisableTranslation) {
		this.DisableTranslation = DisableTranslation;
	}

	@JSONField(name = "IrmPolicyDescription")
	private String IrmPolicyDescription;

	public String getIrmPolicyDescription() {
		return this.IrmPolicyDescription;
	}

	public void setIrmPolicyDescription(String IrmPolicyDescription) {
		this.IrmPolicyDescription = IrmPolicyDescription;
	}

	@JSONField(name = "BaseFileName")
	private String BaseFileName;

	public String getBaseFileName() {
		return this.BaseFileName;
	}

	public void setBaseFileName(String BaseFileName) {
		this.BaseFileName = BaseFileName;
	}

	@JSONField(name = "PresenceProvider")
	private String PresenceProvider;

	public String getPresenceProvider() {
		return this.PresenceProvider;
	}

	public void setPresenceProvider(String PresenceProvider) {
		this.PresenceProvider = PresenceProvider;
	}

	@JSONField(name = "UserFriendlyName")
	private String UserFriendlyName;

	public String getUserFriendlyName() {
		return this.UserFriendlyName;
	}

	public void setUserFriendlyName(String UserFriendlyName) {
		this.UserFriendlyName = UserFriendlyName;
	}

	@JSONField(name = "OwnerId")
	private String OwnerId;

	public String getOwnerId() {
		return this.OwnerId;
	}

	public void setOwnerId(String OwnerId) {
		this.OwnerId = OwnerId;
	}

	@JSONField(name = "UserCanNotWriteRelative")
	private boolean UserCanNotWriteRelative;

	public boolean getUserCanNotWriteRelative() {
		return this.UserCanNotWriteRelative;
	}

	public void setUserCanNotWriteRelative(boolean UserCanNotWriteRelative) {
		this.UserCanNotWriteRelative = UserCanNotWriteRelative;
	}

	@JSONField(name = "BreadcrumbDocName")
	private String BreadcrumbDocName;

	public String getBreadcrumbDocName() {
		return this.BreadcrumbDocName;
	}

	public void setBreadcrumbDocName(String BreadcrumbDocName) {
		this.BreadcrumbDocName = BreadcrumbDocName;
	}

	@JSONField(name = "HostNotes")
	private String HostNotes;

	public String getHostNotes() {
		return this.HostNotes;
	}

	public void setHostNotes(String HostNotes) {
		this.HostNotes = HostNotes;
	}

	@JSONField(name = "SHA256")
	private String SHA256;

	public String getSHA256() {
		return this.SHA256;
	}

	public void setSHA256(String SHA256) {
		this.SHA256 = SHA256;
	}

	@JSONField(name = "UserCanWrite")
	private boolean UserCanWrite;

	public boolean getUserCanWrite() {
		return this.UserCanWrite;
	}

	public void setUserCanWrite(boolean UserCanWrite) {
		this.UserCanWrite = UserCanWrite;
	}

	@JSONField(name = "FileUrl")
	private String FileUrl;

	public String getFileUrl() {
		return this.FileUrl;
	}

	public void setFileUrl(String FileUrl) {
		this.FileUrl = FileUrl;
	}

	@JSONField(name = "TenantId")
	private String TenantId;

	public String getTenantId() {
		return this.TenantId;
	}

	public void setTenantId(String TenantId) {
		this.TenantId = TenantId;
	}

	@JSONField(name = "DisablePrint")
	private boolean DisablePrint;

	public boolean getDisablePrint() {
		return this.DisablePrint;
	}

	public void setDisablePrint(boolean DisablePrint) {
		this.DisablePrint = DisablePrint;
	}

	@JSONField(name = "UserId")
	private String UserId;

	public String getUserId() {
		return this.UserId;
	}

	public void setUserId(String UserId) {
		this.UserId = UserId;
	}

	@JSONField(name = "ClientUrl")
	private String ClientUrl;

	public String getClientUrl() {
		return this.ClientUrl;
	}

	public void setClientUrl(String ClientUrl) {
		this.ClientUrl = ClientUrl;
	}

	@JSONField(name = "HostAuthenticationId")
	private String HostAuthenticationId;

	public String getHostAuthenticationId() {
		return this.HostAuthenticationId;
	}

	public void setHostAuthenticationId(String HostAuthenticationId) {
		this.HostAuthenticationId = HostAuthenticationId;
	}

	@JSONField(name = "IrmPolicyTitle")
	private String IrmPolicyTitle;

	public String getIrmPolicyTitle() {
		return this.IrmPolicyTitle;
	}

	public void setIrmPolicyTitle(String IrmPolicyTitle) {
		this.IrmPolicyTitle = IrmPolicyTitle;
	}

	@JSONField(name = "ProtectInClient")
	private boolean ProtectInClient;

	public boolean getProtectInClient() {
		return this.ProtectInClient;
	}

	public void setProtectInClient(boolean ProtectInClient) {
		this.ProtectInClient = ProtectInClient;
	}

	@JSONField(name = "BreadcrumbBrandName")
	private String BreadcrumbBrandName;

	public String getBreadcrumbBrandName() {
		return this.BreadcrumbBrandName;
	}

	public void setBreadcrumbBrandName(String BreadcrumbBrandName) {
		this.BreadcrumbBrandName = BreadcrumbBrandName;
	}

	@JSONField(name = "PrivacyUrl")
	private String PrivacyUrl;

	public String getPrivacyUrl() {
		return this.PrivacyUrl;
	}

	public void setPrivacyUrl(String PrivacyUrl) {
		this.PrivacyUrl = PrivacyUrl;
	}

}
