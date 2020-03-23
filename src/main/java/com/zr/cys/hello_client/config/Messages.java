package com.zr.cys.hello_client.config;
import org.springframework.boot.context.properties.ConfigurationProperties;

import com.zr.commons.config.Properties;

@ConfigurationProperties(prefix = "message")
public class Messages implements Properties {
	
	private Integer serverId;
	
	private String charset;
	
	private String version;
	
	private String logName;
	
	private String commons;
	
	private String logClient;
	
	private String domain;
	
	private String ice;
	
	private String imageUrl;
	
	private String adjustImage;
	
	private String potImage;
	
	private String jzImage;
	
	private String recordFile;
	
	private String dictPrefix;
	
	private String sysRelPrefix;
	
	private Integer maxExport;
	
	private Integer pageSize;
	
	private String heartbeatPrefix;
	
	private String statusPrefix;
	
	private String jdhPrefix;
	
	private Integer expiresIn;
	
	private String oldVersion;
	
	private String newVersion;
	
	private String updateUrl;
	
	private String targetUrl;
	
	private Integer batch;
	
	private String reportFilePath;  //实验室对外接口提供电子报告路径是查询使用
	
	public Integer getBatch() {
		return batch;
	}

	public void setBatch(Integer batch) {
		this.batch = batch;
	}

	public String getJzImage() {
    
        return jzImage;
    }

    public void setJzImage(String jzImage) {
    
        this.jzImage = jzImage;
    }

    public Integer getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(Integer expiresIn) {
		this.expiresIn = expiresIn;
	}

	public String getStatusPrefix() {
		return statusPrefix;
	}

	public void setStatusPrefix(String statusPrefix) {
		this.statusPrefix = statusPrefix;
	}

	public String getHeartbeatPrefix() {
		return heartbeatPrefix;
	}

	public void setHeartbeatPrefix(String heartbeatPrefix) {
		this.heartbeatPrefix = heartbeatPrefix;
	}

	public Integer getServerId() {
		return serverId;
	}

	public void setServerId(Integer serverId) {
		this.serverId = serverId;
	}

	public String getCharset() {
		return charset;
	}

	public void setCharset(String charset) {
		this.charset = charset;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public void setCommons(String commons) {
		this.commons = commons;
	}

	public void setLogClient(String logClient) {
		this.logClient = logClient;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getLogName() {
		return logName;
	}

	public String getCommons() {
		return commons;
	}

	public String getLogClient() {
		return logClient;
	}

	public String getDomain() {
		return domain;
	}

	public String getIce() {
		return ice;
	}

	public void setIce(String ice) {
		this.ice = ice;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getAdjustImage() {
		return adjustImage;
	}

	public void setAdjustImage(String adjustImage) {
		this.adjustImage = adjustImage;
	}

	public String getPotImage() {
		return potImage;
	}

	public void setPotImage(String potImage) {
		this.potImage = potImage;
	}

	public String getDictPrefix() {
		return dictPrefix;
	}

	public void setDictPrefix(String dictPrefix) {
		this.dictPrefix = dictPrefix;
	}

	public Integer getMaxExport() {
		return maxExport;
	}

	public void setMaxExport(Integer maxExport) {
		this.maxExport = maxExport;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	
	public String getSysRelPrefix() {
		return sysRelPrefix;
	}

	public void setSysRelPrefix(String sysRelPrefix) {
		this.sysRelPrefix = sysRelPrefix;
	}

	public String getOldVersion() {
		return oldVersion;
	}

	public void setOldVersion(String oldVersion) {
		this.oldVersion = oldVersion;
	}

	public String getNewVersion() {
		return newVersion;
	}

	public void setNewVersion(String newVersion) {
		this.newVersion = newVersion;
	}

	public String getUpdateUrl() {
		return updateUrl;
	}

	public void setUpdateUrl(String updateUrl) {
		this.updateUrl = updateUrl;
	}

	public String getTargetUrl() {
		return targetUrl;
	}

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
	}
	
	public String getJdhPrefix() {
		return jdhPrefix;
	}

	public void setJdhPrefix(String jdhPrefix) {
		this.jdhPrefix = jdhPrefix;
	}

	public String getReportFilePath() {
		return reportFilePath;
	}

	public void setReportFilePath(String reportFilePath) {
		this.reportFilePath = reportFilePath;
	}

	public String getRecordFile() {
		return recordFile;
	}

	public void setRecordFile(String recordFile) {
		this.recordFile = recordFile;
	}
	
}
