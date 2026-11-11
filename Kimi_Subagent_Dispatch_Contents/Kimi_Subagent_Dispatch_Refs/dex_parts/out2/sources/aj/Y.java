package aj;

import com.moonshot.kimichat.KimiApplication;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends p1.q implements P1.q {
    public int o;
    public Function1 p;
    public long q;

    public final void g(P1.j0 j0Var) {
        Intrinsics.checkNotNullParameter(j0Var, "coordinates");
        KimiApplication kimiApplication = Pf.B.a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.q > this.o) {
            this.q = jCurrentTimeMillis;
            this.p.invoke(j0Var);
        }
    }
}
