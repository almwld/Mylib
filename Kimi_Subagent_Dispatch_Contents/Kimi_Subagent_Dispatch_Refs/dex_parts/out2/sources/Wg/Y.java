package Wg;

import Aj.t0;
import Gf.C0966a1;
import Oh.y0;
import c1.h1;
import java.util.List;
import je.C3667Z;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ng.C4068d;
import nh.AbstractC4079a;
import ub.AbstractC4566b6;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y implements gl.m {
    public final /* synthetic */ List a;
    public final /* synthetic */ ro.G b;
    public final /* synthetic */ C4068d c;
    public final /* synthetic */ List d;
    public final /* synthetic */ float e;
    public final /* synthetic */ t0 f;
    public final /* synthetic */ C2245w g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ Function1 i;

    public Y(List list, ro.G g, C4068d c4068d, List list2, float f, t0 t0Var, C2245w c2245w, Function2 function2, Function1 function1) {
        this.a = list;
        this.b = g;
        this.c = c4068d;
        this.d = list2;
        this.e = f;
        this.f = t0Var;
        this.g = c2245w;
        this.h = function2;
        this.i = function1;
    }

    public final Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        w0.h hVar = (w0.h) obj;
        int iIntValue = ((Number) obj2).intValue();
        c1.t tVar = (c1.o) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (tVar.f(hVar) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= tVar.d(iIntValue) ? 32 : 16;
        }
        int i2 = i;
        boolean z = true;
        c1.t tVar2 = tVar;
        if (tVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            C3667Z c3667z = (C3667Z) this.a.get(iIntValue);
            tVar2.h0(1921547968);
            y0 y0VarD = c3667z.d();
            int i3 = y0VarD != null ? y0VarD.p : 0;
            y0 y0VarD2 = c3667z.d();
            int i4 = y0VarD2 != null ? y0VarD2.o : 0;
            Object objT = tVar2.T();
            Object obj5 = c1.n.a;
            if (objT == obj5) {
                objT = c1.c.r(new X(i3, i4));
                tVar2.s0(objT);
            }
            h1 h1Var = (h1) objT;
            if ((((i2 & 112) ^ 48) <= 32 || !tVar2.d(iIntValue)) && (i2 & 48) != 32) {
                z = false;
            }
            boolean zH = tVar2.h(c3667z) | z;
            Object objT2 = tVar2.T();
            if (zH || objT2 == obj5) {
                objT2 = new U(iIntValue, c3667z, h1Var, 1);
                tVar2.s0(objT2);
            }
            c1.c.j((Function0) objT2, tVar2);
            ci.s sVar = (ci.s) tVar2.j(aj.I.c);
            C4068d c4068d = this.c;
            h1 h1VarB = j0.h.b(((C3667Z) c4068d.a.getValue()) != null ? 0.0f : 0.7f, (j0.m) null, (String) null, (Function1) null, tVar2, 0, 30);
            C0966a1 c0966a1T = AbstractC4079a.t(c3667z.i(), "publishPreview-" + iIntValue, tVar2, 0);
            String str = c3667z.n;
            float f = iIntValue == 0 ? 16 : 4;
            float f2 = iIntValue == 8 ? 16 : 0;
            p1.r rVar = p1.o.a;
            p1.r rVarR = androidx.compose.foundation.layout.a.r(rVar, f, 0.0f, f2, 0.0f, 10);
            p1.r rVarA = rVar;
            if (((C3667Z) c4068d.a.getValue()) == null) {
                rVarA = w0.h.a(hVar, rVarA);
            }
            AbstractC4566b6.c(hVar, this.b, str, p1.a.a(com.moonshot.kimichat.ui.a.p(rVarR.then(rVarA), c0966a1T, null, tVar2, 0, 2), new Z(this.d, sVar, iIntValue, c3667z)), false, null, k1.h.d(-742490364, new W(this.e, c3667z, this.f, this.g, iIntValue, this.h, this.d, h1Var, this.c, this.i, h1VarB), tVar2), tVar2, (i2 & 14) | 1572864);
            tVar2.q(false);
        } else {
            tVar2.b0();
        }
        return Unit.a;
    }
}
