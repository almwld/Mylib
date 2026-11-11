package bf;

import Cf.P3;
import Dc.W5;
import Gf.C1008o1;
import Gf.C1024u0;
import Gf.C1026v;
import Gf.F1;
import Gf.G1;
import Gf.M1;
import Gf.Y1;
import Gf.Z1;
import Vc.C2163v;
import com.google.firebase.messaging.SendException;
import com.moonshot.kimichat.push.PushMessageReceiver;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mf.C4000b;
import ng.C4068d;
import tg.C4524h;
import ub.AbstractC4646k5;
import ub.AbstractC4664m5;
import ug.C4816f;
import yd.H0;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class S implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ P3 b;

    public /* synthetic */ S(P3 p3, int i) {
        this.a = i;
        this.b = p3;
    }

    public final Object invoke() {
        int i = this.a;
        C1008o1 c1008o1 = C1008o1.a;
        C1024u0 c1024u0 = C1024u0.a;
        P3 p3 = this.b;
        switch (i) {
            case 0:
                C1026v c1026vA = C1026v.a(p3.l());
                Intrinsics.checkNotNullParameter(c1026vA, "<set-?>");
                p3.d0.setValue(c1026vA);
                return Unit.a;
            case 1:
                if (!p3.m().a && (!p3.m().g.a || p3.m().g.b)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                p3.F0(false);
                return Unit.a;
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                return Boolean.valueOf(p3.J());
            case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                p3.y0.g(new F1(null, null, false, null, 63));
                return Unit.a;
            case 5:
                C2163v c2163v = ((G1) ((C4068d) p3.y0.c).a.getValue()).a;
                return Boolean.valueOf((c2163v != null ? AbstractC4646k5.v(c2163v) : 0) > 0);
            case 6:
                H0.x(new zj.d(1022, ((M1) ((C4068d) p3.y0.b).a.getValue()).b.c, (String) null, (String) null, (String) null, false));
                return Unit.a;
            case 7:
                W5 w5 = p3.y0;
                M1 m1 = new M1();
                w5.getClass();
                Intrinsics.checkNotNullParameter(m1, "<set-?>");
                ((C4068d) w5.b).setValue(m1);
                return Unit.a;
            case PushMessageReceiver.$stable /* 8 */:
                C2163v c2163v2 = ((G1) ((C4068d) p3.y0.c).a.getValue()).a;
                return Integer.valueOf(c2163v2 != null ? AbstractC4646k5.v(c2163v2) : 0);
            case 9:
                p3.y0.h(new G1());
                return Unit.a;
            case 10:
                W5 w52 = p3.y0;
                M1 m12 = new M1();
                w52.getClass();
                Intrinsics.checkNotNullParameter(m12, "<set-?>");
                ((C4068d) w52.b).setValue(m12);
                return Unit.a;
            case 11:
                p3.y0.j(false);
                return Unit.a;
            case 12:
                Ae.f fVar = Ae.f.a;
                ArrayList arrayListB = Ae.f.b(p3.p().a);
                Z1 z1F = p3.F();
                z1F.getClass();
                return (!(z1F instanceof Y1) || arrayListB.isEmpty()) ? kotlin.collections.I.a : kotlin.collections.y.c(new C4000b(60, 48, new k1.c(new ef.k(Ae.f.b(p3.p().a).size()), true, 2128448877), new S(p3, 13), 8));
            case 13:
                p3.y0.j(true);
                return Unit.a;
            case 14:
                if (p3.n() != null) {
                    C4816f c4816fN = p3.n();
                    Intrinsics.d(c4816fN);
                    return c4816fN.h;
                }
                C4524h c4524h = C4524h.a;
                String strB = p3.p().g().b();
                c4524h.getClass();
                return C4524h.e(strB);
            case 15:
                return Boolean.valueOf(!p3.m().c && (!p3.m().e || p3.q().b().length() > 0) && !AbstractC4646k5.q(p3.p().d(), false));
            case 16:
                Pc.v vVarB = AbstractC4664m5.b(p3.p());
                if (p3.J0()) {
                    return null;
                }
                return vVarB;
            case 17:
                p3.y0.j(false);
                return Unit.a;
            case 18:
                ((C4068d) p3.N0.b).setValue(null);
                return Unit.a;
            case 19:
                Z1 z1F2 = p3.F();
                z1F2.getClass();
                return Boolean.valueOf(z1F2 instanceof Y1);
            case 20:
                return p3.j().a;
            case 21:
                return Boolean.valueOf(p3.N());
            case 22:
                p3.u0(c1024u0);
                return Unit.a;
            case 23:
                p3.a0.setValue(Boolean.TRUE);
                return Unit.a;
            case 24:
                p3.a0.setValue(Boolean.FALSE);
                return Unit.a;
            case 25:
                p3.g0.t(c1008o1);
                p3.u0(c1024u0);
                return Unit.a;
            case 26:
                p3.u0(c1024u0);
                return Unit.a;
            case 27:
                p3.u0(c1024u0);
                return Unit.a;
            case 28:
                p3.g0.t(c1008o1);
                p3.u0(c1024u0);
                return Unit.a;
            default:
                return Boolean.valueOf(!p3.U());
        }
    }
}
