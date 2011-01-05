package org.jvnet.hudson.plugins.thinbackup;

import hudson.Plugin;

import java.util.logging.Logger;

public class ThinBackupPluginImpl extends Plugin {
  private static final Logger LOGGER = Logger.getLogger("hudson.plugins.thinbackup");
  private static ThinBackupPluginImpl instance = null;

  private String backupTime;
  private String backupPath;

  public ThinBackupPluginImpl() {
    instance = this;
  }

  @Override
  public void start() throws Exception {
    super.start();
    load();
    LOGGER.fine("'thinBackup' plugin initialized.");
  }

  public static ThinBackupPluginImpl getInstance() {
    return instance;
  }

  public void setBackupPath(final String backupPath) {
    this.backupPath = backupPath;
  }

  public String getBackupPath() {
    return backupPath;
  }

  public void setBackupTime(final String backupTime) {
    this.backupTime = backupTime;
  }

  public String getBackupTime() {
    return backupTime;
  }

}