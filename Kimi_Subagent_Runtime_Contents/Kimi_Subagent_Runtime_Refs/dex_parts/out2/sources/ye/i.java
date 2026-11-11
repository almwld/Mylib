package ye;

import Fh.W;
import Mm.C;
import Mm.E;
import Mm.y0;
import com.google.firebase.messaging.ServiceStarter;
import dg.C2978a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ue.C4801l;
import ze.T;
import ze.a0;
import ze.b0;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class i implements b0 {
    public C4801l b;
    public y0 c;
    public Map a = new LinkedHashMap();
    public final Dm.o d = new Dm.o(ServiceStarter.ERROR_UNKNOWN);

    @Override // ze.b0
    public final void a(C4801l c4801l, a0 a0Var) {
        Intrinsics.checkNotNullParameter(c4801l, "service");
        Intrinsics.checkNotNullParameter(a0Var, "streamEvent");
        this.b = c4801l;
        if (a0Var instanceof T) {
            T t = (T) a0Var;
            E.z(c4801l.e, (CoroutineContext) null, (C) null, new C5733h(this, t.b, t.c, null), 3);
        }
    }

    public final void b(boolean z) {
        if (z && this.d.c()) {
            return;
        }
        C4801l c4801l = this.b;
        if (c4801l == null) {
            Intrinsics.l("service");
            throw null;
        }
        Map map = this.a;
        Intrinsics.checkNotNullParameter(map, "taskMessages");
        c4801l.k.j(map);
        boolean z2 = C2978a.a;
        C2978a.a("StreamServiceImpl", null, new W(map, 2));
    }
}
