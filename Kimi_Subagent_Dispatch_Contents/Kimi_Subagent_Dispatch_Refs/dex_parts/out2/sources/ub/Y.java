package ub;

import Ee.C0738b;
import Gf.AbstractC0976e;
import Gf.C0967b;
import Gf.C0973d;
import Ie.C1305o;
import Jg.C1350o;
import aj.AbstractC2415q;
import android.net.Uri;
import androidx.compose.foundation.layout.FillElement;
import ej.EnumC3159a1;
import fj.AbstractC3299a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import je.AbstractC3662U;
import je.C3659Q;
import je.C3661T;
import je.C3663V;
import je.C3665X;
import je.C3667Z;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ng.C4068d;
import vb.AbstractC4887c4;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public abstract class Y {
    public static final void a(Cf.P3 p3, Function1 function1, c1.o oVar, int i, int i2) {
        int i3;
        Function1 function12;
        Function1 function13;
        Intrinsics.checkNotNullParameter(p3, "model");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(172875139);
        int i4 = (tVar.f(p3) ? 4 : 2) | i;
        int i5 = i4 | 48;
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 = i4 | 432;
        } else {
            i3 = i5 | (tVar.h(function1) ? 256 : 128);
        }
        if (tVar.Y(i3 & 1, (i3 & 147) != 146)) {
            Object obj = c1.n.a;
            if (i6 != 0) {
                Object objT = tVar.T();
                if (objT == obj) {
                    objT = new Rg.n(27);
                    tVar.s0(objT);
                }
                function13 = (Function1) objT;
            } else {
                function13 = function1;
            }
            AbstractC0976e abstractC0976eH = p3.h();
            if (abstractC0976eH instanceof C0967b) {
                tVar.h0(457677191);
                C0967b c0967b = (C0967b) abstractC0976eH;
                boolean z = (i3 & 14) == 4;
                Object objT2 = tVar.T();
                if (z || objT2 == obj) {
                    objT2 = new Af.a(p3, 22);
                    tVar.s0(objT2);
                }
                c(c0967b, (Function0) objT2, tVar, 48);
            } else {
                tVar.h0(453071583);
            }
            tVar.q(false);
            boolean zQ = p3.Q();
            AbstractC3662U abstractC3662UG = ((C3667Z) p3.i0.a.getValue()).g();
            boolean z2 = ((i3 & 14) == 4) | ((i3 & 896) == 256);
            Object objT3 = tVar.T();
            if (z2 || objT3 == obj) {
                objT3 = new Ue.a(p3, function13, 0);
                tVar.s0(objT3);
            }
            b(zQ, abstractC3662UG, p3, (Function1) objT3, tVar, (i3 << 6) & 896);
            function12 = function13;
        } else {
            tVar.b0();
            function12 = function1;
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Af.f(p3, function12, i, i2, 21);
        }
    }

    public static final void b(boolean z, AbstractC3662U abstractC3662U, Cf.P3 p3, Function1 function1, c1.o oVar, int i) {
        int i2;
        c1.t tVar = (c1.t) oVar;
        tVar.j0(1055201518);
        if ((i & 6) == 0) {
            i2 = (tVar.g(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? tVar.f(abstractC3662U) : tVar.h(abstractC3662U) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tVar.f(p3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tVar.h(function1) ? 2048 : 1024;
        }
        if (tVar.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Function1 function12 = (Function1) tVar.j(aj.I.j);
            Q1.U0 u0 = (Q1.U0) tVar.j(Q1.w0.p);
            fj.D dL = AbstractC3299a.l(p3.h() instanceof C0973d, 0.0f, null, tVar, 0, 126);
            c1.i1 i1Var = Ui.q.a;
            long j = ((Ui.g) tVar.j(i1Var)).j();
            long jV = ((Ui.g) tVar.j(i1Var)).v();
            boolean zF = ((i2 & 896) == 256) | tVar.f(u0) | ((i2 & 7168) == 2048);
            Object objT = tVar.T();
            if (zF || objT == c1.n.a) {
                C1350o c1350o = new C1350o((Object) u0, (Object) p3, (Object) function1, 26, (byte) 0);
                tVar.s0(c1350o);
                objT = c1350o;
            }
            AbstractC3299a.c(null, dL, j, jV, null, null, (Function0) objT, k1.h.d(1360132762, new Ng.f(p3, abstractC3662U, z, function12, function1), tVar), tVar, 12582912, 49);
            tVar = tVar;
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1305o(z, (Object) abstractC3662U, (Object) p3, (Sk.g) function1, i, 6);
        }
    }

    public static final void c(C0967b c0967b, Function0 function0, c1.o oVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(c0967b, "askKimiState");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-1495542696);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? tVar.f(c0967b) : tVar.h(c0967b) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? tVar.f((Object) null) : tVar.h((Object) null) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tVar.h(function0) ? 256 : 128;
        }
        if (tVar.Y(i2 & 1, (i2 & 147) != 146)) {
            Function1 function1 = (Function1) tVar.j(aj.I.j);
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && tVar.h(c0967b))) | ((i2 & 896) == 256);
            Object objT = tVar.T();
            if (z || objT == c1.n.a) {
                objT = new Qg.a(20, c0967b, function0);
                tVar.s0(objT);
            }
            Function0 function02 = (Function0) objT;
            AbstractC3299a.b(true, function02, false, false, false, 0.0f, k1.h.d(1131543952, new C0738b(function1, c0967b, function02, 22), tVar), tVar, 12779526, 90);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Af.f(c0967b, function0, i, 22);
        }
    }

    public static final void d(Cf.P3 p3, AbstractC3662U abstractC3662U, Oh.y0 y0Var, boolean z, yf.i iVar, Function1 function1, Function0 function0, c1.o oVar, int i) {
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-1419738177);
        c1.d dVar = tVar.a;
        int i2 = i | (tVar.f(abstractC3662U) ? 32 : 16) | (tVar.h(y0Var) ? 256 : 128) | (tVar.g(z) ? 2048 : 1024) | (tVar.d(iVar.ordinal()) ? 16384 : 8192) | (tVar.h(function0) ? 1048576 : 524288);
        if (tVar.Y(i2 & 1, (599185 & i2) != 599184)) {
            p1.o oVar2 = p1.o.a;
            p1.r rVarD = androidx.compose.foundation.layout.d.d(oVar2, 1.0f);
            t0.s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar, 0);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD2 = p1.a.d(tVar, rVarD);
            P1.k.R0.getClass();
            P1.i iVar2 = P1.j.b;
            if (dVar == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar2);
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
            c1.c.G(tVar, rVarD2, hVar4);
            p1.r rVarN = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.d.d(oVar2, 1.0f), 12);
            t0.d dVar2 = t0.j.a;
            t0.j0 j0VarA = t0.h0.a(dVar2, p1.c.j, tVar, 0);
            int iHashCode2 = Long.hashCode(tVar.T);
            c1.s0 s0VarL2 = tVar.l();
            p1.r rVarD3 = p1.a.d(tVar, rVarN);
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar2);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, j0VarA, hVar);
            c1.c.G(tVar, s0VarL2, hVar2);
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, tVar, iHashCode2, hVar3);
            }
            c1.c.G(tVar, rVarD3, hVar4);
            int i3 = i2 >> 3;
            Oh.w0 w0Var = Oh.y0.Companion;
            e(abstractC3662U, y0Var, tVar, (i3 & 112) | (i3 & 14) | 64);
            tVar.q(true);
            t0.e.d(tVar, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f(androidx.compose.foundation.layout.d.d(oVar2, 1.0f), (float) 0.5d), ((Ui.g) tVar.j(Ui.q.a)).O(), w1.M.a));
            p1.i iVar3 = p1.c.l;
            float f = 6;
            p1.r rVarO = androidx.compose.foundation.layout.a.o(oVar2, f, 8);
            t0.j0 j0VarA2 = t0.h0.a(dVar2, iVar3, tVar, 48);
            int iHashCode3 = Long.hashCode(tVar.T);
            c1.s0 s0VarL3 = tVar.l();
            p1.r rVarD4 = p1.a.d(tVar, rVarO);
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar2);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, j0VarA2, hVar);
            c1.c.G(tVar, s0VarL3, hVar2);
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode3))) {
                A8.b.r(iHashCode3, tVar, iHashCode3, hVar3);
            }
            c1.c.G(tVar, rVarD4, hVar4);
            p1.j jVar = p1.c.d;
            p1.r rVarH = androidx.compose.foundation.layout.d.h(oVar2, 40, 0.0f, 2);
            if (1.0f <= 0.0d) {
                u0.a.a("invalid weight; must be greater than zero");
            }
            p1.r rVarR = androidx.compose.foundation.layout.a.r(A8.b.m(1.0f, rVarH, true), f, 0.0f, 0.0f, 0.0f, 14);
            N1.d0 d0VarD = t0.n.d(jVar, false);
            int iHashCode4 = Long.hashCode(tVar.T);
            c1.s0 s0VarL4 = tVar.l();
            p1.r rVarD5 = p1.a.d(tVar, rVarR);
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar2);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, hVar);
            c1.c.G(tVar, s0VarL4, hVar2);
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode4))) {
                A8.b.r(iHashCode4, tVar, iHashCode4, hVar3);
            }
            c1.c.G(tVar, rVarD5, hVar4);
            f(function1, tVar, 6);
            tVar.q(true);
            t0.e.d(tVar, androidx.compose.foundation.layout.d.s(oVar2, 2));
            g(null, z, iVar, function0, tVar, ((i2 >> 6) & 1008) | ((i2 >> 9) & 7168));
            tVar.q(true);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Ue.c(p3, abstractC3662U, y0Var, z, iVar, function1, function0, i);
        }
    }

    public static final void e(AbstractC3662U abstractC3662U, Oh.y0 y0Var, c1.o oVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        c1.t tVar = (c1.t) oVar;
        tVar.j0(916634434);
        c1.d dVar = tVar.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? tVar.f(abstractC3662U) : tVar.h(abstractC3662U) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? tVar.f(y0Var) : tVar.h(y0Var) ? 32 : 16;
        }
        int i3 = i2;
        if (tVar.Y(i3 & 1, (i3 & 19) != 18)) {
            p1.o oVar2 = p1.o.a;
            float f = 12;
            c1.i1 i1Var = Ui.q.a;
            p1.r rVarA = AbstractC4887c4.a(AbstractC4718s6.b(androidx.compose.foundation.layout.d.n(oVar2, 72), C0.f.b(f)), (float) 0.5d, ((Ui.g) tVar.j(i1Var)).O(), C0.f.b(f));
            N1.d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarA);
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
            c1.c.G(tVar, d0VarD, hVar);
            P1.h hVar2 = P1.j.e;
            c1.c.G(tVar, s0VarL, hVar2);
            P1.h hVar3 = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar3);
            }
            P1.h hVar4 = P1.j.d;
            c1.c.G(tVar, rVarD, hVar4);
            String str = y0Var.a;
            FillElement fillElement = androidx.compose.foundation.layout.d.c;
            ej.B.V(fillElement, str, false, null, tVar, 390, 24);
            boolean z3 = abstractC3662U instanceof C3665X;
            if (z3 || (abstractC3662U instanceof C3661T) || (abstractC3662U instanceof C3663V) || (abstractC3662U instanceof C3659Q)) {
                tVar.h0(1333474797);
                p1.j jVar = p1.c.e;
                p1.r rVarB = androidx.compose.foundation.a.b(fillElement, ((Ui.g) tVar.j(i1Var)).w(), w1.M.a);
                N1.d0 d0VarD2 = t0.n.d(jVar, false);
                int iHashCode2 = Long.hashCode(tVar.T);
                c1.s0 s0VarL2 = tVar.l();
                p1.r rVarD2 = p1.a.d(tVar, rVarB);
                tVar.l0();
                if (tVar.S) {
                    tVar.k(iVar);
                } else {
                    tVar.v0();
                }
                c1.c.G(tVar, d0VarD2, hVar);
                c1.c.G(tVar, s0VarL2, hVar2);
                if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode2))) {
                    A8.b.r(iHashCode2, tVar, iHashCode2, hVar3);
                }
                c1.c.G(tVar, rVarD2, hVar4);
                boolean z4 = abstractC3662U instanceof C3661T;
                androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.a;
                if (z4) {
                    tVar.h0(2019110198);
                    ej.B.X(androidx.compose.foundation.layout.d.n(bVar.a(oVar2, jVar), 24), EnumC3159a1.a, w1.s.d, tVar, 432, 0);
                    tVar.q(false);
                    z = false;
                } else if (z3) {
                    tVar.h0(2019427917);
                    if (((C3665X) abstractC3662U).a > 0) {
                        tVar.h0(2019486910);
                        p1.r rVarN = androidx.compose.foundation.layout.d.n(bVar.a(oVar2, jVar), 24);
                        long jN = ((Ui.g) tVar.j(i1Var)).n();
                        long j = w1.s.d;
                        float f2 = 2;
                        boolean z5 = (i3 & 14) == 4 || ((i3 & 8) != 0 && tVar.h(abstractC3662U));
                        Object objT = tVar.T();
                        if (z5 || objT == c1.n.a) {
                            objT = new Le.a0(abstractC3662U, 1);
                            tVar.s0(objT);
                        }
                        z = false;
                        W0.L1.b((Function0) objT, rVarN, jN, f2, j, 0, 0.0f, tVar, 27648, 96);
                        tVar = tVar;
                        tVar.q(false);
                    } else {
                        z = false;
                        tVar.h0(2019887678);
                        ej.B.X(androidx.compose.foundation.layout.d.n(bVar.a(oVar2, jVar), 24), EnumC3159a1.a, w1.s.d, tVar, 432, 0);
                        tVar.q(false);
                    }
                    tVar.q(z);
                } else {
                    z = false;
                    tVar.h0(2020232956);
                    W0.i0.a(Zn.n.b(Qk.i.e(), tVar, 0), "icon_image_upload_failed", androidx.compose.foundation.layout.d.n(bVar.a(oVar2, jVar), 24), ((Ui.g) tVar.j(i1Var)).q(), tVar, 48, 0);
                    tVar = tVar;
                    tVar.q(false);
                }
                z2 = true;
                tVar.q(true);
                tVar.q(z);
            } else {
                tVar.h0(1318544794);
                tVar.q(false);
                z2 = true;
            }
            tVar.q(z2);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Af.f(abstractC3662U, y0Var, i, 23);
        }
    }

    public static final void f(Function1 function1, c1.o oVar, int i) {
        int i2;
        c1.o oVar2;
        c1.o oVar3 = (c1.t) oVar;
        oVar3.j0(-1545283303);
        if ((i & 6) == 0) {
            i2 = (oVar3.h(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (oVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            Object objT = oVar3.T();
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = new C4068d(new f2.w((String) null, 0L, 7));
                oVar3.s0(objT);
            }
            C4068d c4068d = (C4068d) objT;
            Object objT2 = oVar3.T();
            if (objT2 == obj) {
                objT2 = A8.b.o(oVar3);
            }
            u1.p pVar = (u1.p) objT2;
            Unit unit = Unit.a;
            Object objT3 = oVar3.T();
            if (objT3 == obj) {
                objT3 = new Ue.f(pVar, null);
                oVar3.s0(objT3);
            }
            c1.c.f(oVar3, unit, (Function2) objT3);
            f2.w wVar = (f2.w) c4068d.a.getValue();
            c1.i1 i1Var = Ui.q.a;
            a2.U u = new a2.U(((Ui.g) oVar3.j(i1Var)).V(), P8.a.j(16), (e2.w) null, (e2.n) null, 0L, 0, 0, 0L, 16777212);
            D0.L0 l0 = new D0.L0(1, 115);
            w1.T t = new w1.T(((Ui.g) oVar3.j(i1Var)).R());
            p1.r rVarA = androidx.compose.ui.focus.a.a(androidx.compose.foundation.layout.d.d(p1.o.a, 1.0f), pVar);
            boolean z = (i2 & 14) == 4;
            Object objT4 = oVar3.T();
            if (z || objT4 == obj) {
                objT4 = new Ue.d(function1, c4068d, 0);
                oVar3.s0(objT4);
            }
            oVar2 = oVar3;
            ej.B.K(wVar, (Function1) objT4, rVarA, false, u, l0, null, false, 3, 0, null, null, null, t, k1.h.d(2006142032, new Sh.H(2, c4068d), oVar3), oVar2, 806879232, 196608, 15768);
        } else {
            oVar2 = oVar3;
            oVar2.b0();
        }
        c1.z0 z0VarV = oVar2.v();
        if (z0VarV != null) {
            z0VarV.d = new Ch.e(function1, i, 8);
        }
    }

    public static final void g(p1.r rVar, boolean z, yf.i iVar, Function0 function0, c1.o oVar, int i) {
        p1.r rVar2;
        Qk.F f = Qk.F.a;
        c1.t tVar = (c1.t) oVar;
        tVar.j0(1763255116);
        c1.d dVar = tVar.a;
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= tVar.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tVar.d(iVar.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tVar.h(function0) ? 2048 : 1024;
        }
        if (tVar.Y(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2;
            p1.r rVar3 = p1.o.a;
            p1.r rVarA = p1.a.a(androidx.compose.foundation.layout.d.n(rVar3, 40), new He.f(15));
            N1.d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarA);
            P1.k.R0.getClass();
            P1.i iVar2 = P1.j.b;
            if (dVar == null) {
                c1.c.v();
                throw null;
            }
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar2);
            } else {
                tVar.v0();
            }
            P1.h hVar = P1.j.f;
            c1.c.G(tVar, d0VarD, hVar);
            P1.h hVar2 = P1.j.e;
            c1.c.G(tVar, s0VarL, hVar2);
            P1.h hVar3 = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar3);
            }
            P1.h hVar4 = P1.j.d;
            c1.c.G(tVar, rVarD, hVar4);
            u1.i iVar3 = (u1.i) tVar.j(Q1.w0.i);
            if (z) {
                tVar.h0(70523255);
                p1.r rVarN = androidx.compose.foundation.layout.a.n(AbstractC4701q6.e(androidx.compose.foundation.layout.d.c, 0.4f), 6);
                N1.d0 d0VarD2 = t0.n.d(p1.c.e, false);
                int iHashCode2 = Long.hashCode(tVar.T);
                c1.s0 s0VarL2 = tVar.l();
                p1.r rVarD2 = p1.a.d(tVar, rVarN);
                tVar.l0();
                if (tVar.S) {
                    tVar.k(iVar2);
                } else {
                    tVar.v0();
                }
                c1.c.G(tVar, d0VarD2, hVar);
                c1.c.G(tVar, s0VarL2, hVar2);
                if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode2))) {
                    A8.b.r(iHashCode2, tVar, iHashCode2, hVar3);
                }
                c1.c.G(tVar, rVarD2, hVar4);
                ej.B.X(rVar3, EnumC3159a1.a, ((Ui.g) tVar.j(Ui.q.a)).C(), tVar, (i3 & 14) | 48, 0);
                rVar2 = rVar3;
                tVar = tVar;
                tVar.q(true);
                tVar.q(false);
            } else {
                rVar2 = rVar3;
                yf.i iVar4 = yf.i.b;
                int i4 = 2;
                Object obj = c1.n.a;
                if (iVar == iVar4) {
                    tVar.h0(71100723);
                    Sk.w wVar = Qk.z.a;
                    Intrinsics.checkNotNullParameter(f, "<this>");
                    B1.c cVarB = Zn.n.b((Zn.f) Qk.z.R.getValue(), tVar, 0);
                    String strE = N5.e(Qk.d1.e(), tVar, 0);
                    FillElement fillElement = androidx.compose.foundation.layout.d.c;
                    boolean z2 = (i3 & 7168) == 2048;
                    Object objT = tVar.T();
                    if (z2 || objT == obj) {
                        objT = new Ti.Q(i4, function0);
                        tVar.s0(objT);
                    }
                    W0.i0.a(cVarB, strE, androidx.compose.foundation.layout.a.n(AbstractC2415q.A(7, tVar, (Function0) objT, fillElement, false), 6), ((Ui.g) tVar.j(Ui.q.a)).C(), tVar, 0, 0);
                    tVar.q(false);
                } else if (iVar == yf.i.c) {
                    tVar.h0(71653050);
                    W0.i0.a(Zn.n.b(Qk.z.d(), tVar, 0), N5.e(Qk.d1.e(), tVar, 0), androidx.compose.foundation.layout.a.n(AbstractC4701q6.e(androidx.compose.foundation.layout.d.c, 0.6f), 6), ((Ui.g) tVar.j(Ui.q.a)).C(), tVar, 0, 0);
                    tVar.q(false);
                } else {
                    tVar.h0(72131225);
                    B1.c cVarB2 = Zn.n.b(Qk.z.d(), tVar, 0);
                    String strE2 = N5.e(Qk.d1.e(), tVar, 0);
                    FillElement fillElement2 = androidx.compose.foundation.layout.d.c;
                    boolean zH = ((i3 & 7168) == 2048) | tVar.h(iVar3);
                    Object objT2 = tVar.T();
                    if (zH || objT2 == obj) {
                        objT2 = new Kg.B(iVar3, function0, i4);
                        tVar.s0(objT2);
                    }
                    W0.i0.a(cVarB2, strE2, androidx.compose.foundation.layout.a.n(AbstractC2415q.A(7, tVar, (Function0) objT2, fillElement2, false), 6), ((Ui.g) tVar.j(Ui.q.a)).C(), tVar, 0, 0);
                    tVar.q(false);
                }
            }
            tVar.q(true);
        } else {
            tVar.b0();
            rVar2 = rVar;
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1305o(rVar2, z, iVar, function0, i, 7);
        }
    }

    public static final void h(String str, Function0 function0, c1.o oVar, int i) {
        c1.t tVar;
        c1.t tVar2 = (c1.t) oVar;
        tVar2.j0(-1230904052);
        int i2 = i | (tVar2.f(str) ? 4 : 2) | (tVar2.h(function0) ? 32 : 16);
        if (tVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            p1.j jVar = p1.c.e;
            boolean z = (i2 & 112) == 32;
            Object objT = tVar2.T();
            if (z || objT == c1.n.a) {
                objT = new Ti.Q(4, function0);
                tVar2.s0(objT);
            }
            p1.r rVarO = androidx.compose.foundation.layout.a.o(androidx.compose.foundation.layout.d.d(AbstractC2415q.A(7, tVar2, (Function0) objT, p1.o.a, false), 1.0f), 16, 20);
            N1.d0 d0VarD = t0.n.d(jVar, false);
            int iHashCode = Long.hashCode(tVar2.T);
            c1.s0 s0VarL = tVar2.l();
            p1.r rVarD = p1.a.d(tVar2, rVarO);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar2.a == null) {
                c1.c.v();
                throw null;
            }
            tVar2.l0();
            if (tVar2.S) {
                tVar2.k(iVar);
            } else {
                tVar2.v0();
            }
            c1.c.G(tVar2, d0VarD, P1.j.f);
            c1.c.G(tVar2, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar2.S || !Intrinsics.b(tVar2.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar2, iHashCode, hVar);
            }
            c1.c.G(tVar2, rVarD, P1.j.d);
            ej.B.H(str, null, ((Ui.g) tVar2.j(Ui.q.a)).C(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Ui.e) tVar2.j(Ui.q.c)).e, tVar2, i2 & 14, 0, 131066);
            tVar = tVar2;
            tVar.q(true);
        } else {
            tVar = tVar2;
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Pi.P0(i, 1, str, function0);
        }
    }

    public static final void i(Bk.r rVar, Bk.r rVar2) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(rVar2, "builder");
        for (Map.Entry entry : rVar2.a()) {
            rVar.h((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static int j(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(".ac3") || lastPathSegment.endsWith(".ec3")) {
            return 0;
        }
        if (lastPathSegment.endsWith(".ac4")) {
            return 1;
        }
        if (lastPathSegment.endsWith(".adts") || lastPathSegment.endsWith(".aac")) {
            return 2;
        }
        if (lastPathSegment.endsWith(".amr")) {
            return 3;
        }
        if (lastPathSegment.endsWith(".flac")) {
            return 4;
        }
        if (lastPathSegment.endsWith(".flv")) {
            return 5;
        }
        if (lastPathSegment.endsWith(".mid") || lastPathSegment.endsWith(".midi") || lastPathSegment.endsWith(".smf")) {
            return 15;
        }
        if (lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".webm")) {
            return 6;
        }
        if (lastPathSegment.endsWith(".mp3")) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) || lastPathSegment.endsWith(".opus")) {
            return 9;
        }
        if (lastPathSegment.endsWith(".ps") || lastPathSegment.endsWith(".mpeg") || lastPathSegment.endsWith(".mpg") || lastPathSegment.endsWith(".m2p")) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(".wav") || lastPathSegment.endsWith(".wave")) {
            return 12;
        }
        if (lastPathSegment.endsWith(".vtt") || lastPathSegment.endsWith(".webvtt")) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(".jpeg")) {
            return 14;
        }
        if (lastPathSegment.endsWith(".avi")) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(".webp")) {
            return 18;
        }
        if (lastPathSegment.endsWith(".bmp") || lastPathSegment.endsWith(".dib")) {
            return 19;
        }
        if (lastPathSegment.endsWith(".heic") || lastPathSegment.endsWith(".heif")) {
            return 20;
        }
        return lastPathSegment.endsWith(".avif") ? 21 : -1;
    }

    public static final LinkedHashMap k(Bk.q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Set<Map.Entry> setA = qVar.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setA) {
            linkedHashMap.put((String) entry.getKey(), CollectionsKt.B0((Iterable) entry.getValue()));
        }
        return linkedHashMap;
    }
}
