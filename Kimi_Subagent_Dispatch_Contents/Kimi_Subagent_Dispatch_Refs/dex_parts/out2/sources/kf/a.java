package kf;

import Ce.O;
import Cf.P3;
import Dc.C0486d7;
import Dc.C0556l5;
import Dc.C0568n;
import Dc.C0636u5;
import Dc.C0683z7;
import Dc.Q7;
import Dc.Z6;
import Ec.x0;
import Ee.A;
import Ei.C0789x;
import Ie.C1318v;
import N1.d0;
import Qk.F;
import Qk.v;
import Sk.w;
import Ti.B0;
import W0.f1;
import W0.i0;
import W0.l3;
import Zn.L;
import a2.C;
import a2.E;
import a2.U;
import aj.AbstractC2415q;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import bc.C2424a;
import bf.C2474h;
import bf.Q;
import c1.X;
import c1.f0;
import c1.h1;
import c1.i1;
import c1.s0;
import c1.t;
import c1.z0;
import cf.C2600k;
import ci.C2638l;
import com.google.firebase.encoders.json.BuildConfig;
import ef.C3091c;
import ej.B;
import ej.C3168d1;
import ej.C3171e1;
import ej.C3174f1;
import ej.C3177g1;
import ej.D0;
import ej.EnumC3159a1;
import ej.EnumC3216u;
import ek.K;
import gf.AbstractC3384h;
import hi.C3468j;
import hi.C3479u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import je.B1;
import je.C1;
import kd.C3807z;
import kotlin.collections.CollectionsKt;
import kotlin.collections.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import p0.U0;
import t0.h0;
import t0.j0;
import t0.s;
import ub.AbstractC4551a0;
import ub.AbstractC4718s6;
import ub.AbstractC4773y7;
import ub.M4;
import ub.N5;
import vb.AbstractC4881b4;
import vb.AbstractC4887c4;
import vb.AbstractC4917h4;
import vb.AbstractC4922i3;
import vb.AbstractC4928j3;
import vb.AbstractC4960p;
import vb.AbstractC4977s;
import vb.AbstractC4987t3;
import vb.S2;
import w0.x;
import w1.P;
import y4.z;
import yd.H0;
import z0.D;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public abstract class a {
    public static final k1.c a = new k1.c(new Xg.n(10), false, 462285642);
    public static final k1.c b = new k1.c(new Xg.n(11), false, -337176139);
    public static final k1.c c = new k1.c(new Xg.n(12), false, -1267697662);

    public static final void a(Z6 z6, c1.o oVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(z6, "toolBlock");
        t tVar = (t) oVar;
        tVar.j0(1773043275);
        if ((i & 6) == 0) {
            i2 = (tVar.f(z6) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tVar.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = c1.c.z(new C1());
                tVar.s0(objT);
            }
            f0 f0Var = (f0) objT;
            String str = z6.c;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT2 = tVar.T();
            if (z || objT2 == obj) {
                objT2 = new f(z6, f0Var, null);
                tVar.s0(objT2);
            }
            c1.c.f(tVar, str, (Function2) objT2);
            boolean z2 = i3 == 4;
            Object objT3 = tVar.T();
            if (z2 || objT3 == obj) {
                C0683z7 c0683z7 = z6.i;
                if (c0683z7 == null) {
                    C0683z7.Companion.getClass();
                    c0683z7 = C0683z7.d;
                }
                objT3 = (Q7) CollectionsKt.firstOrNull(c0683z7.b);
                tVar.s0(objT3);
            }
            Q7 q7 = (Q7) objT3;
            if (q7 == null) {
                tVar.h0(1224883229);
                AbstractC3384h.c(tVar, 0);
                tVar.q(false);
            } else {
                tVar.h0(1224918445);
                FillElement fillElement = androidx.compose.foundation.layout.d.c;
                s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar, 0);
                int iHashCode = Long.hashCode(tVar.T);
                s0 s0VarL = tVar.l();
                p1.r rVarD = p1.a.d(tVar, fillElement);
                P1.k.R0.getClass();
                P1.i iVar = P1.j.b;
                if (tVar.a == null) {
                    c1.c.v();
                    throw null;
                }
                tVar.l0();
                if (tVar.S) {
                    tVar.k(iVar);
                } else {
                    tVar.v0();
                }
                c1.c.G(tVar, sVarA, P1.j.f);
                c1.c.G(tVar, s0VarL, P1.j.e);
                P1.h hVar = P1.j.g;
                if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                    A8.b.r(iHashCode, tVar, iHashCode, hVar);
                }
                c1.c.G(tVar, rVarD, P1.j.d);
                C1 c1 = (C1) f0Var.getValue();
                B1 b1 = C1.Companion;
                p(c1, q7, tVar, 8);
                tVar.q(true);
                tVar.q(false);
            }
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new b(z6, i, 0);
        }
    }

    public static final void b(Z6 z6, c1.o oVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(z6, "toolBlock");
        t tVar = (t) oVar;
        tVar.j0(-182463701);
        if ((i & 6) == 0) {
            i2 = (tVar.f(z6) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tVar.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = c1.c.z(I.a);
                tVar.s0(objT);
            }
            f0 f0Var = (f0) objT;
            Object objT2 = tVar.T();
            if (objT2 == obj) {
                objT2 = c1.c.z(I.a);
                tVar.s0(objT2);
            }
            f0 f0Var2 = (f0) objT2;
            boolean z = (i2 & 14) == 4;
            Object objT3 = tVar.T();
            if (z || objT3 == obj) {
                objT3 = new j(z6, f0Var, f0Var2, null);
                tVar.s0(objT3);
            }
            c1.c.f(tVar, z6, (Function2) objT3);
            FillElement fillElement = androidx.compose.foundation.layout.d.c;
            d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode = Long.hashCode(tVar.T);
            s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, fillElement);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar.a == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            Object objT4 = tVar.T();
            if (objT4 == obj) {
                objT4 = new C3807z(16);
                tVar.s0(objT4);
            }
            z0.b bVarB = D.b(1, (Function0) objT4, tVar, 390, 2);
            AbstractC4987t3.b(bVarB, null, null, null, 0.0f, null, null, false, null, null, null, k1.h.d(-1456893838, new C0789x(8, f0Var, f0Var2), tVar), tVar, 0, 24576, 16382);
            p1.r rVarA = androidx.compose.foundation.layout.b.a.a(androidx.compose.foundation.layout.a.n(p1.o.a, 12), p1.c.c);
            i1 i1Var = Ui.q.a;
            float f = 2;
            C3177g1 c3177g1 = new C3177g1(new C3168d1(((Ui.g) tVar.j(i1Var)).g(), 8, ((Ui.g) tVar.j(i1Var)).u(), 0.0f, new t0.d0(f, f, f, f), 8), new C3174f1(((Ui.g) tVar.j(i1Var)).h()), new C3171e1(((Ui.e) tVar.j(Ui.q.c)).d, ((Ui.g) tVar.j(i1Var)).F(), ((Ui.g) tVar.j(i1Var)).C(), 8), false);
            Vh.e eVar = new Vh.e(23);
            Object objT5 = tVar.T();
            if (objT5 == obj) {
                objT5 = new K(16);
                tVar.s0(objT5);
            }
            B.d0(rVarA, bVarB, eVar, (Function2) objT5, c3177g1, tVar, 3072);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new b(z6, i, 2);
        }
    }

    public static final void c(Zd.B b2, Z6 z6, c1.o oVar, int i) {
        int i2;
        Z6 z62;
        Intrinsics.checkNotNullParameter(b2, "toolDefine");
        Intrinsics.checkNotNullParameter(z6, "toolBlock");
        t tVar = (t) oVar;
        tVar.j0(58939204);
        if ((i & 6) == 0) {
            i2 = (tVar.d(b2.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tVar.f(z6) ? 32 : 16;
        }
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            switch (b2.ordinal()) {
                case 15:
                    tVar.h0(-783663654);
                    z62 = z6;
                    s(null, z62, null, tVar, i2 & 112, 5);
                    tVar.q(false);
                    break;
                case 16:
                    tVar.h0(-783462743);
                    b(z6, tVar, (i2 >> 3) & 14);
                    tVar.q(false);
                    z62 = z6;
                    break;
                case 17:
                    tVar.h0(-783561540);
                    d(z6, tVar, (i2 >> 3) & 14);
                    tVar.q(false);
                    z62 = z6;
                    break;
                default:
                    tVar.h0(-783393582);
                    tVar.q(false);
                    z62 = z6;
                    break;
            }
        } else {
            z62 = z6;
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new g(b2, z62, i, 0);
        }
    }

    public static final void d(Z6 z6, c1.o oVar, int i) {
        int i2;
        t tVar = (t) oVar;
        tVar.j0(-654068278);
        if ((i & 6) == 0) {
            i2 = (tVar.f(z6) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tVar.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = c1.c.z(BuildConfig.FLAVOR);
                tVar.s0(objT);
            }
            f0 f0Var = (f0) objT;
            Object objT2 = tVar.T();
            if (objT2 == obj) {
                objT2 = c1.c.z(I.a);
                tVar.s0(objT2);
            }
            f0 f0Var2 = (f0) objT2;
            boolean z = (i2 & 14) == 4;
            Object objT3 = tVar.T();
            if (z || objT3 == obj) {
                objT3 = new l(z6, f0Var, f0Var2, null);
                tVar.s0(objT3);
            }
            c1.c.f(tVar, z6, (Function2) objT3);
            FillElement fillElement = androidx.compose.foundation.layout.d.c;
            int size = ((List) f0Var2.getValue()).size();
            Object objT4 = tVar.T();
            if (objT4 == obj) {
                objT4 = new B0(f0Var, 14);
                tVar.s0(objT4);
            }
            AbstractC4977s.c(fillElement, null, false, (Function0) objT4, size, k1.h.d(-227841401, new h(f0Var2, 2), tVar), tVar, 199686, 6);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new b(z6, i, 1);
        }
    }

    public static final void e(Z6 z6, c1.o oVar, int i) {
        int i2;
        String str;
        x0 x0VarB;
        t tVar = (t) oVar;
        tVar.j0(-624332297);
        if ((i & 6) == 0) {
            i2 = (tVar.f(z6) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tVar.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objT = tVar.T();
            X x = c1.n.a;
            if (z || objT == x) {
                C0486d7 c0486d7 = (C0486d7) CollectionsKt.firstOrNull(z6.r);
                if (c0486d7 == null || (x0VarB = c0486d7.b()) == null || (str = x0VarB.a) == null) {
                    str = BuildConfig.FLAVOR;
                }
                objT = str;
                tVar.s0(objT);
            }
            String str2 = (String) objT;
            z zVar = (z) tVar.j(aj.I.i);
            FillElement fillElement = androidx.compose.foundation.layout.d.c;
            p1.r rVarB = AbstractC4917h4.b(androidx.compose.foundation.layout.a.o(fillElement, 24, 12), AbstractC4917h4.a(0, tVar, 1), true);
            d0 d0VarD = t0.n.d(p1.c.e, false);
            int iHashCode = Long.hashCode(tVar.T);
            s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarB);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar.a == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            M8.d dVar = new M8.d((Context) tVar.j(AndroidCompositionLocals_androidKt.b));
            dVar.c = str2;
            M8.h hVarA = dVar.a();
            boolean zF = tVar.f(str2) | tVar.h(zVar);
            Object objT2 = tVar.T();
            if (zF || objT2 == x) {
                objT2 = new Vg.d(3, str2, zVar);
                tVar.s0(objT2);
            }
            x8.k.e(hVarA, (String) null, AbstractC2415q.A(7, tVar, (Function0) objT2, fillElement, false), a, (gl.m) null, (gl.m) null, (Function1) null, (Function1) null, (p1.e) null, N1.q.f, tVar, 24624, 48, 63464);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new b(z6, i, 4);
        }
    }

    public static final void f(Zd.B b2, Z6 z6, c1.o oVar, int i) {
        int i2;
        Z6 z62;
        Intrinsics.checkNotNullParameter(b2, "toolDefine");
        Intrinsics.checkNotNullParameter(z6, "toolBlock");
        t tVar = (t) oVar;
        tVar.j0(590839012);
        if ((i & 6) == 0) {
            i2 = (tVar.d(b2.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tVar.f(z6) ? 32 : 16;
        }
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            FillElement fillElement = androidx.compose.foundation.layout.d.c;
            s sVarA = t0.r.a(t0.j.e, p1.c.n, tVar, 54);
            int iHashCode = Long.hashCode(tVar.T);
            s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, fillElement);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar.a == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, sVarA, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            switch (b2.ordinal()) {
                case 33:
                    z62 = z6;
                    tVar.h0(1097087782);
                    e(z62, tVar, (i2 >> 3) & 14);
                    tVar.q(false);
                    break;
                case 34:
                case 35:
                    z62 = z6;
                    tVar.h0(1097091462);
                    g(z62, tVar, (i2 >> 3) & 14);
                    tVar.q(false);
                    break;
                case 36:
                    tVar.h0(1097093818);
                    z62 = z6;
                    s(null, z62, null, tVar, i2 & 112, 5);
                    tVar.q(false);
                    break;
                default:
                    tVar.h0(-349766830);
                    tVar.q(false);
                    z62 = z6;
                    break;
            }
            tVar.q(true);
        } else {
            z62 = z6;
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new g(b2, z62, i, 1);
        }
    }

    public static final void g(Z6 z6, c1.o oVar, int i) {
        int i2;
        t tVar;
        String str;
        x0 x0VarB;
        p1.r rVar;
        Zn.f fVar;
        F f = F.a;
        t tVar2 = (t) oVar;
        tVar2.j0(1520134848);
        c1.d dVar = tVar2.a;
        if ((i & 6) == 0) {
            i2 = i | (tVar2.f(z6) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (tVar2.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objT = tVar2.T();
            X x = c1.n.a;
            if (z || objT == x) {
                C0486d7 c0486d7 = (C0486d7) CollectionsKt.firstOrNull(z6.r);
                if (c0486d7 == null || (x0VarB = c0486d7.b()) == null || (str = x0VarB.a) == null) {
                    str = BuildConfig.FLAVOR;
                }
                objT = str;
                tVar2.s0(objT);
            }
            String str2 = (String) objT;
            Object objT2 = tVar2.T();
            if (objT2 == x) {
                objT2 = c1.c.r(new C3479u(str2, 5));
                tVar2.s0(objT2);
            }
            h1 h1Var = (h1) objT2;
            Object objT3 = tVar2.T();
            if (objT3 == x) {
                objT3 = c1.c.o(kotlin.coroutines.g.a, tVar2);
                tVar2.s0(objT3);
            }
            Mm.B b2 = (Mm.B) objT3;
            boolean zH = tVar2.h(b2) | tVar2.f(str2);
            Object objT4 = tVar2.T();
            if (zH || objT4 == x) {
                objT4 = new D0(15, b2, str2);
                tVar2.s0(objT4);
            }
            c1.c.d(z6, (Function1) objT4, tVar2);
            p1.r rVar2 = p1.o.a;
            p1.r rVarN = androidx.compose.foundation.layout.d.n(rVar2, 56);
            p1.j jVar = p1.c.e;
            d0 d0VarD = t0.n.d(jVar, false);
            int iHashCode = Long.hashCode(tVar2.T);
            s0 s0VarL = tVar2.l();
            p1.r rVarD = p1.a.d(tVar2, rVarN);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (dVar == null) {
                c1.c.v();
                throw null;
            }
            tVar2.l0();
            if (tVar2.S) {
                tVar2.k(iVar);
            } else {
                tVar2.v0();
            }
            P1.h hVar = P1.j.f;
            c1.c.G(tVar2, d0VarD, hVar);
            P1.h hVar2 = P1.j.e;
            c1.c.G(tVar2, s0VarL, hVar2);
            P1.h hVar3 = P1.j.g;
            if (tVar2.S || !Intrinsics.b(tVar2.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar2, iHashCode, hVar3);
            }
            P1.h hVar4 = P1.j.d;
            c1.c.G(tVar2, rVarD, hVar4);
            FillElement fillElement = androidx.compose.foundation.layout.d.c;
            Bb.b.a(Zn.n.b((Zn.f) ((Ui.j) tVar2.j(Ui.q.b)).A.a.getValue(), tVar2, 0), null, fillElement, null, null, 0.0f, null, tVar2, 432, 120);
            O o = ((yj.h) h1Var.getValue()).c;
            O o2 = O.c;
            boolean z2 = o != o2;
            boolean zF = tVar2.f(str2);
            Object objT5 = tVar2.T();
            if (zF || objT5 == x) {
                objT5 = new C3479u(str2, 6);
                tVar2.s0(objT5);
            }
            p1.r rVarA = AbstractC2415q.A(6, tVar2, (Function0) objT5, fillElement, z2);
            d0 d0VarD2 = t0.n.d(jVar, false);
            int iHashCode2 = Long.hashCode(tVar2.T);
            s0 s0VarL2 = tVar2.l();
            p1.r rVarD2 = p1.a.d(tVar2, rVarA);
            tVar2.l0();
            if (tVar2.S) {
                tVar2.k(iVar);
            } else {
                tVar2.v0();
            }
            c1.c.G(tVar2, d0VarD2, hVar);
            c1.c.G(tVar2, s0VarL2, hVar2);
            if (tVar2.S || !Intrinsics.b(tVar2.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, tVar2, iHashCode2, hVar3);
            }
            c1.c.G(tVar2, rVarD2, hVar4);
            if (((yj.h) h1Var.getValue()).d && ((yj.h) h1Var.getValue()).c == o2) {
                tVar2.h0(723613273);
                rVar = rVar2;
                B.X(androidx.compose.foundation.layout.d.n(rVar, 24), EnumC3159a1.a, ((Ui.g) tVar2.j(Ui.q.a)).F(), tVar2, 54, 0);
                tVar2.q(false);
            } else {
                rVar = rVar2;
                tVar2.h0(723776426);
                if (((yj.h) h1Var.getValue()).d) {
                    w wVar = v.a;
                    Intrinsics.checkNotNullParameter(f, "<this>");
                    fVar = (Zn.f) v.a.getValue();
                } else {
                    w wVar2 = v.a;
                    Intrinsics.checkNotNullParameter(f, "<this>");
                    fVar = (Zn.f) v.i.getValue();
                }
                AbstractC4922i3.a(Zn.n.b(fVar, tVar2, 0), null, androidx.compose.foundation.layout.d.n(rVar, 24), ((Ui.g) tVar2.j(Ui.q.a)).F(), tVar2, 432);
                tVar2.q(false);
            }
            tVar2.q(true);
            tVar2.q(true);
            t0.e.d(tVar2, androidx.compose.foundation.layout.d.f(rVar, 16));
            AbstractC4928j3.b(((yj.h) h1Var.getValue()).e, null, ((Ui.e) tVar2.j(Ui.q.c)).d, 0, 0L, 0L, 0L, null, ((Ui.g) tVar2.j(Ui.q.a)).C(), null, 0, 0, 0, tVar2, 0, 0, 65274);
            tVar = tVar2;
        } else {
            tVar = tVar2;
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new b(z6, i, 3);
        }
    }

    public static final void h(String str, String str2, List list, z zVar, c1.o oVar, int i) {
        t tVar = (t) oVar;
        tVar.j0(1807813094);
        int i2 = i | (tVar.f(str) ? 4 : 2) | (tVar.f(str2) ? 32 : 16) | (tVar.h(list) ? 256 : 128) | (tVar.h(zVar) ? 2048 : 1024);
        if (tVar.Y(i2 & 1, (i2 & 1171) != 1170)) {
            p1.r rVarD = androidx.compose.foundation.layout.d.d(p1.o.a, 1.0f);
            int i3 = i2 & 14;
            boolean zH = (i3 == 4) | tVar.h(list) | ((i2 & 112) == 32) | tVar.h(zVar);
            Object objT = tVar.T();
            if (zH || objT == c1.n.a) {
                f1 f1Var = new f1(list, str, str2, zVar, 9);
                tVar.s0(f1Var);
                objT = f1Var;
            }
            x8.k.a(str, (String) null, AbstractC2415q.A(7, tVar, (Function0) objT, rVarD, false), (p1.j) null, N1.q.f, (w1.l) null, tVar, i3 | 1572912, 1976);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Re.b(str, str2, list, zVar, i, 24);
        }
    }

    public static final void i(Z6 z6, Function0 function0, c1.o oVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(z6, "toolBlock");
        Intrinsics.checkNotNullParameter(function0, "imageClick");
        t tVar = (t) oVar;
        tVar.j0(-1007658369);
        if ((i & 6) == 0) {
            i2 = (tVar.f(z6) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tVar.h(function0) ? 32 : 16;
        }
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            z zVar = (z) tVar.j(aj.I.i);
            w0.w wVarA = x.a(tVar);
            boolean z = (i2 & 14) == 4;
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (z || objT == obj) {
                objT = S2.d(z6);
                tVar.s0(objT);
            }
            List list = (List) objT;
            FillElement fillElement = androidx.compose.foundation.layout.d.c;
            d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode = Long.hashCode(tVar.T);
            s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, fillElement);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar.a == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            w0.a aVar = new w0.a(2);
            float f = 16;
            t0.d0 d0Var = new t0.d0(f, f, f, f);
            float f2 = 4;
            t0.h hVarG = t0.j.g(f2);
            t0.h hVarG2 = t0.j.g(f2);
            boolean zH = tVar.h(list) | ((i2 & 112) == 32) | tVar.h(zVar);
            Object objT2 = tVar.T();
            if (zH || objT2 == obj) {
                objT2 = new d0.g(list, function0, zVar, 6);
                tVar.s0(objT2);
            }
            AbstractC4960p.b(aVar, fillElement, wVarA, d0Var, hVarG, hVarG2, null, false, null, (Function1) objT2, tVar, 1772592);
            com.moonshot.kimichat.ui.a.g(androidx.compose.foundation.layout.a.l(p1.o.a, -2, 0.0f, 2), wVarA, 0L, 0.0f, null, tVar, 3126);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C3091c(z6, function0, i);
        }
    }

    public static final void j(C0568n c0568n, c1.o oVar, int i) {
        C0486d7 c0486d7;
        String str;
        t tVar = (t) oVar;
        tVar.j0(-2025539499);
        int i2 = (tVar.f(c0568n) ? 4 : 2) | i;
        if (tVar.Y(i2 & 1, (i2 & 3) != 2)) {
            Z6 z6P = c0568n != null ? c0568n.p() : null;
            String str2 = (z6P == null || !z6P.d || (c0486d7 = (C0486d7) CollectionsKt.firstOrNull(z6P.r)) == null || (str = c0486d7.a) == null) ? "Error" : str;
            p1.r rVarN = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.d.c, 16);
            s sVarA = t0.r.a(t0.j.e, p1.c.n, tVar, 54);
            int iHashCode = Long.hashCode(tVar.T);
            s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarN);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar.a == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, sVarA, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            p1.o oVar2 = p1.o.a;
            p1.r rVarN2 = androidx.compose.foundation.layout.d.n(oVar2, 48);
            F f = F.a;
            w wVar = Qk.i.a;
            Intrinsics.checkNotNullParameter(f, "<this>");
            B1.c cVarB = Zn.n.b((Zn.f) Qk.i.j.getValue(), tVar, 0);
            i1 i1Var = Ui.q.a;
            i0.a(cVarB, (String) null, rVarN2, ((Ui.g) tVar.j(i1Var)).F(), tVar, 432, 0);
            t0.e.d(tVar, androidx.compose.foundation.layout.d.f(oVar2, 12));
            l3.b(str2, (p1.r) null, 0L, 0L, (e2.w) null, Ui.d.d(tVar), 0L, (l2.k) null, 0L, 0, false, 0, 0, new U(((Ui.g) tVar.j(i1Var)).F(), P8.a.j(12), e2.w.g, (e2.n) null, 0L, 3, 0, P8.a.j(16), 16613368), tVar, 0, 0, 130942);
            tVar = tVar;
            tVar.q(true);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C2474h(c0568n, i, 4);
        }
    }

    public static final void k(C0568n c0568n, c1.o oVar, int i, int i2) {
        C0568n c0568n2;
        int i3;
        String str;
        Z6 z6P;
        String str2;
        t tVar = (t) oVar;
        tVar.j0(809675565);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            c0568n2 = c0568n;
        } else {
            c0568n2 = c0568n;
            i3 = i | (tVar.f(c0568n2) ? 4 : 2);
        }
        if (tVar.Y(i3 & 1, (i3 & 3) != 2)) {
            C0568n c0568n3 = i4 != 0 ? null : c0568n2;
            boolean z = (i3 & 14) == 4;
            Object objT = tVar.T();
            if (z || objT == c1.n.a) {
                C2424a c2424a = Zd.B.b;
                if (c0568n3 == null || (z6P = c0568n3.p()) == null || (str = z6P.b) == null) {
                    str = BuildConfig.FLAVOR;
                }
                c2424a.getClass();
                objT = C2424a.k(str);
                tVar.s0(objT);
            }
            Zd.B b2 = (Zd.B) objT;
            if (b2.d()) {
                tVar.h0(508603063);
                B.C(null, tVar, 0, 1);
                tVar.q(false);
            } else {
                tVar.h0(508688003);
                switch (b2.ordinal()) {
                    case 33:
                        str2 = "drawable/okc_loading_image.webp";
                        break;
                    case 34:
                    case 35:
                        str2 = "drawable/okc_loading_audio.webp";
                        break;
                    default:
                        str2 = "drawable/okc_loading_default.webp";
                        break;
                }
                p1.r rVarN = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.d.c, 16);
                s sVarA = t0.r.a(t0.j.e, p1.c.n, tVar, 54);
                int iHashCode = Long.hashCode(tVar.T);
                s0 s0VarL = tVar.l();
                p1.r rVarD = p1.a.d(tVar, rVarN);
                P1.k.R0.getClass();
                P1.i iVar = P1.j.b;
                if (tVar.a == null) {
                    c1.c.v();
                    throw null;
                }
                tVar.l0();
                if (tVar.S) {
                    tVar.k(iVar);
                } else {
                    tVar.v0();
                }
                c1.c.G(tVar, sVarA, P1.j.f);
                c1.c.G(tVar, s0VarL, P1.j.e);
                P1.h hVar = P1.j.g;
                if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                    A8.b.r(iHashCode, tVar, iHashCode, hVar);
                }
                c1.c.G(tVar, rVarD, P1.j.d);
                p1.o oVar2 = p1.o.a;
                p1.r rVarN2 = androidx.compose.foundation.layout.d.n(oVar2, 48);
                String strB = AbstractC4881b4.b(str2);
                N1.p pVar = N1.q.f;
                H0.f(rVarN2, B.w0(strB, false, null, 0L, pVar, tVar, 196608, 478), tVar, 6);
                float f = 12;
                t0.e.d(tVar, androidx.compose.foundation.layout.d.f(oVar2, f));
                H0.f(androidx.compose.foundation.layout.d.f(androidx.compose.foundation.layout.d.s(oVar2, 160), f), B.w0(AbstractC4881b4.b("drawable/okc_loading_jindutiao.webp"), false, null, 0L, pVar, tVar, 196608, 478), tVar, 6);
                t0.e.d(tVar, androidx.compose.foundation.layout.d.f(oVar2, f));
                l3.b("Loading...", (p1.r) null, 0L, 0L, (e2.w) null, Ui.d.d(tVar), 0L, (l2.k) null, 0L, 0, false, 0, 0, new U(((Ui.g) tVar.j(Ui.q.a)).F(), P8.a.j(14), e2.w.g, (e2.n) null, 0L, 3, 0, P8.a.j(20), 16613368), tVar, 6, 0, 130942);
                tVar = tVar;
                tVar.q(true);
                tVar.q(false);
            }
            c0568n2 = c0568n3;
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1318v(c0568n2, i, i2);
        }
    }

    public static final void l(Z6 z6, c1.o oVar, int i) {
        int i2;
        String str;
        Intrinsics.checkNotNullParameter(z6, "toolBlock");
        t tVar = (t) oVar;
        tVar.j0(-1747788077);
        if ((i & 6) == 0) {
            i2 = (tVar.f(z6) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tVar.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = tVar.T();
            String str2 = BuildConfig.FLAVOR;
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = c1.c.z(BuildConfig.FLAVOR);
                tVar.s0(objT);
            }
            f0 f0Var = (f0) objT;
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objT2 = tVar.T();
            if (z || objT2 == obj) {
                objT2 = new o(z6, f0Var, null);
                tVar.s0(objT2);
            }
            c1.c.f(tVar, z6, (Function2) objT2);
            boolean z2 = i3 == 4;
            Object objT3 = tVar.T();
            if (z2 || objT3 == obj) {
                C0486d7 c0486d7 = (C0486d7) CollectionsKt.firstOrNull(z6.r);
                if (c0486d7 != null && (str = c0486d7.a) != null) {
                    str2 = str;
                }
                tVar.s0(str2);
                objT3 = str2;
            }
            String str3 = (String) objT3;
            FillElement fillElement = androidx.compose.foundation.layout.d.c;
            boolean zF = tVar.f(str3);
            Object objT4 = tVar.T();
            if (zF || objT4 == obj) {
                objT4 = new ef.i(19, str3, f0Var);
                tVar.s0(objT4);
            }
            AbstractC4977s.c(fillElement, null, false, (Function0) objT4, 0, k1.h.d(1135913782, new e(str3, f0Var, 1), tVar), tVar, 196614, 22);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new b(z6, i, 5);
        }
    }

    public static final void m(Z6 z6, c1.o oVar, int i) {
        Intrinsics.checkNotNullParameter(z6, "toolBlock");
        t tVar = (t) oVar;
        tVar.j0(-1922538743);
        int i2 = i & 1;
        if (tVar.Y(i2, i2 != 0)) {
            p1.r rVarN = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.d.c, 16);
            s sVarA = t0.r.a(t0.j.e, p1.c.n, tVar, 54);
            int iHashCode = Long.hashCode(tVar.T);
            s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarN);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar.a == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, sVarA, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            p1.o oVar2 = p1.o.a;
            p1.r rVarN2 = androidx.compose.foundation.layout.d.n(oVar2, 48);
            F f = F.a;
            w wVar = v.a;
            Intrinsics.checkNotNullParameter(f, "<this>");
            B1.c cVarB = Zn.n.b((Zn.f) v.g.getValue(), tVar, 0);
            i1 i1Var = Ui.q.a;
            Bb.b.a(cVarB, null, rVarN2, null, null, 0.0f, new w1.l(((Ui.g) tVar.j(i1Var)).F(), 5), tVar, 432, 56);
            t0.e.d(tVar, androidx.compose.foundation.layout.d.f(oVar2, 12));
            l3.b("PPT generation completed", (p1.r) null, 0L, 0L, (e2.w) null, Ui.d.d(tVar), 0L, (l2.k) null, 0L, 0, false, 0, 0, new U(((Ui.g) tVar.j(i1Var)).F(), P8.a.j(12), e2.w.g, (e2.n) null, 0L, 3, 0, P8.a.j(16), 16613368), tVar, 6, 0, 130942);
            tVar = tVar;
            tVar.q(true);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new b(z6, i, 6);
        }
    }

    public static final void n(k1.c cVar, c1.o oVar, int i) {
        t tVar = (t) oVar;
        tVar.j0(-532385526);
        if (tVar.Y(i & 1, (i & 3) != 2)) {
            FillElement fillElement = androidx.compose.foundation.layout.d.c;
            d0 d0VarD = t0.n.d(p1.c.b, false);
            int iHashCode = Long.hashCode(tVar.T);
            s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, fillElement);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar.a == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            cVar.invoke(tVar, 6);
            p1.r rVarL = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.layout.d.s(androidx.compose.foundation.layout.d.f(p1.o.a, 92), 60), 0.0f, -80, 1);
            F f = F.a;
            w wVar = Qk.z.a;
            Intrinsics.checkNotNullParameter(f, "<this>");
            Bb.b.a(Zn.n.b((Zn.f) Qk.z.M.getValue(), tVar, 0), null, rVarL, null, null, 0.0f, null, tVar, 432, 120);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new A(cVar, i, 28);
        }
    }

    public static final void o(p1.r rVar, ej.D d, C1 c1, Q7 q7, c1.o oVar, int i) {
        t tVar;
        t tVar2 = (t) oVar;
        tVar2.j0(-1506552261);
        c1.d dVar = tVar2.a;
        int i2 = i | (tVar2.f(rVar) ? 4 : 2) | (tVar2.f(d) ? 32 : 16) | (tVar2.h(c1) ? 256 : 128);
        if (tVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar2, 0);
            int iHashCode = Long.hashCode(tVar2.T);
            s0 s0VarL = tVar2.l();
            p1.r rVarD = p1.a.d(tVar2, rVar);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (dVar == null) {
                c1.c.v();
                throw null;
            }
            tVar2.l0();
            if (tVar2.S) {
                tVar2.k(iVar);
            } else {
                tVar2.v0();
            }
            P1.h hVar = P1.j.f;
            c1.c.G(tVar2, sVarA, hVar);
            P1.h hVar2 = P1.j.e;
            c1.c.G(tVar2, s0VarL, hVar2);
            P1.h hVar3 = P1.j.g;
            if (tVar2.S || !Intrinsics.b(tVar2.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar2, iHashCode, hVar3);
            }
            P1.h hVar4 = P1.j.d;
            c1.c.G(tVar2, rVarD, hVar4);
            j0 j0VarA = h0.a(t0.j.a, p1.c.k, tVar2, 48);
            int iHashCode2 = Long.hashCode(tVar2.T);
            s0 s0VarL2 = tVar2.l();
            p1.o oVar2 = p1.o.a;
            p1.r rVarD2 = p1.a.d(tVar2, oVar2);
            tVar2.l0();
            if (tVar2.S) {
                tVar2.k(iVar);
            } else {
                tVar2.v0();
            }
            c1.c.G(tVar2, j0VarA, hVar);
            c1.c.G(tVar2, s0VarL2, hVar2);
            if (tVar2.S || !Intrinsics.b(tVar2.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, tVar2, iHashCode2, hVar3);
            }
            c1.c.G(tVar2, rVarD2, hVar4);
            float f = 20;
            p1.r rVarN = androidx.compose.foundation.layout.d.n(oVar2, f);
            boolean z = (i2 & 112) == 32;
            Object objT = tVar2.T();
            Object obj = c1.n.a;
            if (z || objT == obj) {
                objT = new d(d, 1);
                tVar2.s0(objT);
            }
            p1.r rVarA = AbstractC2415q.A(7, tVar2, (Function0) objT, rVarN, false);
            B1.c cVarB = Zn.n.b(Qk.q.c(), tVar2, 0);
            i1 i1Var = Ui.q.a;
            AbstractC4922i3.a(cVarB, null, rVarA, ((Ui.g) tVar2.j(i1Var)).C(), tVar2, 48);
            w wVar = Qk.O.a;
            Intrinsics.checkNotNullParameter(F.d, "<this>");
            String strE = N5.e((L) Qk.O.q0.getValue(), tVar2, 0);
            U uA = U.a(Ui.d.c(((Ui.e) tVar2.j(Ui.q.c)).e, tVar2), 0L, 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (P) null, 3, 0L, (C) null, (l2.i) null, 0, 16744447);
            long jC = ((Ui.g) tVar2.j(i1Var)).C();
            double d2 = 1.0f;
            if (d2 <= 0.0d) {
                u0.a.a("invalid weight; must be greater than zero");
            }
            B.H(strE, new LayoutWeightElement(1.0f, true), jC, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, uA, tVar2, 0, 0, 131064);
            t0.e.d(tVar2, androidx.compose.foundation.layout.d.n(oVar2, f));
            tVar2.q(true);
            v0.v vVarA = v0.x.a(0, 0, tVar2, 0, 3);
            if (d2 <= 0.0d) {
                u0.a.a("invalid weight; must be greater than zero");
            }
            p1.r rVarR = androidx.compose.foundation.layout.a.r(new LayoutWeightElement(1.0f, true), 0.0f, 16, 0.0f, 0.0f, 13);
            d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode3 = Long.hashCode(tVar2.T);
            s0 s0VarL3 = tVar2.l();
            p1.r rVarD3 = p1.a.d(tVar2, rVarR);
            tVar2.l0();
            if (tVar2.S) {
                tVar2.k(iVar);
            } else {
                tVar2.v0();
            }
            c1.c.G(tVar2, d0VarD, hVar);
            c1.c.G(tVar2, s0VarL3, hVar2);
            if (tVar2.S || !Intrinsics.b(tVar2.T(), Integer.valueOf(iHashCode3))) {
                A8.b.r(iHashCode3, tVar2, iHashCode3, hVar3);
            }
            c1.c.G(tVar2, rVarD3, hVar4);
            FillElement fillElement = androidx.compose.foundation.layout.d.c;
            boolean z2 = (i2 & 896) == 256 || tVar2.h(c1);
            Object objT2 = tVar2.T();
            if (z2 || objT2 == obj) {
                objT2 = new e2.k(21, c1);
                tVar2.s0(objT2);
            }
            AbstractC4773y7.a(fillElement, vVarA, null, false, null, null, null, false, null, (Function1) objT2, tVar2, 6, 508);
            com.moonshot.kimichat.ui.a.i(androidx.compose.foundation.layout.a.l(oVar2, 8, 0.0f, 2), vVarA, false, ((Ui.g) tVar2.j(i1Var)).J(), 0.0f, null, tVar2, 3126, 48);
            tVar = tVar2;
            tVar.q(true);
            tVar.q(true);
        } else {
            tVar = tVar2;
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new c(rVar, d, c1, q7, i, 0);
        }
    }

    public static final void p(C1 c1, Q7 q7, c1.o oVar, int i) {
        t tVar = (t) oVar;
        tVar.j0(1174400068);
        int i2 = (tVar.h(c1) ? 4 : 2) | i | (tVar.f(q7) ? 32 : 16);
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            EnumC3216u enumC3216u = EnumC3216u.b;
            Object[] objArr = new Object[0];
            l1.k kVar = new l1.k(new E(25), new ci.v(29));
            boolean zD = tVar.d(0);
            Object objT = tVar.T();
            if (zD || objT == c1.n.a) {
                objT = new C2638l(5, enumC3216u);
                tVar.s0(objT);
            }
            float f = 30;
            t0.e.a(androidx.compose.foundation.layout.a.q(AbstractC4718s6.c(androidx.compose.foundation.layout.d.c), f, 80, f, 40), p1.c.b, false, k1.h.d(639386650, new C3468j((ej.D) l1.l.e(objArr, kVar, (Function0) objT, tVar, 0), c1, q7, 1), tVar), tVar, 3126, 4);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C2600k(c1, q7, i, 17);
        }
    }

    public static final void q(p1.r rVar, ej.D d, C1 c1, Q7 q7, c1.o oVar, int i) {
        ej.D d2;
        boolean z;
        boolean z2;
        t tVar = (t) oVar;
        tVar.j0(1257655547);
        c1.d dVar = tVar.a;
        int i2 = i | (tVar.f(rVar) ? 4 : 2) | (tVar.f(d) ? 32 : 16) | (tVar.h(c1) ? 256 : 128) | (tVar.f(q7) ? 2048 : 1024);
        if (tVar.Y(i2 & 1, (i2 & 1171) != 1170)) {
            s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar, 0);
            int iHashCode = Long.hashCode(tVar.T);
            s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVar);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (dVar == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            P1.h hVar = P1.j.f;
            c1.c.G(tVar, sVarA, hVar);
            P1.h hVar2 = P1.j.e;
            c1.c.G(tVar, s0VarL, hVar2);
            P1.h hVar3 = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar3);
            }
            P1.h hVar4 = P1.j.d;
            c1.c.G(tVar, rVarD, hVar4);
            String str = q7.a;
            U uC = Ui.d.c(AbstractC4551a0.e(tVar).e, tVar);
            long jG = AbstractC4551a0.c(tVar).g();
            float f = 16;
            p1.o oVar2 = p1.o.a;
            float f2 = 8;
            float f3 = 4;
            B.H(str, androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.a.o(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.a.r(oVar2, 0.0f, f, 0.0f, 0.0f, 13), AbstractC4551a0.c(tVar).C(), C0.f.b(f2)), f2, f3), 1.0f), jG, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, uC, tVar, 0, 0, 131064);
            double d3 = 1.0f;
            if (d3 <= 0.0d) {
                u0.a.a("invalid weight; must be greater than zero");
            }
            A8.b.p(1.0f, true, tVar);
            x8.k.a(q7.b, (String) null, androidx.compose.foundation.layout.a.n(AbstractC4887c4.a(androidx.compose.foundation.a.b(AbstractC4718s6.b(androidx.compose.foundation.layout.d.n(oVar2, 100), C0.f.b(f2)), AbstractC4551a0.c(tVar).h(), C0.f.b(f2)), (float) 0.5d, AbstractC4551a0.c(tVar).O(), C0.f.b(f2)), 12), (p1.j) null, (N1.r) null, (w1.l) null, tVar, 48, 2040);
            t0.e.d(tVar, androidx.compose.foundation.layout.d.f(oVar2, f));
            boolean zF = tVar.f(c1.q);
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (zF || objT == obj) {
                objT = M4.h(c1.q);
                tVar.s0(objT);
            }
            B.H((String) objT, null, AbstractC4551a0.c(tVar).C(), 0L, null, null, 0L, null, 0L, 2, false, 1, 0, Ui.d.c(AbstractC4551a0.e(tVar).o, tVar), tVar, 0, 24960, 110586);
            t tVar2 = tVar;
            if (q7.c.length() > 0) {
                tVar2.h0(-1652121191);
                t0.e.d(tVar2, androidx.compose.foundation.layout.d.f(oVar2, f));
                B.H(q7.c, null, AbstractC4551a0.c(tVar2).E(), 0L, null, null, 0L, null, 0L, 2, false, 2, 0, Ui.d.c(AbstractC4551a0.e(tVar2).d, tVar2), tVar2, 0, 24960, 110586);
                tVar2 = tVar2;
                z = false;
            } else {
                z = false;
                tVar2.h0(-1659800015);
            }
            tVar2.q(z);
            t0.e.d(tVar2, androidx.compose.foundation.layout.d.f(oVar2, f));
            t tVar3 = tVar2;
            com.moonshot.kimichat.ui.a.a(androidx.compose.foundation.layout.a.p(oVar2, 0.0f, 24, 1), AbstractC4551a0.c(tVar2).D(), U0.b, 0.0f, 0.0f, 0.0f, tVar3, 390);
            p1.i iVar2 = p1.c.k;
            p1.r rVarR = androidx.compose.foundation.layout.a.r(oVar2, 0.0f, 0.0f, 0.0f, f2, 7);
            j0 j0VarA = h0.a(t0.j.a, iVar2, tVar3, 48);
            int iHashCode2 = Long.hashCode(tVar3.T);
            s0 s0VarL2 = tVar3.l();
            p1.r rVarD2 = p1.a.d(tVar3, rVarR);
            tVar3.l0();
            if (tVar3.S) {
                tVar3.k(iVar);
            } else {
                tVar3.v0();
            }
            c1.c.G(tVar3, j0VarA, hVar);
            c1.c.G(tVar3, s0VarL2, hVar2);
            if (tVar3.S || !Intrinsics.b(tVar3.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, tVar3, iHashCode2, hVar3);
            }
            c1.c.G(tVar3, rVarD2, hVar4);
            w wVar = Qk.q.a;
            Intrinsics.checkNotNullParameter(F.a, "<this>");
            AbstractC4922i3.a(Zn.n.b((Zn.f) Qk.q.z.getValue(), tVar3, 0), null, androidx.compose.foundation.layout.d.f(oVar2, f), AbstractC4551a0.c(tVar3).C(), tVar3, 432);
            if (d3 <= 0.0d) {
                u0.a.a("invalid weight; must be greater than zero");
            }
            A8.b.p(1.0f, true, tVar3);
            w wVar2 = Qk.O.a;
            Intrinsics.checkNotNullParameter(F.d, "<this>");
            String strE = N5.e((L) Qk.O.q0.getValue(), tVar3, 0);
            U uC2 = Ui.d.c(AbstractC4551a0.e(tVar3).i, tVar3);
            long jG2 = AbstractC4551a0.c(tVar3).g();
            boolean z3 = (i2 & 112) == 32;
            Object objT2 = tVar3.T();
            if (z3 || objT2 == obj) {
                d2 = d;
                z2 = false;
                objT2 = new d(d2, 0);
                tVar3.s0(objT2);
            } else {
                d2 = d;
                z2 = false;
            }
            B.H(strE, androidx.compose.foundation.layout.a.o(androidx.compose.foundation.a.b(AbstractC2415q.A(7, tVar3, (Function0) objT2, oVar2, z2), AbstractC4551a0.c(tVar3).C(), C0.f.b(f2)), f2, f3), jG2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, uC2, tVar3, 0, 0, 131064);
            tVar = tVar3;
            tVar.q(true);
            tVar.q(true);
        } else {
            d2 = d;
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new c(rVar, d2, c1, q7, i, 5);
        }
    }

    public static final void r(Z6 z6, c1.o oVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(z6, "toolBlock");
        t tVar = (t) oVar;
        tVar.j0(1431918337);
        if ((i & 6) == 0) {
            i2 = (tVar.f(z6) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tVar.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = c1.c.z(BuildConfig.FLAVOR);
                tVar.s0(objT);
            }
            f0 f0Var = (f0) objT;
            boolean z = (i2 & 14) == 4;
            Object objT2 = tVar.T();
            if (z || objT2 == obj) {
                objT2 = new r(z6, f0Var, null);
                tVar.s0(objT2);
            }
            c1.c.f(tVar, z6, (Function2) objT2);
            FillElement fillElement = androidx.compose.foundation.layout.d.c;
            Object objT3 = tVar.T();
            if (objT3 == obj) {
                objT3 = new B0(f0Var, 15);
                tVar.s0(objT3);
            }
            AbstractC4977s.c(fillElement, null, false, (Function0) objT3, 0, k1.h.d(-352788444, new h(f0Var, 3), tVar), tVar, 199686, 22);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new b(z6, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(p1.r r19, Dc.Z6 r20, java.lang.String r21, c1.o r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.a.s(p1.r, Dc.Z6, java.lang.String, c1.o, int, int):void");
    }

    public static final void t(P3 p3, Z6 z6, c1.o oVar, int i) {
        Intrinsics.checkNotNullParameter(p3, "model");
        Intrinsics.checkNotNullParameter(z6, "toolBlock");
        t tVar = (t) oVar;
        tVar.j0(1327339896);
        int i2 = (tVar.f(p3) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tVar.f(z6) ? 32 : 16;
        }
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objT = tVar.T();
            X x = c1.n.a;
            Object obj = objT;
            if (z || objT == x) {
                List list = z6.r;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    C0556l5 c0556l5 = ((C0486d7) obj2).d;
                    if (c0556l5 != null) {
                        if (c0556l5 == null) {
                            C0556l5.Companion.getClass();
                            c0556l5 = C0556l5.e;
                        }
                        if (c0556l5.b != null) {
                            arrayList.add(obj2);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.A.t(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0556l5 c0556l52 = ((C0486d7) it.next()).d;
                    if (c0556l52 == null) {
                        C0556l5.Companion.getClass();
                        c0556l52 = C0556l5.e;
                    }
                    arrayList2.add(c0556l52.a());
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    if (((C0636u5) obj3).b.length() > 0) {
                        arrayList3.add(obj3);
                    }
                }
                tVar.s0(arrayList3);
                obj = arrayList3;
            }
            List list2 = (List) obj;
            String str = ((Q) tVar.j(aj.I.l)).a;
            v0.v vVarA = v0.x.a(0, 0, tVar, 0, 3);
            FillElement fillElement = androidx.compose.foundation.layout.d.c;
            d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode = Long.hashCode(tVar.T);
            s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, fillElement);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar.a == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            boolean zH = tVar.h(list2) | ((i2 & 14) == 4) | tVar.f(str);
            Object objT2 = tVar.T();
            if (zH || objT2 == x) {
                objT2 = new d0.g(list2, p3, str, 7);
                tVar.s0(objT2);
            }
            AbstractC4773y7.a(fillElement, vVarA, null, false, null, null, null, false, null, (Function1) objT2, tVar, 6, 508);
            com.moonshot.kimichat.ui.a.i(androidx.compose.foundation.layout.a.l(p1.o.a, -2, 0.0f, 2), vVarA, true, ((Ui.g) tVar.j(Ui.q.a)).J(), 0.0f, null, tVar, 3126, 48);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C3091c(p3, z6, i, 7);
        }
    }
}
