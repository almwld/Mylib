package Q1;

import android.view.Choreographer;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z f6880a;

    public Y(Z z10) {
        this.f6880a = z10;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        this.f6880a.f6887d.removeCallbacks(this);
        Z.t0(this.f6880a);
        Z z10 = this.f6880a;
        synchronized (z10.f6888e) {
            if (z10.f6893j) {
                z10.f6893j = false;
                ArrayList arrayList = z10.f6890g;
                z10.f6890g = z10.f6891h;
                z10.f6891h = arrayList;
                int size = arrayList.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((Choreographer.FrameCallback) arrayList.get(i4)).doFrame(j2);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Z.t0(this.f6880a);
        Z z10 = this.f6880a;
        synchronized (z10.f6888e) {
            try {
                if (z10.f6890g.isEmpty()) {
                    z10.f6886c.removeFrameCallback(this);
                    z10.f6893j = false;
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
