package Y0;

import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityManager$AccessibilityServicesStateChangeListener;
import c1.C1007c;
import c1.C1030n0;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y implements AccessibilityManager$AccessibilityServicesStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1030n0 f10283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1030n0 f10284b;

    public Y(a0 a0Var) {
        Boolean bool = Boolean.FALSE;
        this.f10283a = C1007c.z(bool);
        this.f10284b = C1007c.z(bool);
    }

    public final void onAccessibilityServicesStateChanged(AccessibilityManager accessibilityManager) {
        this.f10283a.setValue(Boolean.valueOf(a0.c(accessibilityManager)));
        this.f10284b.setValue(Boolean.valueOf(a0.e(accessibilityManager)));
    }
}
