package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.evernote.android.job.C0180c;
import com.evernote.android.job.C0190e;
import com.evernote.android.job.C0200i;
import com.evernote.android.job.C0202k;
import com.evernote.android.job.C0205m;
import com.evernote.android.job.p005a.C0174d;

@TargetApi(21)
public class PlatformJobService extends JobService {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C0174d f750a = new C0174d("PlatformJobService");

    /* access modifiers changed from: private */
    @TargetApi(26)
    /* renamed from: a */
    public Bundle m908a(JobParameters jobParameters) {
        return Build.VERSION.SDK_INT >= 26 ? jobParameters.getTransientExtras() : Bundle.EMPTY;
    }

    public boolean onStartJob(final JobParameters jobParameters) {
        C0190e.m704h().execute(new Runnable() {
            public void run() {
                C0174d a;
                String str;
                Object[] objArr;
                try {
                    C0202k.C0203a aVar = new C0202k.C0203a((Service) PlatformJobService.this, PlatformJobService.f750a, jobParameters.getJobId());
                    C0205m a2 = aVar.mo660a(true, false);
                    if (a2 != null) {
                        if (a2.mo663B()) {
                            if (C0223b.m928b(PlatformJobService.this, a2)) {
                                if (Build.VERSION.SDK_INT >= 26) {
                                    a = PlatformJobService.f750a;
                                    str = "PendingIntent for transient bundle is not null although running on O, using compat mode, request %s";
                                    objArr = new Object[]{a2};
                                }
                            } else if (Build.VERSION.SDK_INT < 26) {
                                a = PlatformJobService.f750a;
                                str = "PendingIntent for transient job %s expired";
                                objArr = new Object[]{a2};
                            }
                            a.mo572b(str, objArr);
                        }
                        aVar.mo661h(a2);
                        aVar.mo659a(a2, PlatformJobService.this.m908a(jobParameters));
                        PlatformJobService.this.jobFinished(jobParameters, false);
                    }
                } finally {
                    PlatformJobService.this.jobFinished(jobParameters, false);
                }
            }
        });
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        C0180c a = C0200i.m735a((Context) this).mo643a(jobParameters.getJobId());
        if (a != null) {
            a.mo596l();
            f750a.mo572b("Called onStopJob for %s", a);
            return false;
        }
        f750a.mo572b("Called onStopJob, job %d not found", Integer.valueOf(jobParameters.getJobId()));
        return false;
    }
}
