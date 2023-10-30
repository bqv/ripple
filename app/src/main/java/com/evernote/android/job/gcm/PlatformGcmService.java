package com.evernote.android.job.gcm;

import com.evernote.android.job.util.JobCat;
import com.google.android.gms.gcm.GcmTaskService;

public class PlatformGcmService extends GcmTaskService {
   private static final JobCat CAT = new JobCat("PlatformGcmService");
}
