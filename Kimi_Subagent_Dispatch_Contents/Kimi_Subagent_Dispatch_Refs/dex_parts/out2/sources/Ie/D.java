package Ie;

import Ad.C0090f;
import Ag.C0119e0;
import Ag.C0127i0;
import Aj.a2;
import Aj.b3;
import Aj.x2;
import Cf.P3;
import Dc.C0486d7;
import Dc.C0505g;
import Dc.C0549k7;
import Dc.C0568n;
import Dc.C0614s1;
import Dc.C0629t7;
import Dc.C0679z3;
import Dc.C0680z4;
import Dc.D7;
import Dc.K7;
import Dc.N7;
import Dc.R4;
import Dc.V6;
import Dc.Z6;
import Dc.h8;
import Dc.j8;
import Dc.m8;
import Ee.C0756u;
import Ei.C0789x;
import Fh.C0836g;
import Fh.C0868w0;
import Hf.C1206x4;
import Je.AbstractC1329a;
import Pf.AbstractC1816b;
import W0.f3;
import W0.l3;
import aj.AbstractC2415q;
import android.graphics.DashPathEffect;
import androidx.compose.foundation.layout.LayoutWeightElement;
import bc.C2424a;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.SendException;
import dg.C2978a;
import ej.AbstractC3199o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import je.C3643A;
import je.C3695k0;
import je.C3711s0;
import je.C3712t;
import je.EnumC3710s;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ld.AbstractC3834A;
import ld.C3870w;
import md.C3962o0;
import ng.C4066b;
import ng.C4068d;
import ub.AbstractC4551a0;
import ub.AbstractC4610g5;
import ub.AbstractC4612g7;
import ub.AbstractC4646k5;
import ub.AbstractC4674n6;
import ub.AbstractC4701q6;
import ub.AbstractC4718s6;
import ub.AbstractC4727t6;
import ub.AbstractC4745v6;
import ub.AbstractC4773y7;
import ub.H7;
import ub.K5;
import ub.N5;
import vb.AbstractC4881b4;
import vb.AbstractC4887c4;
import vb.AbstractC4898e3;
import vb.AbstractC5019z;
import vb.K2;
import vb.N2;
import yd.AbstractC5709r0;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public abstract class D {
    public static final k1.c a = new k1.c(new Dh.b(9), false, 1497669129);
    public static final k1.c b;
    public static final k1.c c;
    public static final k1.c d;
    public static final k1.c e;
    public static final k1.c f;
    public static final k1.c g;
    public static final k1.c h;

    static {
        new k1.c(new Dh.b(10), false, -1034105083);
        new k1.c(new Dh.b(11), false, 642177264);
        b = new k1.c(new Dh.b(12), false, -1269197412);
        c = new k1.c(new Dh.b(13), false, 1672979704);
        d = new k1.c(new Dh.b(14), false, 1081876933);
        e = new k1.c(new Dh.b(15), false, 1527414244);
        f = new k1.c(new Bj.w(24), false, -668794944);
        g = new k1.c(new Bj.w(25), false, 696491136);
        h = new k1.c(new Dh.b(16), false, -1363943499);
    }

    public static final void A(c1.o oVar, int i) {
        Zn.f fVar;
        Zn.f fVar2;
        Qk.F f2 = Qk.F.a;
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-1749504890);
        int i2 = i & 1;
        if (tVar.Y(i2, i2 != 0)) {
            Object objT = tVar.T();
            c1.X x = c1.n.a;
            if (objT == x) {
                objT = new c1.j0(0.0f);
                tVar.s0(objT);
            }
            c1.c0 c0Var = (c1.c0) objT;
            c1.h1 h1VarB = j0.h.b(c0Var.g(), j0.e.o(j0.e.r(2000, 0, j0.B.d, 2), j0.W.a, 4), BuildConfig.FLAVOR, (Function1) null, tVar, 3136, 20);
            Boolean bool = Boolean.TRUE;
            Object objT2 = tVar.T();
            if (objT2 == x) {
                objT2 = new C1297k(c0Var, null);
                tVar.s0(objT2);
            }
            c1.c.f(tVar, bool, (Function2) objT2);
            boolean zB = Ui.q.b(tVar);
            Sk.w wVar = Qk.d.a;
            if (zB) {
                Intrinsics.checkNotNullParameter(f2, "<this>");
                fVar = (Zn.f) Qk.d.p.getValue();
            } else {
                Intrinsics.checkNotNullParameter(f2, "<this>");
                fVar = (Zn.f) Qk.d.o.getValue();
            }
            Bb.b.a(Zn.n.b(fVar, tVar, 0), null, AbstractC4727t6.d(androidx.compose.foundation.layout.d.j(p1.o.a, AbstractC5709r0.g(tVar).a), ((Number) h1VarB.getValue()).floatValue()), null, N1.q.c, 0.0f, null, tVar, 24624, 104);
            if (zB) {
                Intrinsics.checkNotNullParameter(f2, "<this>");
                fVar2 = (Zn.f) Qk.d.q.getValue();
            } else {
                Intrinsics.checkNotNullParameter(f2, "<this>");
                fVar2 = (Zn.f) Qk.d.n.getValue();
            }
            Bb.b.a(Zn.n.b(fVar2, tVar, 0), null, androidx.compose.foundation.layout.d.c, null, N1.q.i, 0.0f, null, tVar, 25008, 104);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Bj.w(i, 21);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    public static final void B(ArrayList arrayList, N n, c1.o oVar, int i) {
        ?? r2;
        p1.r rVar;
        boolean z;
        String strP;
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-277686646);
        int i2 = i | (tVar.h(arrayList) ? 4 : 2) | (tVar.d(n.ordinal()) ? 32 : 16);
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = ((bf.Q) tVar.j(aj.I.l)).b;
            p1.r rVar2 = p1.o.a;
            p1.r rVarD = androidx.compose.foundation.layout.d.d(rVar2, 1.0f);
            t0.j0 j0VarA = t0.h0.a(t0.j.g(8), p1.c.k, tVar, 54);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD2 = p1.a.d(tVar, rVarD);
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
            c1.c.G(tVar, j0VarA, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD2, P1.j.d);
            p1.r rVarN = androidx.compose.foundation.layout.d.n(rVar2, 20);
            Zd.D d2 = Zd.D.r;
            String strB = AbstractC4881b4.b(d2.a);
            Zn.f fVar = d2.b;
            n.getClass();
            N n2 = N.c;
            boolean z3 = n == n2;
            c1.i1 i1Var = Ui.q.a;
            yd.H0.f(rVarN, ej.B.w0(strB, !z3, fVar, ((Ui.g) tVar.j(i1Var)).E(), null, tVar, 0, 496), tVar, 6);
            Qk.F f2 = Qk.F.d;
            Sk.w wVar = Qk.X.a;
            Intrinsics.checkNotNullParameter(f2, "<this>");
            String strE = N5.e((Zn.L) Qk.X.e.getValue(), tVar, 0);
            c1.i1 i1Var2 = Ui.q.c;
            l3.b(strE, (p1.r) null, 0L, 0L, (e2.w) null, (e2.j) null, 0L, (l2.k) null, 0L, 0, false, 0, 0, a2.U.a(((Ui.e) tVar.j(i1Var2)).h, ((Ui.g) tVar.j(i1Var)).E(), 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, (l2.i) null, 0, 16777214), tVar, 0, 0, 131070);
            c1.t tVar2 = tVar;
            if (n != n2) {
                tVar2.h0(-315719299);
                rVar = rVar2;
                f3.o((float) 0.5d, 54, ((Ui.g) tVar2.j(i1Var)).O(), tVar2, androidx.compose.foundation.layout.d.f(rVar, 12));
                if (n != N.b || arrayList.isEmpty()) {
                    Sk.w wVar2 = Qk.O.a;
                    Intrinsics.checkNotNullParameter(f2, "<this>");
                    strP = Pf.B.p((Zn.L) Qk.O.i0.getValue());
                } else {
                    Qk.F f3 = Qk.F.c;
                    Sk.w wVar3 = Qk.E.a;
                    Intrinsics.checkNotNullParameter(f3, "<this>");
                    strP = Pf.B.n((Zn.p) Qk.E.w.getValue(), arrayList.size(), Integer.valueOf(arrayList.size()));
                }
                AbstractC4610g5.a(new a2.g(strP), null, z2, ((Ui.e) tVar2.j(i1Var2)).h, null, 0, 0.0f, tVar2, 0, 242);
                tVar2 = tVar2;
                z = false;
            } else {
                rVar = rVar2;
                z = false;
                tVar2.h0(-322011276);
            }
            tVar2.q(z);
            if (1.0f <= 0.0d) {
                u0.a.a("invalid weight; must be greater than zero");
            }
            t0.e.d(tVar2, new LayoutWeightElement(1.0f, true));
            c1.t tVar3 = tVar2;
            W0.i0.a(Zn.n.b(Qk.z.a(), tVar2, z ? 1 : 0), (String) null, androidx.compose.foundation.layout.d.n(rVar, 18), ((Ui.g) tVar2.j(i1Var)).D(), tVar3, 432, 0);
            tVar = tVar3;
            tVar.q(true);
            r2 = z;
        } else {
            r2 = 0;
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Q(arrayList, n, i, r2);
        }
    }

    public static final void C(int i, C0568n c0568n, boolean z, Function0 function0, c1.o oVar, int i2) throws Throwable {
        boolean z2 = z;
        c1.o oVar2 = (c1.t) oVar;
        oVar2.j0(-612184796);
        c1.d dVar = ((c1.t) oVar2).a;
        int i3 = i2 | (oVar2.d(i) ? 4 : 2) | (oVar2.f(c0568n) ? 32 : 16) | (oVar2.g(z2) ? 256 : 128) | (oVar2.h(function0) ? 2048 : 1024);
        if (oVar2.Y(i3 & 1, (i3 & 1171) != 1170)) {
            N7 n7C = c0568n.p().c();
            Object objT = oVar2.T();
            c1.X x = c1.n.a;
            if (objT == x) {
                objT = c1.c.z(BuildConfig.FLAVOR);
                oVar2.s0(objT);
            }
            c1.f0 f0Var = (c1.f0) objT;
            boolean zF = oVar2.f(n7C) | ((i3 & 112) == 32);
            Object objT2 = oVar2.T();
            if (zF || objT2 == x) {
                objT2 = new T(n7C, c0568n, f0Var, null);
                oVar2.s0(objT2);
            }
            int i4 = i3 >> 3;
            c1.c.f(oVar2, c0568n, (Function2) objT2);
            p1.o oVar3 = p1.o.a;
            float f2 = 8;
            p1.r rVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.d(oVar3, 1.0f), AbstractC4551a0.c(oVar2).t(), C0.f.b(f2));
            float f3 = 0;
            Object objT3 = oVar2.T();
            if (objT3 == x) {
                objT3 = g6.a.p(oVar2);
            }
            long jU = AbstractC4551a0.c(oVar2).u();
            long jT = AbstractC4551a0.c(oVar2).t();
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f2, oVar2))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f2, oVar2))) << 32);
            p1.r rVarA = p1.a.a(rVarB, new Aj.x0(jU, jT, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f3, oVar2))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f3, oVar2))) << 32), (r0.l) objT3, function0, 5));
            J1.q.a.getClass();
            p1.r rVarO = androidx.compose.foundation.layout.a.o(AbstractC4718s6.b(J1.s.f(rVarA, J1.s.c), C0.f.b(f2)), 12, 10);
            t0.s sVarA = t0.r.a(t0.j.g(f2), p1.c.m, oVar2, 6);
            int iHashCode = Long.hashCode(((c1.t) oVar2).T);
            c1.s0 s0VarL = oVar2.l();
            p1.r rVarD = p1.a.d(oVar2, rVarO);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (dVar == null) {
                c1.c.v();
                throw null;
            }
            oVar2.l0();
            if (((c1.t) oVar2).S) {
                oVar2.k(iVar);
            } else {
                oVar2.v0();
            }
            P1.h hVar = P1.j.f;
            c1.c.G(oVar2, sVarA, hVar);
            P1.h hVar2 = P1.j.e;
            c1.c.G(oVar2, s0VarL, hVar2);
            P1.h hVar3 = P1.j.g;
            if (((c1.t) oVar2).S || !Intrinsics.b(oVar2.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, oVar2, iHashCode, hVar3);
            }
            P1.h hVar4 = P1.j.d;
            c1.c.G(oVar2, rVarD, hVar4);
            t0.h hVarG = t0.j.g(f2);
            p1.i iVar2 = p1.c.k;
            t0.j0 j0VarA = t0.h0.a(hVarG, iVar2, oVar2, 54);
            int iHashCode2 = Long.hashCode(((c1.t) oVar2).T);
            c1.s0 s0VarL2 = oVar2.l();
            p1.r rVarD2 = p1.a.d(oVar2, oVar3);
            oVar2.l0();
            if (((c1.t) oVar2).S) {
                oVar2.k(iVar);
            } else {
                oVar2.v0();
            }
            c1.c.G(oVar2, j0VarA, hVar);
            c1.c.G(oVar2, s0VarL2, hVar2);
            if (((c1.t) oVar2).S || !Intrinsics.b(oVar2.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, oVar2, iHashCode2, hVar3);
            }
            c1.c.G(oVar2, rVarD2, hVar4);
            String str = n7C.a().b;
            float f4 = 20;
            p1.r rVarN = androidx.compose.foundation.layout.d.n(oVar3, f4);
            long jO = AbstractC4551a0.c(oVar2).O();
            C0.e eVar = C0.f.a;
            x8.k.a(str, (String) null, AbstractC4718s6.b(AbstractC4887c4.a(rVarN, (float) 0.5d, jO, eVar), eVar), (p1.j) null, (N1.r) null, (w1.l) null, oVar2, 48, 2040);
            l3.b(n7C.a().a, (p1.r) null, 0L, 0L, (e2.w) null, (e2.j) null, 0L, (l2.k) null, 0L, 0, false, 0, 0, a2.U.a(AbstractC4551a0.e(oVar2).h, AbstractC4551a0.c(oVar2).E(), 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, (l2.i) null, 0, 16777214), oVar2, 0, 0, 131070);
            if (1.0f <= 0.0d) {
                u0.a.a("invalid weight; must be greater than zero");
            }
            t0.e.d(oVar2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            l3.b(StringsKt.c0(2, String.valueOf(i + 1)), (p1.r) null, 0L, 0L, (e2.w) null, Ui.d.d(oVar2), 0L, (l2.k) null, 0L, 0, false, 0, 0, a2.U.a(AbstractC4551a0.e(oVar2).h, AbstractC4551a0.c(oVar2).E(), 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, (l2.i) null, 0, 16777214), oVar2, 0, 0, 130942);
            oVar2.q(true);
            t0.j0 j0VarA2 = t0.h0.a(t0.j.g(f2), iVar2, oVar2, 54);
            int iHashCode3 = Long.hashCode(((c1.t) oVar2).T);
            c1.s0 s0VarL3 = oVar2.l();
            p1.r rVarD3 = p1.a.d(oVar2, oVar3);
            oVar2.l0();
            if (((c1.t) oVar2).S) {
                oVar2.k(iVar);
            } else {
                oVar2.v0();
            }
            c1.c.G(oVar2, j0VarA2, hVar);
            c1.c.G(oVar2, s0VarL3, hVar2);
            if (((c1.t) oVar2).S || !Intrinsics.b(oVar2.T(), Integer.valueOf(iHashCode3))) {
                A8.b.r(iHashCode3, oVar2, iHashCode3, hVar3);
            }
            c1.c.G(oVar2, rVarD3, hVar4);
            p1.r rVarN2 = androidx.compose.foundation.layout.d.n(oVar3, f4);
            Sk.w wVar = Qk.m.a;
            Intrinsics.checkNotNullParameter(Qk.F.a, "<this>");
            W0.i0.a(Zn.n.b((Zn.f) Qk.m.k.getValue(), oVar2, 0), (String) null, rVarN2, AbstractC4551a0.c(oVar2).v(), oVar2, 432, 0);
            String str2 = (String) f0Var.getValue();
            a2.U uA = a2.U.a(AbstractC4551a0.e(oVar2).h, AbstractC4551a0.c(oVar2).E(), 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, (l2.i) null, 0, 16777214);
            if (1.0f <= 0.0d) {
                u0.a.a("invalid weight; must be greater than zero");
            }
            l3.b(str2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, 0L, (e2.w) null, (e2.j) null, 0L, (l2.k) null, 0L, 2, false, 1, 0, uA, oVar2, 0, 24960, 110588);
            oVar2 = oVar2;
            z2 = z;
            Y(c0568n.p(), z2, oVar2, i4 & 112);
            oVar2.q(true);
            oVar2.q(true);
        } else {
            oVar2.b0();
        }
        c1.z0 z0VarV = oVar2.v();
        if (z0VarV != null) {
            z0VarV.d = new D0.X(i, c0568n, z2, function0, i2);
        }
    }

    public static final void D(P3 p3, ArrayList arrayList, c1.o oVar, int i) {
        ArrayList arrayList2;
        N n;
        Intrinsics.checkNotNullParameter(p3, "model");
        Intrinsics.checkNotNullParameter(arrayList, "blocks");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-51432710);
        int i2 = (tVar.f(p3) ? 4 : 2) | i | (tVar.h(arrayList) ? 32 : 16);
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            Function1 function1 = (Function1) tVar.j(aj.I.j);
            bf.Q q = (bf.Q) tVar.j(aj.I.l);
            boolean zG = tVar.g(q.b) | tVar.f(arrayList);
            Object objT = tVar.T();
            c1.X x = c1.n.a;
            if (zG || objT == x) {
                ArrayList<Z6> arrayList3 = new ArrayList(kotlin.collections.A.t(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((C0568n) it.next()).p());
                }
                if (!q.b || arrayList3.isEmpty()) {
                    n = N.c;
                    objT = n;
                    tVar.s0(objT);
                } else {
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        if (!AbstractC4646k5.l((Z6) it2.next())) {
                            if (arrayList3.isEmpty()) {
                                n = N.a;
                                objT = n;
                                tVar.s0(objT);
                            } else {
                                for (Z6 z6 : arrayList3) {
                                    if (Intrinsics.b(z6.g, V6.d) || AbstractC4646k5.l(z6)) {
                                        n = N.b;
                                        break;
                                    }
                                }
                                n = N.a;
                                objT = n;
                                tVar.s0(objT);
                            }
                        }
                    }
                    n = N.c;
                    objT = n;
                    tVar.s0(objT);
                }
            }
            N n2 = (N) objT;
            Object objT2 = tVar.T();
            if (objT2 == x) {
                objT2 = new O(p3, q, function1, 0);
                tVar.s0(objT2);
            }
            arrayList2 = arrayList;
            R0.s0.a(k1.h.d(-1690338805, new Di.i((Function1) objT2, arrayList2, n2, q, 11), tVar), tVar, 6);
        } else {
            arrayList2 = arrayList;
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Aj.o0(p3, arrayList2, i, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void E(final boolean r37, final int r38, final Ie.N r39, final boolean r40, final boolean r41, c1.o r42, final int r43) {
        /*
            Method dump skipped, instruction units count: 734
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ie.D.E(boolean, int, Ie.N, boolean, boolean, c1.o, int):void");
    }

    public static final void F(String str, C0568n c0568n, Function0 function0, c1.o oVar, int i) {
        c1.o oVar2 = (c1.t) oVar;
        oVar2.j0(-34603724);
        c1.d dVar = ((c1.t) oVar2).a;
        int i2 = i | (oVar2.f(str) ? 4 : 2) | (oVar2.f(c0568n) ? 32 : 16) | (oVar2.h(function0) ? 256 : 128);
        int i3 = 1;
        if (oVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            K7 k7B = c0568n.p().b();
            Object objT = oVar2.T();
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = c1.c.z(BuildConfig.FLAVOR);
                oVar2.s0(objT);
            }
            c1.f0 f0Var = (c1.f0) objT;
            Object objT2 = oVar2.T();
            if (objT2 == obj) {
                objT2 = c1.c.z(Boolean.FALSE);
                oVar2.s0(objT2);
            }
            c1.f0 f0Var2 = (c1.f0) objT2;
            boolean z = (i2 & 112) == 32;
            Object objT3 = oVar2.T();
            if (z || objT3 == obj) {
                objT3 = new X(c0568n, f0Var, f0Var2, null);
                oVar2.s0(objT3);
            }
            c1.c.f(oVar2, c0568n, (Function2) objT3);
            boolean z2 = c0568n.p().d;
            boolean zF = ((i2 & 14) == 4) | oVar2.f(k7B.a);
            Object objT4 = oVar2.T();
            if (zF || objT4 == obj) {
                objT4 = c1.c.r(new C1324y(i3, str, k7B));
                oVar2.s0(objT4);
            }
            c1.h1 h1Var = (c1.h1) objT4;
            boolean zF2 = oVar2.f((AbstractC3834A) h1Var.getValue()) | oVar2.g(((Boolean) f0Var2.getValue()).booleanValue()) | oVar2.g(z2);
            Object objT5 = oVar2.T();
            if (zF2 || objT5 == obj) {
                objT5 = AbstractC1329a.A((AbstractC3834A) h1Var.getValue(), ((Boolean) f0Var2.getValue()).booleanValue(), z2);
                oVar2.s0(objT5);
            }
            List list = (List) objT5;
            boolean z3 = Intrinsics.b((AbstractC3834A) h1Var.getValue(), C3870w.d) && !z2;
            p1.o oVar3 = p1.o.a;
            float f2 = 8;
            p1.r rVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.d(oVar3, 1.0f), AbstractC4551a0.c(oVar2).t(), C0.f.b(f2));
            float f3 = 0;
            Object objT6 = oVar2.T();
            if (objT6 == obj) {
                objT6 = g6.a.p(oVar2);
            }
            r0.l lVar = (r0.l) objT6;
            p1.r rVarA = p1.a.a(rVarB, new Aj.x0(AbstractC4551a0.c(oVar2).u(), AbstractC4551a0.c(oVar2).t(), (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f2, oVar2))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f2, oVar2))) << 32), (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f3, oVar2))) << 32) | (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f3, oVar2))) & 4294967295L), lVar, function0, 6));
            J1.q.a.getClass();
            p1.r rVarO = androidx.compose.foundation.layout.a.o(AbstractC4718s6.b(J1.s.f(rVarA, J1.s.c), C0.f.b(f2)), 12, 10);
            t0.s sVarA = t0.r.a(t0.j.g(f2), p1.c.m, oVar2, 6);
            int iHashCode = Long.hashCode(((c1.t) oVar2).T);
            c1.s0 s0VarL = oVar2.l();
            p1.r rVarD = p1.a.d(oVar2, rVarO);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (dVar == null) {
                c1.c.v();
                throw null;
            }
            oVar2.l0();
            if (((c1.t) oVar2).S) {
                oVar2.k(iVar);
            } else {
                oVar2.v0();
            }
            P1.h hVar = P1.j.f;
            c1.c.G(oVar2, sVarA, hVar);
            P1.h hVar2 = P1.j.e;
            c1.c.G(oVar2, s0VarL, hVar2);
            P1.h hVar3 = P1.j.g;
            if (((c1.t) oVar2).S || !Intrinsics.b(oVar2.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, oVar2, iHashCode, hVar3);
            }
            P1.h hVar4 = P1.j.d;
            c1.c.G(oVar2, rVarD, hVar4);
            t0.h hVarG = t0.j.g(f2);
            p1.i iVar2 = p1.c.k;
            t0.j0 j0VarA = t0.h0.a(hVarG, iVar2, oVar2, 54);
            int iHashCode2 = Long.hashCode(((c1.t) oVar2).T);
            c1.s0 s0VarL2 = oVar2.l();
            p1.r rVarD2 = p1.a.d(oVar2, oVar3);
            oVar2.l0();
            if (((c1.t) oVar2).S) {
                oVar2.k(iVar);
            } else {
                oVar2.v0();
            }
            c1.c.G(oVar2, j0VarA, hVar);
            c1.c.G(oVar2, s0VarL2, hVar2);
            if (((c1.t) oVar2).S || !Intrinsics.b(oVar2.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, oVar2, iHashCode2, hVar3);
            }
            c1.c.G(oVar2, rVarD2, hVar4);
            String str2 = k7B.c;
            float f4 = 20;
            p1.r rVarN = androidx.compose.foundation.layout.d.n(oVar3, f4);
            long jO = AbstractC4551a0.c(oVar2).O();
            C0.e eVar = C0.f.a;
            x8.k.a(str2, (String) null, AbstractC4718s6.b(AbstractC4887c4.a(rVarN, (float) 0.5d, jO, eVar), eVar), (p1.j) null, (N1.r) null, (w1.l) null, oVar2, 48, 2040);
            l3.b(k7B.d, (p1.r) null, 0L, 0L, (e2.w) null, (e2.j) null, 0L, (l2.k) null, 0L, 0, false, 0, 0, a2.U.a(AbstractC4551a0.e(oVar2).h, AbstractC4551a0.c(oVar2).E(), 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, (l2.i) null, 0, 16777214), oVar2, 0, 0, 131070);
            oVar2.q(true);
            t0.j0 j0VarA2 = t0.h0.a(t0.j.g(f2), iVar2, oVar2, 54);
            int iHashCode3 = Long.hashCode(((c1.t) oVar2).T);
            c1.s0 s0VarL3 = oVar2.l();
            p1.r rVarD3 = p1.a.d(oVar2, oVar3);
            oVar2.l0();
            if (((c1.t) oVar2).S) {
                oVar2.k(iVar);
            } else {
                oVar2.v0();
            }
            c1.c.G(oVar2, j0VarA2, hVar);
            c1.c.G(oVar2, s0VarL3, hVar2);
            if (((c1.t) oVar2).S || !Intrinsics.b(oVar2.T(), Integer.valueOf(iHashCode3))) {
                A8.b.r(iHashCode3, oVar2, iHashCode3, hVar3);
            }
            c1.c.G(oVar2, rVarD3, hVar4);
            p1.r rVarN2 = androidx.compose.foundation.layout.d.n(oVar3, f4);
            Sk.w wVar = Qk.m.a;
            Intrinsics.checkNotNullParameter(Qk.F.a, "<this>");
            W0.i0.a(Zn.n.b((Zn.f) Qk.m.k.getValue(), oVar2, 0), (String) null, rVarN2, AbstractC4551a0.c(oVar2).v(), oVar2, 432, 0);
            String str3 = (String) f0Var.getValue();
            a2.U uA = a2.U.a(AbstractC4551a0.e(oVar2).h, AbstractC4551a0.c(oVar2).E(), 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, (l2.i) null, 0, 16777214);
            if (1.0f <= 0.0d) {
                u0.a.a("invalid weight; must be greater than zero");
            }
            l3.b(str3, new LayoutWeightElement(1.0f, true), 0L, 0L, (e2.w) null, (e2.j) null, 0L, (l2.k) null, 0L, 2, false, 1, 0, uA, oVar2, 0, 24960, 110588);
            a2.U uA2 = a2.U.a(AbstractC4551a0.e(oVar2).h, AbstractC4551a0.c(oVar2).F(), 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, (l2.i) null, 0, 16777214);
            List listM = kotlin.collections.z.m(new w1.s[]{new w1.s(AbstractC4551a0.c(oVar2).F()), new w1.s(AbstractC4551a0.c(oVar2).u()), new w1.s(AbstractC4551a0.c(oVar2).F())});
            oVar2 = oVar2;
            com.moonshot.kimichat.ui.a.j(list, null, uA2, 5000L, z3, z3, true, listM, oVar2, 1575936, 2);
            oVar2.q(true);
            oVar2.q(true);
        } else {
            oVar2.b0();
        }
        c1.z0 z0VarV = oVar2.v();
        if (z0VarV != null) {
            z0VarV.d = new Aj.s0(str, c0568n, function0, i, 15);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(Cf.P3 r12, java.util.ArrayList r13, boolean r14, c1.o r15, int r16) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ie.D.G(Cf.P3, java.util.ArrayList, boolean, c1.o, int):void");
    }

    public static final void H(C3643A c3643a, boolean z, c1.o oVar, int i, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        Intrinsics.checkNotNullParameter(c3643a, "chapter");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-848461643);
        c1.d dVar = tVar.a;
        int i4 = i | (tVar.f(c3643a) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (tVar.g(z2) ? 32 : 16);
        }
        int i6 = i3;
        if (tVar.Y(i6 & 1, (i6 & 19) != 18)) {
            boolean z4 = i5 != 0 ? false : z2;
            t0.f fVar = t0.j.c;
            p1.h hVar = p1.c.m;
            t0.s sVarA = t0.r.a(fVar, hVar, tVar, 0);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVar = p1.o.a;
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
            P1.h hVar2 = P1.j.f;
            c1.c.G(tVar, sVarA, hVar2);
            P1.h hVar3 = P1.j.e;
            c1.c.G(tVar, s0VarL, hVar3);
            P1.h hVar4 = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar4);
            }
            P1.h hVar5 = P1.j.d;
            c1.c.G(tVar, rVarD, hVar5);
            c1.i1 i1Var = Ui.q.a;
            boolean z5 = z4;
            f3.d((p1.r) null, (float) 0.5d, ((Ui.g) tVar.j(i1Var)).O(), tVar, 48, 1);
            float f2 = 16;
            p1.r rVarN = androidx.compose.foundation.layout.a.n(rVar, f2);
            t0.s sVarA2 = t0.r.a(fVar, hVar, tVar, 0);
            int iHashCode2 = Long.hashCode(tVar.T);
            c1.s0 s0VarL2 = tVar.l();
            p1.r rVarD2 = p1.a.d(tVar, rVarN);
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, sVarA2, hVar2);
            c1.c.G(tVar, s0VarL2, hVar3);
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, tVar, iHashCode2, hVar4);
            }
            c1.c.G(tVar, rVarD2, hVar5);
            int i7 = 196608 | (i6 & 112);
            float f3 = 12;
            p1.r rVar2 = rVar;
            float f4 = f2;
            ej.B.I(AbstractC4612g7.a(((Ui.g) tVar.j(i1Var)).C(), z5, new a2.g(c3643a.a), null, tVar, i7, 24), androidx.compose.foundation.layout.a.r(rVar, 0.0f, 0.0f, 0.0f, f3, 7), ((Ui.g) tVar.j(i1Var)).C(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((Ui.e) tVar.j(Ui.q.c)).c, tVar, 48, 0, 262136);
            tVar = tVar;
            tVar.h0(-564601446);
            for (je.O0 o0 : c3643a.b) {
                float f5 = f4;
                p1.r rVar3 = rVar2;
                c1.t tVar2 = tVar;
                ej.B.I(AbstractC4612g7.a(AbstractC4551a0.c(tVar).C(), z5, new a2.g(o0.b), null, tVar, i7, 24), androidx.compose.foundation.layout.a.r(rVar3, f5, 0.0f, 0.0f, 8, 6), AbstractC4551a0.c(tVar).C(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, AbstractC4551a0.e(tVar).e, tVar2, 48, 0, 262136);
                long jC = AbstractC4551a0.c(tVar2).C();
                Qk.F f6 = Qk.F.d;
                Sk.w wVar = Qk.c0.a;
                Intrinsics.checkNotNullParameter(f6, "<this>");
                ej.B.I(AbstractC4612g7.a(jC, z5, new a2.g(N5.e((Zn.L) Qk.c0.g.getValue(), tVar2, 0)), null, tVar2, i7, 24), androidx.compose.foundation.layout.a.r(rVar3, f5, 0.0f, 0.0f, 4, 6), AbstractC4551a0.c(tVar2).C(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, AbstractC4551a0.e(tVar2).f, tVar2, 48, 0, 262136);
                ej.B.I(AbstractC4612g7.a(AbstractC4551a0.c(tVar2).F(), z5, new a2.g(o0.c), null, tVar2, i7, 24), androidx.compose.foundation.layout.a.r(rVar3, f5, 0.0f, 0.0f, f3, 6), AbstractC4551a0.c(tVar2).F(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, AbstractC4551a0.e(tVar2).f, tVar2, 48, 0, 262136);
                tVar = tVar2;
                f4 = f5;
                rVar2 = rVar3;
            }
            S0.b.v(tVar, false, true, true);
            z3 = z5;
        } else {
            tVar.b0();
            z3 = z2;
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1314t(c3643a, z3, i, i2, 0);
        }
    }

    public static final void I(bf.Q q, C3711s0 c3711s0, c1.o oVar, int i) {
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-1901901845);
        int i2 = (tVar.f(q) ? 4 : 2) | i | (tVar.f(c3711s0) ? 32 : 16);
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            Object[] objArr = new Object[0];
            l1.k kVar = v0.v.x;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (z || objT == obj) {
                objT = new C1320w(c3711s0, 0);
                tVar.s0(objT);
            }
            v0.v vVar = (v0.v) l1.l.e(objArr, kVar, (Function0) objT, tVar, 0);
            boolean z2 = q.b;
            boolean zG = tVar.g(z2) | (i3 == 32);
            Object objT2 = tVar.T();
            if (zG || objT2 == obj) {
                objT2 = new C0756u(c3711s0, z2, 2);
                tVar.s0(objT2);
            }
            AbstractC4773y7.a(null, vVar, null, true, null, null, null, false, null, (Function1) objT2, tVar, 3072, 501);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1322x(q, c3711s0, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v12 */
    public static final void J(bf.Q q, C3711s0 c3711s0, c1.o oVar, int i) {
        ?? r15;
        boolean z;
        Object obj;
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-1305063093);
        int i2 = i | (tVar.f(q) ? 4 : 2) | (tVar.f(c3711s0) ? 32 : 16);
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            y4.z zVar = (y4.z) tVar.j(aj.I.i);
            p1.o oVar2 = p1.o.a;
            p1.r rVarF = androidx.compose.foundation.layout.d.f(oVar2, 42);
            c1.i1 i1Var = Ui.q.a;
            float f2 = 16;
            p1.r rVarP = androidx.compose.foundation.layout.a.p(androidx.compose.foundation.a.b(rVarF, ((Ui.g) tVar.j(i1Var)).i(), w1.M.a), f2, 0.0f, 2);
            t0.j0 j0VarA = t0.h0.a(t0.j.g(f2), p1.c.k, tVar, 54);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarP);
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
            c1.c.G(tVar, j0VarA, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            Sk.w wVar = Qk.c0.a;
            Intrinsics.checkNotNullParameter(Qk.F.d, "<this>");
            ej.B.H(N5.e((Zn.L) Qk.c0.c.getValue(), tVar, 0), null, ((Ui.g) tVar.j(i1Var)).C(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Ui.e) tVar.j(Ui.q.c)).x, tVar, 0, 0, 131066);
            tVar = tVar;
            if (1.0f <= 0.0d) {
                u0.a.a("invalid weight; must be greater than zero");
            }
            A8.b.p(1.0f, true, tVar);
            float f3 = 20;
            long jE = ((Ui.g) tVar.j(i1Var)).E();
            float f4 = q.b ? 0.0f : 1.0f;
            int i3 = 0;
            B1.c cVarB = Zn.n.b(Qk.i.f(), tVar, 0);
            p1.r rVarE = AbstractC4701q6.e(androidx.compose.foundation.layout.d.n(oVar2, f3), f4);
            int i4 = i2 & 112;
            boolean zH = tVar.h(zVar) | (i4 == 32);
            Object objT = tVar.T();
            c1.X x = c1.n.a;
            Object obj2 = objT;
            if (zH || objT == x) {
                C1324y c1324y = new C1324y(i3, zVar, c3711s0);
                tVar.s0(c1324y);
                obj2 = c1324y;
            }
            W0.i0.a(cVarB, (String) null, AbstractC2415q.A(7, tVar, (Function0) obj2, rVarE, false), jE, tVar, 48, 0);
            B1.c cVarB2 = Zn.n.b(Qk.d.k(), tVar, 0);
            p1.r rVarE2 = AbstractC4701q6.e(androidx.compose.foundation.layout.d.n(oVar2, f3), f4);
            boolean z2 = i4 == 32;
            Object objT2 = tVar.T();
            if (z2 || objT2 == x) {
                z = true;
                C1320w c1320w = new C1320w(c3711s0, true ? 1 : 0);
                tVar.s0(c1320w);
                obj = c1320w;
            } else {
                z = true;
                obj = objT2;
            }
            W0.i0.a(cVarB2, (String) null, AbstractC2415q.A(7, tVar, (Function0) obj, rVarE2, false), jE, tVar, 48, 0);
            tVar.q(z);
            r15 = z;
        } else {
            r15 = 1;
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1322x(q, c3711s0, i, r15);
        }
    }

    public static final void K(String str, boolean z, c1.o oVar, int i, int i2) {
        boolean z2;
        int i3;
        c1.o oVar2;
        boolean z3;
        Intrinsics.checkNotNullParameter(str, "title");
        c1.o oVar3 = (c1.t) oVar;
        oVar3.j0(-328194371);
        int i4 = (oVar3.f(str) ? 4 : 2) | i;
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (oVar3.g(z2) ? 32 : 16);
        }
        if (oVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z4 = i5 != 0 ? false : z2;
            c1.i1 i1Var = Ui.q.a;
            a2.g gVarA = AbstractC4612g7.a(((Ui.g) oVar3.j(i1Var)).C(), z4, new a2.g(str), null, oVar3, (i3 & 112) | 196608, 24);
            z3 = z4;
            oVar2 = oVar3;
            ej.B.I(gVarA, androidx.compose.foundation.layout.a.n(p1.o.a, 16), ((Ui.g) oVar3.j(i1Var)).C(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, ((Ui.e) oVar3.j(Ui.q.c)).c, oVar2, 48, 0, 262136);
        } else {
            oVar2 = oVar3;
            oVar2.b0();
            z3 = z2;
        }
        c1.z0 z0VarV = oVar2.v();
        if (z0VarV != null) {
            z0VarV.d = new r(str, i, i2, z3);
        }
    }

    public static final void L(int i, P3 p3, C0568n c0568n, c1.o oVar) throws Throwable {
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-1306472554);
        int i2 = (tVar.f(p3) ? 4 : 2) | i | (tVar.f(c0568n) ? 32 : 16);
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            bf.Q q = (bf.Q) tVar.j(aj.I.l);
            Function1 function1 = (Function1) tVar.j(aj.I.j);
            C0679z3 c0679z3 = c0568n.p().q;
            if (c0679z3 == null) {
                C0679z3.Companion.getClass();
                c0679z3 = C0679z3.d;
            }
            int i3 = i2 & 112;
            boolean zG = tVar.g(q.b) | (i3 == 32);
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (zG || objT == obj) {
                objT = o9.a.s(Zd.E.a, q.b, c0568n);
                tVar.s0(objT);
            }
            Zd.E e2 = (Zd.E) objT;
            boolean zF = ((i2 & 14) == 4) | tVar.f(q) | tVar.f(function1) | (i3 == 32);
            Object objT2 = tVar.T();
            if (zF || objT2 == obj) {
                b3 b3Var = new b3(p3, q, function1, c0568n, 14);
                tVar.s0(b3Var);
                objT2 = b3Var;
            }
            e((Function0) objT2, k1.h.d(1757473896, new Aj.s0(e2, c0679z3, c0568n, 19), tVar), tVar, 48, 0);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1270a(i, 3, p3, c0568n);
        }
    }

    public static final void M(t0.q qVar, p1.r rVar, boolean z, Function0 function0, c1.o oVar, int i) {
        int i2;
        Zn.L l;
        Function0 function02 = function0;
        Qk.F f2 = Qk.F.d;
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-2115247143);
        c1.d dVar = tVar.a;
        if ((i & 48) == 0) {
            i2 = (tVar.f(rVar) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= tVar.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tVar.h(function02) ? 2048 : 1024;
        }
        if (tVar.Y(i2 & 1, (i2 & 1169) != 1168)) {
            t0.s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar, 0);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
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
            p1.o oVar2 = p1.o.a;
            p1.r rVarD2 = androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.d.f(oVar2, 80), 1.0f);
            w1.s sVar = new w1.s(w1.s.j);
            c1.i1 i1Var = Ui.q.a;
            t0.n.a(androidx.compose.foundation.a.a(rVarD2, q7.b.t(kotlin.collections.z.m(new w1.s[]{sVar, new w1.s(((Ui.g) tVar.j(i1Var)).j())}), 0.0f, 0.0f, 14), (C0.e) null, 6), tVar, 0);
            p1.r rVarD3 = androidx.compose.foundation.layout.d.d(oVar2, 1.0f);
            int i3 = i2;
            long j = ((Ui.g) tVar.j(i1Var)).j();
            w1.L l2 = w1.M.a;
            p1.r rVarR = androidx.compose.foundation.layout.a.r(androidx.compose.foundation.a.b(rVarD3, j, l2), 0.0f, 16, 0.0f, 0.0f, 13);
            N1.d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode2 = Long.hashCode(tVar.T);
            c1.s0 s0VarL2 = tVar.l();
            p1.r rVarD4 = p1.a.d(tVar, rVarR);
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, hVar);
            c1.c.G(tVar, s0VarL2, hVar2);
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, tVar, iHashCode2, hVar3);
            }
            c1.c.G(tVar, rVarD4, hVar4);
            p1.r rVarB = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.d(oVar2, 1.0f), ((Ui.g) tVar.j(i1Var)).j(), l2);
            if (z) {
                Sk.w wVar = Qk.d1.a;
                Intrinsics.checkNotNullParameter(f2, "<this>");
                l = (Zn.L) Qk.d1.b.getValue();
            } else {
                Sk.w wVar2 = Qk.m1.a;
                Intrinsics.checkNotNullParameter(f2, "<this>");
                l = (Zn.L) Qk.m1.V.getValue();
            }
            String strE = N5.e(l, tVar, 0);
            ej.V v = AbstractC3199o.b;
            t0.d0 d0Var = W0.m.a;
            W0.l lVarA = W0.m.a(((Ui.g) tVar.j(i1Var)).t(), ((Ui.g) tVar.j(i1Var)).C(), 0L, 0L, tVar, 12);
            tVar = tVar;
            boolean z2 = (i3 & 7168) == 2048;
            Object objT = tVar.T();
            if (z2 || objT == c1.n.a) {
                function02 = function0;
                objT = new Aj.r(16, function02);
                tVar.s0(objT);
            } else {
                function02 = function0;
            }
            ej.B.f0(rVarB, strE, v, lVarA, false, false, (Function0) objT, tVar, 384, 48);
            tVar.q(true);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1305o((Object) qVar, (Object) rVar, z, (Sk.g) function02, i, 0);
        }
    }

    public static final void N(P3 p3, bf.Q q, C0614s1 c0614s1, c1.o oVar, int i) {
        c1.t tVar = (c1.t) oVar;
        tVar.j0(702582740);
        c1.d dVar = tVar.a;
        int i2 = i | (tVar.f(p3) ? 4 : 2) | (tVar.f(q) ? 32 : 16) | (tVar.f(c0614s1) ? 256 : 128);
        int i3 = 0;
        if (tVar.Y(i2 & 1, (i2 & 147) != 146)) {
            long jU = AbstractC4551a0.c(tVar).u();
            Object[] objArr = new Object[0];
            Object objT = tVar.T();
            int i4 = 7;
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = new Id.r(i4);
                tVar.s0(objT);
            }
            c1.f0 f0Var = (c1.f0) l1.l.c(objArr, (Function0) objT, tVar, 48);
            p1.o oVar2 = p1.o.a;
            p1.r rVarD = androidx.compose.foundation.layout.d.d(oVar2, 1.0f);
            boolean zE = tVar.e(jU);
            Object objT2 = tVar.T();
            if (zE || objT2 == obj) {
                objT2 = new D0.c(jU, 3);
                tVar.s0(objT2);
            }
            p1.r rVarR = androidx.compose.foundation.layout.a.r(androidx.compose.ui.draw.a.a(rVarD, (Function1) objT2), 24, 0.0f, 0.0f, 0.0f, 14);
            t0.f fVar = t0.j.c;
            p1.h hVar = p1.c.m;
            t0.s sVarA = t0.r.a(fVar, hVar, tVar, 0);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD2 = p1.a.d(tVar, rVarR);
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
            P1.h hVar2 = P1.j.f;
            c1.c.G(tVar, sVarA, hVar2);
            P1.h hVar3 = P1.j.e;
            c1.c.G(tVar, s0VarL, hVar3);
            P1.h hVar4 = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar4);
            }
            P1.h hVar5 = P1.j.d;
            c1.c.G(tVar, rVarD2, hVar5);
            p1.r rVarA = p1.a.a(oVar2, new C1311r0(f0Var, p3, q, i3));
            t0.j0 j0VarA = t0.h0.a(t0.j.a, p1.c.k, tVar, 48);
            int iHashCode2 = Long.hashCode(tVar.T);
            c1.s0 s0VarL2 = tVar.l();
            p1.r rVarD3 = p1.a.d(tVar, rVarA);
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, j0VarA, hVar2);
            c1.c.G(tVar, s0VarL2, hVar3);
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, tVar, iHashCode2, hVar4);
            }
            c1.c.G(tVar, rVarD3, hVar5);
            Qk.F f2 = Qk.F.d;
            Sk.w wVar = Qk.t0.a;
            Intrinsics.checkNotNullParameter(f2, "<this>");
            ej.B.H(N5.e((Zn.L) Qk.t0.E.getValue(), tVar, 0), null, AbstractC4551a0.c(tVar).C(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC4551a0.e(tVar).x, tVar, 0, 0, 131066);
            W0.i0.a(Zn.n.b(Qk.i.b(), tVar, 0), BuildConfig.FLAVOR, AbstractC4727t6.d(androidx.compose.foundation.layout.d.n(androidx.compose.foundation.layout.a.r(oVar2, 4, 0.0f, 0.0f, 0.0f, 14), 16), ((Number) j0.h.b(((Boolean) f0Var.getValue()).booleanValue() ? 180.0f : 0.0f, j0.e.r(0, 0, (j0.z) null, 7), (String) null, (Function1) null, tVar, 48, 28).getValue()).floatValue()), AbstractC4551a0.c(tVar).F(), tVar, 48, 0);
            tVar = tVar;
            tVar.q(true);
            p1.r rVarD4 = androidx.compose.foundation.layout.d.d(oVar2, 1.0f);
            t0.s sVarA2 = t0.r.a(fVar, hVar, tVar, 0);
            int iHashCode3 = Long.hashCode(tVar.T);
            c1.s0 s0VarL3 = tVar.l();
            p1.r rVarD5 = p1.a.d(tVar, rVarD4);
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, sVarA2, hVar2);
            c1.c.G(tVar, s0VarL3, hVar3);
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode3))) {
                A8.b.r(iHashCode3, tVar, iHashCode3, hVar4);
            }
            c1.c.G(tVar, rVarD5, hVar5);
            if (((Boolean) f0Var.getValue()).booleanValue()) {
                tVar.h0(278261313);
                Qk.F f3 = Qk.F.c;
                Sk.w wVar2 = Qk.E.a;
                Intrinsics.checkNotNullParameter(f3, "<this>");
                Zn.p pVar = (Zn.p) Qk.E.v.getValue();
                int i5 = c0614s1.a;
                ej.B.H(K5.l(pVar, i5, new Object[]{Integer.valueOf(i5), Integer.valueOf(c0614s1.b)}, tVar, 0), androidx.compose.foundation.layout.a.r(oVar2, 0.0f, 12, 0.0f, 0.0f, 13), AbstractC4551a0.c(tVar).F(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC4551a0.e(tVar).h, tVar, 48, 0, 131064);
                Intrinsics.checkNotNullParameter(f3, "<this>");
                Zn.p pVar2 = (Zn.p) Qk.E.B.getValue();
                int i6 = c0614s1.c;
                float f4 = 8;
                ej.B.H(K5.l(pVar2, i6, new Object[]{Integer.valueOf(i6)}, tVar, 0), androidx.compose.foundation.layout.a.r(oVar2, 0.0f, f4, 0.0f, 0.0f, 13), AbstractC4551a0.c(tVar).F(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC4551a0.e(tVar).h, tVar, 48, 0, 131064);
                Sk.w wVar3 = Qk.k0.a;
                Intrinsics.checkNotNullParameter(f2, "<this>");
                ej.B.H(N5.e((Zn.L) Qk.k0.d.getValue(), tVar, 0), androidx.compose.foundation.layout.a.r(oVar2, 0.0f, f4, 0.0f, 0.0f, 13), AbstractC4551a0.c(tVar).F(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, AbstractC4551a0.e(tVar).h, tVar, 48, 0, 131064);
                tVar = tVar;
            } else {
                tVar.h0(272443202);
            }
            tVar.q(false);
            tVar.q(true);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Aj.s0(p3, q, c0614s1, i, 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void O(int i, C0614s1 c0614s1, c1.o oVar, int i2) {
        int i3;
        boolean z;
        Qk.F f2 = Qk.F.c;
        p1.i iVar = p1.c.j;
        c1.t tVar = (c1.t) oVar;
        tVar.j0(772950184);
        c1.d dVar = tVar.a;
        int i4 = i2 | (tVar.d(i) ? 4 : 2) | (tVar.f(c0614s1) ? 32 : 16);
        if (tVar.Y(i4 & 1, (i4 & 19) != 18)) {
            c1.i1 i1Var = Ui.q.a;
            long jU = ((Ui.g) tVar.j(i1Var)).u();
            p1.o oVar2 = p1.o.a;
            p1.r rVarD = androidx.compose.foundation.layout.d.d(oVar2, 1.0f);
            boolean zE = tVar.e(jU);
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (zE || objT == obj) {
                objT = new D0.c(jU, 4);
                tVar.s0(objT);
            }
            p1.r rVarR = androidx.compose.foundation.layout.a.r(androidx.compose.ui.draw.a.a(rVarD, (Function1) objT), 24, 0.0f, 0.0f, 0.0f, 14);
            t0.s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar, 0);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD2 = p1.a.d(tVar, rVarR);
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
            p1.i iVar3 = p1.c.k;
            t0.d dVar2 = t0.j.a;
            t0.j0 j0VarA = t0.h0.a(dVar2, iVar3, tVar, 48);
            int iHashCode2 = Long.hashCode(tVar.T);
            c1.s0 s0VarL2 = tVar.l();
            p1.r rVarD3 = p1.a.d(tVar, oVar2);
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
            Qk.F f3 = Qk.F.d;
            Sk.w wVar = Qk.t0.a;
            Intrinsics.checkNotNullParameter(f3, "<this>");
            String strE = N5.e((Zn.L) Qk.t0.k.getValue(), tVar, 0);
            a2.U u = ((Ui.e) tVar.j(Ui.q.c)).x;
            long jC = ((Ui.g) tVar.j(i1Var)).C();
            n1.p pVar = AbstractC1310q0.a;
            Intrinsics.checkNotNullParameter(oVar2, "$this$gradientMaskAnimation");
            float fFloatValue = ((Number) j0.e.g(j0.e.p(BuildConfig.FLAVOR, tVar, 0), 0.0f, 1.6f, j0.e.o(j0.e.r(1500, 0, j0.B.d, 2), j0.W.a, 4), BuildConfig.FLAVOR, tVar, 29112, 0).c.getValue()).floatValue();
            long j = ((w1.s) ((Ui.g) tVar.j(i1Var)).p0.a.getValue()).a;
            boolean zC = tVar.c(fFloatValue) | tVar.e(j);
            Object objT2 = tVar.T();
            if (zC || objT2 == obj) {
                i3 = 1;
                objT2 = new Fi.a(fFloatValue, i3, j);
                tVar.s0(objT2);
            } else {
                i3 = 1;
            }
            boolean z2 = i3;
            ej.B.H(strE, androidx.compose.ui.draw.a.b(oVar2, (Function1) objT2), jC, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, u, tVar, 0, 0, 131064);
            tVar = tVar;
            tVar.q(z2);
            c1.h1 h1VarC = j0.h.c(i == z2 ? c0614s1.a : 0, j0.e.r(1000, 0, (j0.z) null, 6), tVar);
            c1.h1 h1VarC2 = j0.h.c(i == z2 ? c0614s1.b : 0, j0.e.r(1000, 0, (j0.z) null, 6), tVar);
            c1.h1 h1VarC3 = j0.h.c(i == 2 ? c0614s1.c : 0, j0.e.r(1000, 0, (j0.z) null, 6), tVar);
            if (i == z2) {
                tVar.h0(967992984);
                Sk.w wVar2 = Qk.E.a;
                Intrinsics.checkNotNullParameter(f2, "<this>");
                String strL = K5.l((Zn.p) Qk.E.v.getValue(), ((Number) h1VarC.getValue()).intValue(), new Object[]{Integer.valueOf(((Number) h1VarC.getValue()).intValue()), Integer.valueOf(((Number) h1VarC2.getValue()).intValue())}, tVar, 0);
                p1.r rVarR2 = androidx.compose.foundation.layout.a.r(oVar2, 0.0f, 8, 0.0f, 0.0f, 13);
                t0.j0 j0VarA2 = t0.h0.a(dVar2, iVar, tVar, 0);
                int iHashCode3 = Long.hashCode(tVar.T);
                c1.s0 s0VarL3 = tVar.l();
                p1.r rVarD4 = p1.a.d(tVar, rVarR2);
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
                ej.B.H(strL, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, new a2.U(((Ui.g) tVar.j(i1Var)).S(), P8.a.j(14), new e2.w(400), (e2.n) null, 0L, 0, 0, P8.a.j(20), 16646136), tVar, 0, 0, 131070);
                tVar = tVar;
                z = true;
                tVar.q(true);
                tVar.q(false);
                Unit unit = Unit.a;
            } else if (i == 2) {
                tVar.h0(968621602);
                p1.r rVarR3 = androidx.compose.foundation.layout.a.r(oVar2, 0.0f, 8, 0.0f, 0.0f, 13);
                t0.j0 j0VarA3 = t0.h0.a(dVar2, iVar, tVar, 0);
                int iHashCode4 = Long.hashCode(tVar.T);
                c1.s0 s0VarL4 = tVar.l();
                p1.r rVarD5 = p1.a.d(tVar, rVarR3);
                tVar.l0();
                if (tVar.S) {
                    tVar.k(iVar2);
                } else {
                    tVar.v0();
                }
                c1.c.G(tVar, j0VarA3, hVar);
                c1.c.G(tVar, s0VarL4, hVar2);
                if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode4))) {
                    A8.b.r(iHashCode4, tVar, iHashCode4, hVar3);
                }
                c1.c.G(tVar, rVarD5, hVar4);
                Sk.w wVar3 = Qk.E.a;
                Intrinsics.checkNotNullParameter(f2, "<this>");
                ej.B.H(K5.l((Zn.p) Qk.E.c.getValue(), ((Number) h1VarC3.getValue()).intValue(), new Object[]{Integer.valueOf(((Number) h1VarC3.getValue()).intValue())}, tVar, 0), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, new a2.U(((Ui.g) tVar.j(i1Var)).S(), P8.a.j(14), new e2.w(400), (e2.n) null, 0L, 0, 0, P8.a.j(20), 16646136), tVar, 0, 0, 131070);
                tVar = tVar;
                tVar.q(true);
                tVar.q(false);
                Unit unit2 = Unit.a;
                z = true;
            } else if (i != 3) {
                tVar.h0(969733262);
                tVar.q(false);
                Unit unit3 = Unit.a;
                z = z2;
            } else {
                tVar.h0(969212617);
                p1.r rVarR4 = androidx.compose.foundation.layout.a.r(oVar2, 0.0f, 8, 0.0f, 0.0f, 13);
                t0.j0 j0VarA4 = t0.h0.a(dVar2, iVar, tVar, 0);
                int iHashCode5 = Long.hashCode(tVar.T);
                c1.s0 s0VarL5 = tVar.l();
                p1.r rVarD6 = p1.a.d(tVar, rVarR4);
                tVar.l0();
                if (tVar.S) {
                    tVar.k(iVar2);
                } else {
                    tVar.v0();
                }
                c1.c.G(tVar, j0VarA4, hVar);
                c1.c.G(tVar, s0VarL5, hVar2);
                if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode5))) {
                    A8.b.r(iHashCode5, tVar, iHashCode5, hVar3);
                }
                c1.c.G(tVar, rVarD6, hVar4);
                Sk.w wVar4 = Qk.k0.a;
                Intrinsics.checkNotNullParameter(f3, "<this>");
                ej.B.H(N5.e((Zn.L) Qk.k0.d.getValue(), tVar, 0), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, new a2.U(((Ui.g) tVar.j(i1Var)).S(), P8.a.j(14), new e2.w(400), (e2.n) null, 0L, 0, 0, P8.a.j(20), 16646136), tVar, 0, 0, 131070);
                tVar = tVar;
                tVar.q(z2);
                tVar.q(false);
                Unit unit4 = Unit.a;
                z = z2;
            }
            tVar.q(z);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Ch.e(i, c0614s1, i2);
        }
    }

    public static final void P(int i, P3 p3, C0568n c0568n, c1.o oVar) {
        P3 p32 = p3;
        Intrinsics.checkNotNullParameter(p32, "model");
        Intrinsics.checkNotNullParameter(c0568n, "block");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-129647861);
        int i2 = (tVar.f(p32) ? 4 : 2) | i | (tVar.f(c0568n) ? 32 : 16);
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            bf.Q q = (bf.Q) tVar.j(aj.I.l);
            Object[] objArr = new Object[0];
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = new Id.r(6);
                tVar.s0(objT);
            }
            c1.d0 d0Var = (c1.d0) l1.l.c(objArr, (Function0) objT, tVar, 48);
            C0614s1 c0614s1 = c0568n.w;
            if (c0614s1 == null) {
                C0614s1.Companion.getClass();
                c0614s1 = C0614s1.d;
            }
            boolean zF = tVar.f(d0Var);
            Object objT2 = tVar.T();
            if (zF || objT2 == obj) {
                objT2 = new C1313s0(d0Var, null);
                tVar.s0(objT2);
            }
            c1.c.f(tVar, c0614s1, (Function2) objT2);
            p1.o oVar2 = p1.o.a;
            p1.r rVarB = androidx.compose.animation.b.b(androidx.compose.foundation.layout.d.d(oVar2, 1.0f), (j0.F0) null, 3);
            t0.s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar, 0);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
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
            c1.c.G(tVar, sVarA, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            boolean zF2 = tVar.f(c0614s1);
            Object objT3 = tVar.T();
            if (zF2 || objT3 == obj) {
                objT3 = c1.c.r(new C1324y(2, q, d0Var));
                tVar.s0(objT3);
            }
            p1.r rVarR = androidx.compose.foundation.layout.a.r(oVar2, 0.0f, 0.0f, 4, 0.0f, 11);
            Boolean bool = (Boolean) ((c1.h1) objT3).getValue();
            bool.getClass();
            p32 = p3;
            AbstractC4898e3.b(bool, rVarR, null, BuildConfig.FLAVOR, k1.h.d(-1728547658, new Fh.N((Object) c0614s1, p32, (Object) q, (Object) d0Var, 2), tVar), tVar, 27696, 4);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1270a(i, 1, p32, c0568n);
        }
    }

    public static final void Q(int i, P3 p3, C0568n c0568n, c1.o oVar) throws Throwable {
        int i2;
        bf.Q q;
        boolean z;
        Intrinsics.checkNotNullParameter(p3, "model");
        Intrinsics.checkNotNullParameter(c0568n, "block");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(611367971);
        if ((i & 6) == 0) {
            i2 = (tVar.f(p3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tVar.f(c0568n) ? 32 : 16;
        }
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            bf.A a2 = (bf.A) tVar.j(aj.I.m);
            bf.Q q2 = (bf.Q) tVar.j(aj.I.l);
            boolean z2 = a2.b;
            List list = c0568n.k().b;
            String str = c0568n.a;
            int i3 = i2 & 14;
            boolean zF = (i3 == 4) | tVar.f(q2);
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (zF || objT == obj) {
                objT = new C1315t0(p3, q2, 0);
                tVar.s0(objT);
            }
            c1.c.d(str, (Function1) objT, tVar);
            if (q2.b && z2) {
                q = q2;
                z = true;
            } else {
                q = q2;
                z = false;
            }
            String str2 = !c0568n.k().a.isEmpty() ? (String) CollectionsKt.U(c0568n.k().a) : BuildConfig.FLAVOR;
            boolean zF2 = tVar.f(q) | (i3 == 4) | tVar.h(list);
            Object objT2 = tVar.T();
            if (zF2 || objT2 == obj) {
                objT2 = new Fh.V(p3, q, list, 1);
                tVar.s0(objT2);
            }
            R(str2, z, list, (Function0) objT2, tVar, 0);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new He.l(p3, c0568n, i);
        }
    }

    public static final void R(String str, boolean z, List list, Function0 function0, c1.o oVar, int i) throws Throwable {
        c1.t tVar = (c1.t) oVar;
        tVar.j0(1797339576);
        int i2 = (tVar.f(str) ? 4 : 2) | i | (tVar.g(z) ? 32 : 16) | (tVar.h(list) ? 256 : 128) | (tVar.h(function0) ? 2048 : 1024);
        if (tVar.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z2 = (i2 & 7168) == 2048;
            Object objT = tVar.T();
            if (z2 || objT == c1.n.a) {
                objT = new Aj.r(18, function0);
                tVar.s0(objT);
            }
            e((Function0) objT, k1.h.d(-1084391670, new Bi.c(list, z, str, 5), tVar), tVar, 48, 0);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Ch.f(str, z, list, function0, i, 1);
        }
    }

    public static final void S(P3 p3, String str, String str2, ArrayList arrayList, c1.o oVar, int i) {
        Intrinsics.checkNotNullParameter(p3, "model");
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(str2, "segmentId");
        Intrinsics.checkNotNullParameter(arrayList, "slidesBlocks");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-324984621);
        c1.d dVar = tVar.a;
        int i2 = i | (tVar.f(p3) ? 4 : 2) | (tVar.f(str) ? 32 : 16) | (tVar.f(str2) ? 256 : 128) | (tVar.h(arrayList) ? 2048 : 1024);
        if (tVar.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = new C4066b(0);
                tVar.s0(objT);
            }
            C4066b c4066b = (C4066b) objT;
            AbstractC5019z.a(p3.l0, tVar, 0);
            p1.o oVar2 = p1.o.a;
            p1.r rVarD = androidx.compose.foundation.layout.d.d(oVar2, 1.0f);
            Object objT2 = tVar.T();
            if (objT2 == obj) {
                objT2 = new J0(c4066b, 0);
                tVar.s0(objT2);
            }
            p1.r rVarR = androidx.compose.foundation.layout.a.r(androidx.compose.ui.layout.a.g(rVarD, (Function1) objT2), 0.0f, 12, 0.0f, 0.0f, 13);
            t0.s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar, 0);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD2 = p1.a.d(tVar, rVarR);
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
            c1.c.G(tVar, rVarD2, hVar4);
            p1.r rVarM = androidx.compose.foundation.layout.d.m(oVar2, AbstractC2415q.O(tVar, c4066b.a.j()) + 32);
            N1.d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode2 = Long.hashCode(tVar.T);
            c1.s0 s0VarL2 = tVar.l();
            p1.r rVarD3 = p1.a.d(tVar, rVarM);
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, hVar);
            c1.c.G(tVar, s0VarL2, hVar2);
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, tVar, iHashCode2, hVar3);
            }
            c1.c.G(tVar, rVarD3, hVar4);
            p1.r rVarD4 = androidx.compose.foundation.layout.d.d(oVar2, 1.0f);
            boolean zH = tVar.h(arrayList) | ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objT3 = tVar.T();
            if (zH || objT3 == obj) {
                Aj.g1 g1Var = new Aj.g1(arrayList, p3, str, str2, 13);
                tVar.s0(g1Var);
                objT3 = g1Var;
            }
            AbstractC4773y7.b(rVarD4, null, null, false, null, null, null, false, null, (Function1) objT3, tVar, 6, 510);
            tVar.q(true);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Di.i(p3, str, str2, arrayList, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void T(Cf.P3 r35, java.lang.String r36, java.lang.String r37, sd.C4447m r38, int r39, c1.o r40, int r41) {
        /*
            Method dump skipped, instruction units count: 1039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ie.D.T(Cf.P3, java.lang.String, java.lang.String, sd.m, int, c1.o, int):void");
    }

    public static final void U(P3 p3, C3695k0 c3695k0, ArrayList arrayList, c1.o oVar, int i) {
        Intrinsics.checkNotNullParameter(p3, "model");
        Intrinsics.checkNotNullParameter(c3695k0, "messageItem");
        Intrinsics.checkNotNullParameter(arrayList, "slidesBlocks");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(1499251100);
        int i2 = (tVar.f(p3) ? 4 : 2) | i | (tVar.f(c3695k0) ? 32 : 16) | (tVar.h(arrayList) ? 256 : 128);
        if (tVar.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = c1.c.z(j0(arrayList));
                tVar.s0(objT);
            }
            c1.f0 f0Var = (c1.f0) objT;
            boolean zH = tVar.h(arrayList);
            Object objT2 = tVar.T();
            if (zH || objT2 == obj) {
                objT2 = new N0(arrayList, f0Var, null);
                tVar.s0(objT2);
            }
            c1.c.f(tVar, arrayList, (Function2) objT2);
            if (((List) f0Var.getValue()).isEmpty()) {
                tVar.h0(825068108);
                Object objT3 = tVar.T();
                if (objT3 == obj) {
                    objT3 = new Hd.s(17);
                    tVar.s0(objT3);
                }
                AbstractC1329a.a(p3, c3695k0, (Function1) objT3, tVar, (i2 & 112) | (i2 & 14) | 384, 0);
                tVar.q(false);
            } else {
                tVar.h0(825320913);
                V(p3, p3.p().a, c3695k0.a.a, (List) f0Var.getValue(), tVar, i2 & 14);
                tVar = tVar;
                tVar.q(false);
            }
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new I0(p3, c3695k0, arrayList, i, 0);
        }
    }

    public static final void V(P3 p3, String str, String str2, List list, c1.o oVar, int i) {
        Intrinsics.checkNotNullParameter(p3, "model");
        Intrinsics.checkNotNullParameter(str, "chatId");
        Intrinsics.checkNotNullParameter(str2, "segmentId");
        Intrinsics.checkNotNullParameter(list, "slidesDataList");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(1583353512);
        c1.d dVar = tVar.a;
        int i2 = i | (tVar.f(p3) ? 4 : 2) | (tVar.f(str) ? 32 : 16) | (tVar.f(str2) ? 256 : 128) | (tVar.h(list) ? 2048 : 1024);
        if (tVar.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = new C4066b(0);
                tVar.s0(objT);
            }
            C4066b c4066b = (C4066b) objT;
            Unit unit = Unit.a;
            int i3 = i2 & 14;
            int i4 = i2 & 896;
            boolean z = (i3 == 4) | (i4 == 256);
            Object objT2 = tVar.T();
            if (z || objT2 == obj) {
                objT2 = new O0(p3, null, str2);
                tVar.s0(objT2);
            }
            c1.c.f(tVar, unit, (Function2) objT2);
            AbstractC5019z.a(p3.l0, tVar, 0);
            p1.o oVar2 = p1.o.a;
            p1.r rVarF = androidx.compose.foundation.layout.d.f(androidx.compose.foundation.layout.d.d(oVar2, 1.0f), 149);
            Object objT3 = tVar.T();
            if (objT3 == obj) {
                objT3 = new J0(c4066b, 1);
                tVar.s0(objT3);
            }
            p1.r rVarG = androidx.compose.ui.layout.a.g(rVarF, (Function1) objT3);
            float f2 = 12;
            p1.r rVarR = androidx.compose.foundation.layout.a.r(rVarG, 0.0f, f2, 0.0f, 0.0f, 13);
            t0.s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar, 0);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarR);
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
            p1.r rVarM = androidx.compose.foundation.layout.d.m(oVar2, AbstractC2415q.O(tVar, c4066b.a.j()) + 32);
            N1.d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode2 = Long.hashCode(tVar.T);
            c1.s0 s0VarL2 = tVar.l();
            p1.r rVarD2 = p1.a.d(tVar, rVarM);
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, hVar);
            c1.c.G(tVar, s0VarL2, hVar2);
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, tVar, iHashCode2, hVar3);
            }
            c1.c.G(tVar, rVarD2, hVar4);
            p1.r rVarD3 = androidx.compose.foundation.layout.d.d(oVar2, 1.0f);
            t0.d0 d0VarB = androidx.compose.foundation.layout.a.b(2, 16, 0.0f);
            t0.h hVarG = t0.j.g(f2);
            boolean zH = tVar.h(list) | (i3 == 4) | ((i2 & 112) == 32) | (i4 == 256);
            Object objT4 = tVar.T();
            if (zH || objT4 == obj) {
                Aj.g1 g1Var = new Aj.g1(list, p3, str, str2, 14);
                tVar.s0(g1Var);
                objT4 = g1Var;
            }
            AbstractC4773y7.b(rVarD3, null, d0VarB, false, hVarG, null, null, false, null, (Function1) objT4, tVar, 24966, 490);
            tVar.q(true);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Di.i(p3, str, str2, list, i, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0177  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void W(java.lang.String r70, boolean r71, c1.o r72, int r73) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ie.D.W(java.lang.String, boolean, c1.o, int):void");
    }

    public static final void X(C3695k0 c3695k0, c1.o oVar, int i) throws Throwable {
        c1.z0 z0VarV;
        C1272a1 c1272a1;
        Intrinsics.checkNotNullParameter(c3695k0, "messageItem");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(630866358);
        int i2 = (i & 6) == 0 ? (tVar.f(c3695k0) ? 4 : 2) | i : i;
        if (tVar.Y(i2 & 1, (i2 & 3) != 2)) {
            List list = c3695k0.a.m;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                C0568n c0568n = (C0568n) obj;
                if (c0568n.i() && c0568n.p().l != null) {
                    D7 d7 = c0568n.p().l;
                    if (d7 == null) {
                        D7.Companion.getClass();
                        d7 = D7.b;
                    }
                    if (d7.a.length() > 0) {
                        arrayList.add(obj);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList(kotlin.collections.A.t(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                D7 d72 = ((C0568n) it.next()).p().l;
                if (d72 == null) {
                    D7.Companion.getClass();
                    d72 = D7.b;
                }
                arrayList2.add(d72.a);
            }
            List listP = CollectionsKt.P(arrayList2);
            if (listP.isEmpty()) {
                z0VarV = tVar.v();
                if (z0VarV != null) {
                    c1272a1 = new C1272a1(c3695k0, i, 0);
                    z0VarV.d = c1272a1;
                }
                return;
            }
            boolean zX = c3695k0.x();
            float f2 = 12;
            p1.r rVarR = androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.d.d(p1.o.a, 1.0f), 0.0f, f2, 0.0f, 0.0f, 13);
            t0.s sVarA = t0.r.a(t0.j.g(f2), p1.c.m, tVar, 6);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarR);
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
            tVar.h0(591229484);
            Iterator it2 = listP.iterator();
            while (it2.hasNext()) {
                W((String) it2.next(), zX, tVar, 0);
            }
            tVar.q(false);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        z0VarV = tVar.v();
        if (z0VarV != null) {
            c1272a1 = new C1272a1(c3695k0, i, 1);
            z0VarV.d = c1272a1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Y(Dc.Z6 r22, boolean r23, c1.o r24, int r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ie.D.Y(Dc.Z6, boolean, c1.o, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Z(int r18, Cf.P3 r19, Dc.C0568n r20, c1.o r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ie.D.Z(int, Cf.P3, Dc.n, c1.o):void");
    }

    public static final void a(int i, P3 p3, C0568n c0568n, c1.o oVar) throws Throwable {
        Intrinsics.checkNotNullParameter(p3, "model");
        Intrinsics.checkNotNullParameter(c0568n, "block");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-1885120790);
        int i2 = (tVar.f(p3) ? 4 : 2) | i | (tVar.f(c0568n) ? 32 : 16);
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            Function1 function1 = (Function1) tVar.j(aj.I.j);
            C0505g c0505gA = c0568n.a();
            boolean zF = tVar.f(function1) | ((i2 & 14) == 4) | tVar.f(c0505gA);
            Object objT = tVar.T();
            if (zF || objT == c1.n.a) {
                objT = new A0.e(p3, function1, c0505gA, 24);
                tVar.s0(objT);
            }
            e((Function0) objT, k1.h.d(-1180596648, new C0090f(18, c0505gA), tVar), tVar, 48, 0);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1270a(i, 0, p3, c0568n);
        }
    }

    public static final void a0(boolean z, h1 h1Var, String str, k1.c cVar, c1.o oVar, int i) throws Throwable {
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-516402712);
        int i2 = (tVar.g(z) ? 4 : 2) | i | (tVar.d(h1Var.ordinal()) ? 32 : 16) | (tVar.f(str) ? 256 : 128);
        if (tVar.Y(i2 & 1, (i2 & 1171) != 1170)) {
            z1 z1VarK0 = k0(false, tVar, 6);
            boolean zF = tVar.f(z1VarK0);
            Object objT = tVar.T();
            if (zF || objT == c1.n.a) {
                objT = new C1206x4(15, z1VarK0);
                tVar.s0(objT);
            }
            e((Function0) objT, k1.h.d(-1384239018, new Ee.D(h1Var, z1VarK0, z, str, cVar), tVar), tVar, 48, 0);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Ch.f(z, h1Var, str, cVar, i);
        }
    }

    public static final void b(P3 p3, C0568n c0568n, boolean z, c1.o oVar, int i) throws Throwable {
        bf.Q q;
        String str;
        p1.r rVar;
        int i2;
        int i3;
        Qk.F f2;
        Object obj;
        Throwable th2;
        float f3;
        char c2;
        int i4;
        c1.t tVar;
        int i5;
        float f4;
        Object obj2;
        boolean z2;
        Qk.F f5 = Qk.F.d;
        Intrinsics.checkNotNullParameter(p3, "model");
        Intrinsics.checkNotNullParameter(c0568n, "block");
        c1.t tVar2 = (c1.t) oVar;
        tVar2.j0(-593804299);
        c1.d dVar = tVar2.a;
        int i6 = i | (tVar2.f(p3) ? 4 : 2) | (tVar2.f(c0568n) ? 32 : 16) | (tVar2.g(z) ? 256 : 128);
        int i7 = 0;
        if (tVar2.Y(i6 & 1, (i6 & 147) != 146)) {
            bf.Q q2 = (bf.Q) tVar2.j(aj.I.l);
            y4.z zVar = (y4.z) tVar2.j(aj.I.i);
            Object objT = tVar2.T();
            Object obj3 = c1.n.a;
            if (objT == obj3) {
                objT = c1.c.o(kotlin.coroutines.g.a, tVar2);
                tVar2.s0(objT);
            }
            Mm.B b2 = (Mm.B) objT;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i8 = i6 & 14;
            int i9 = i6 & 896;
            boolean zF = (i8 == 4) | tVar2.f(q2) | (i9 == 256);
            Object objT2 = tVar2.T();
            if (zF || objT2 == obj3) {
                objT2 = new C1276c(p3, q2, z, i7);
                tVar2.s0(objT2);
            }
            c1.c.d(boolValueOf, (Function1) objT2, tVar2);
            p1.r rVarB = p1.o.a;
            float f6 = 12;
            p1.r rVarA = AbstractC4887c4.a(androidx.compose.foundation.a.b(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f(AbstractC4718s6.b(AbstractC4745v6.i(androidx.compose.foundation.layout.d.d(rVarB, 1.0f), f6, null, AbstractC4551a0.c(tVar2).P(), AbstractC4551a0.c(tVar2).P(), 6), C0.f.b(f6)), 72), AbstractC4551a0.c(tVar2).g(), C0.f.b(f6)), AbstractC4551a0.c(tVar2).t(), C0.f.b(f6)), (float) 0.5d, AbstractC4551a0.c(tVar2).O(), C0.f.b(f6));
            if (z) {
                tVar2.h0(584786653);
                tVar2.q(false);
                str = "<this>";
                i4 = i6;
                q = q2;
                obj = obj3;
                rVar = rVarB;
                i5 = 0;
                tVar = tVar2;
                i2 = i9;
                i3 = i8;
                f2 = f5;
                f3 = f6;
                c2 = ' ';
                th2 = null;
            } else {
                tVar2.h0(584787395);
                Intrinsics.checkNotNullParameter(rVarB, "<this>");
                float f7 = 1;
                long jC = ((Ui.g) tVar2.j(Ui.q.a)).c();
                float f8 = 120;
                Object objT3 = tVar2.T();
                if (objT3 == obj3) {
                    objT3 = new C1273b(f6, f7, f8, jC);
                    f6 = f6;
                    tVar2.s0(objT3);
                }
                C1273b c1273b = (C1273b) objT3;
                final float f9 = c1273b.a;
                final float f10 = c1273b.b;
                q = q2;
                final long j = c1273b.c;
                final float f11 = c1273b.d;
                str = "<this>";
                rVar = rVarB;
                i2 = i9;
                i3 = i8;
                f2 = f5;
                obj = obj3;
                th2 = null;
                f3 = f6;
                c2 = ' ';
                i4 = i6;
                final j0.I iG = j0.e.g(j0.e.p((String) null, tVar2, 1), 0.0f, 1.0f, j0.e.o(j0.e.r(2000, 0, j0.B.d, 2), j0.W.a, 4), (String) null, tVar2, 4536, 8);
                tVar = tVar2;
                boolean zC = tVar.c(f10) | tVar.c(f9) | tVar.c(f11) | tVar.f(iG) | tVar.e(j);
                Object objT4 = tVar.T();
                if (zC || objT4 == obj) {
                    objT4 = new Function1() { // from class: Ie.f
                        public final Object invoke(Object obj4) {
                            Pair pair;
                            float f12;
                            float f13;
                            long jFloatToRawIntBits;
                            long j2;
                            long jFloatToRawIntBits2;
                            int iFloatToRawIntBits;
                            long j3;
                            t1.d dVar2 = (t1.d) obj4;
                            Intrinsics.checkNotNullParameter(dVar2, "$this$drawWithCache");
                            final float fA = dVar2.a() * f10;
                            float fA2 = dVar2.a() * f9;
                            float fA3 = dVar2.a() * 1;
                            float f14 = fA2 - fA3;
                            final float fA4 = dVar2.a() * f11;
                            long j4 = 4294967295L;
                            float f15 = 2 * fA3;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar2.a.f() >> 32)) - f15;
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (dVar2.a.f() & 4294967295L)) - f15;
                            float f16 = f14 * 2.0f;
                            float f17 = fIntBitsToFloat - f16;
                            float f18 = fIntBitsToFloat2 - f16;
                            float f19 = (f14 * 3.1415927f) / 2.0f;
                            final float f20 = (4.0f * f19) + ((f17 + f18) * 2.0f);
                            final float f21 = (f20 / 2.0f) - fA4;
                            int iCeil = (int) Math.ceil(r9);
                            final int i10 = iCeil < 1 ? 1 : iCeil;
                            float f22 = f18;
                            final ArrayList arrayList = new ArrayList(i10);
                            int i11 = 0;
                            while (i11 < i10) {
                                long j5 = j4;
                                float f23 = ((((i11 / i10) * f20) % f20) + f20) % f20;
                                Iterator it = kotlin.collections.z.m(new Float[]{Float.valueOf(f17), Float.valueOf(f19), Float.valueOf(f22), Float.valueOf(f19), Float.valueOf(f17), Float.valueOf(f19), Float.valueOf(f22), Float.valueOf(f19)}).iterator();
                                int i12 = 0;
                                while (true) {
                                    if (it.hasNext()) {
                                        int i13 = i12 + 1;
                                        float fFloatValue = ((Number) it.next()).floatValue();
                                        if (f23 <= fFloatValue) {
                                            pair = new Pair(Integer.valueOf(i12), Float.valueOf(f23));
                                        } else {
                                            f23 -= fFloatValue;
                                            i12 = i13;
                                        }
                                    } else {
                                        pair = new Pair(0, Float.valueOf(0.0f));
                                    }
                                }
                                int iIntValue = ((Number) pair.a).intValue();
                                float fFloatValue2 = ((Number) pair.b).floatValue();
                                switch (iIntValue) {
                                    case 0:
                                        f12 = f14;
                                        f13 = f22;
                                        long jFloatToRawIntBits3 = Float.floatToRawIntBits(fA3 + f12 + fFloatValue2);
                                        jFloatToRawIntBits = Float.floatToRawIntBits(fA3);
                                        j2 = jFloatToRawIntBits3 << 32;
                                        j3 = (jFloatToRawIntBits & j5) | j2;
                                        break;
                                    case 1:
                                        f12 = f14;
                                        f13 = f22;
                                        long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits((fIntBitsToFloat + fA3) - f12)) << 32) | (((long) Float.floatToRawIntBits(fA3 + f12)) & j5);
                                        double d2 = ((((fFloatValue2 / f19) * 90.0f) - 90.0f) * 3.1415927f) / 180.0f;
                                        float fCos = (((float) Math.cos(d2)) * f12) + Float.intBitsToFloat((int) (jFloatToRawIntBits4 >> 32));
                                        float fSin = (((float) Math.sin(d2)) * f12) + Float.intBitsToFloat((int) (jFloatToRawIntBits4 & j5));
                                        jFloatToRawIntBits2 = Float.floatToRawIntBits(fCos);
                                        iFloatToRawIntBits = Float.floatToRawIntBits(fSin);
                                        j3 = (jFloatToRawIntBits2 << 32) | (((long) iFloatToRawIntBits) & j5);
                                        break;
                                    case 2:
                                        f12 = f14;
                                        f13 = f22;
                                        float f24 = fA3 + f12 + fFloatValue2;
                                        jFloatToRawIntBits2 = Float.floatToRawIntBits(fIntBitsToFloat + fA3);
                                        iFloatToRawIntBits = Float.floatToRawIntBits(f24);
                                        j3 = (jFloatToRawIntBits2 << 32) | (((long) iFloatToRawIntBits) & j5);
                                        break;
                                    case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                                        f12 = f14;
                                        f13 = f22;
                                        long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits((fIntBitsToFloat + fA3) - f12)) << 32) | (((long) Float.floatToRawIntBits((fIntBitsToFloat2 + fA3) - f12)) & j5);
                                        double d3 = ((((fFloatValue2 / f19) * 90.0f) + 0.0f) * 3.1415927f) / 180.0f;
                                        float fCos2 = (((float) Math.cos(d3)) * f12) + Float.intBitsToFloat((int) (jFloatToRawIntBits5 >> 32));
                                        float fSin2 = (((float) Math.sin(d3)) * f12) + Float.intBitsToFloat((int) (jFloatToRawIntBits5 & j5));
                                        jFloatToRawIntBits2 = Float.floatToRawIntBits(fCos2);
                                        iFloatToRawIntBits = Float.floatToRawIntBits(fSin2);
                                        j3 = (jFloatToRawIntBits2 << 32) | (((long) iFloatToRawIntBits) & j5);
                                        break;
                                    case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                                        f12 = f14;
                                        f13 = f22;
                                        jFloatToRawIntBits2 = Float.floatToRawIntBits(((fIntBitsToFloat + fA3) - f12) - fFloatValue2);
                                        iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat2 + fA3);
                                        j3 = (jFloatToRawIntBits2 << 32) | (((long) iFloatToRawIntBits) & j5);
                                        break;
                                    case 5:
                                        f12 = f14;
                                        f13 = f22;
                                        long jFloatToRawIntBits6 = (((long) Float.floatToRawIntBits(fA3 + f12)) << 32) | (((long) Float.floatToRawIntBits((fIntBitsToFloat2 + fA3) - f12)) & j5);
                                        double d4 = ((((fFloatValue2 / f19) * 90.0f) + 90.0f) * 3.1415927f) / 180.0f;
                                        float fCos3 = (((float) Math.cos(d4)) * f12) + Float.intBitsToFloat((int) (jFloatToRawIntBits6 >> 32));
                                        float fSin3 = (((float) Math.sin(d4)) * f12) + Float.intBitsToFloat((int) (jFloatToRawIntBits6 & j5));
                                        jFloatToRawIntBits2 = Float.floatToRawIntBits(fCos3);
                                        iFloatToRawIntBits = Float.floatToRawIntBits(fSin3);
                                        j3 = (jFloatToRawIntBits2 << 32) | (((long) iFloatToRawIntBits) & j5);
                                        break;
                                    case 6:
                                        f12 = f14;
                                        f13 = f22;
                                        long jFloatToRawIntBits7 = Float.floatToRawIntBits(fA3);
                                        jFloatToRawIntBits = Float.floatToRawIntBits(((fIntBitsToFloat2 + fA3) - f12) - fFloatValue2);
                                        j2 = jFloatToRawIntBits7 << 32;
                                        j3 = (jFloatToRawIntBits & j5) | j2;
                                        break;
                                    case 7:
                                        float f25 = fA3 + f14;
                                        f12 = f14;
                                        f13 = f22;
                                        long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits(f25)) << 32) | (((long) Float.floatToRawIntBits(f25)) & j5);
                                        double d5 = ((((fFloatValue2 / f19) * 90.0f) + 180.0f) * 3.1415927f) / 180.0f;
                                        float fCos4 = (((float) Math.cos(d5)) * f12) + Float.intBitsToFloat((int) (jFloatToRawIntBits8 >> 32));
                                        float fSin4 = (((float) Math.sin(d5)) * f12) + Float.intBitsToFloat((int) (jFloatToRawIntBits8 & j5));
                                        jFloatToRawIntBits2 = Float.floatToRawIntBits(fCos4);
                                        iFloatToRawIntBits = Float.floatToRawIntBits(fSin4);
                                        j3 = (jFloatToRawIntBits2 << 32) | (((long) iFloatToRawIntBits) & j5);
                                        break;
                                    default:
                                        j3 = 0;
                                        f12 = f14;
                                        f13 = f22;
                                        break;
                                }
                                arrayList.add(new v1.b(j3));
                                i11++;
                                j4 = j5;
                                f14 = f12;
                                f22 = f13;
                            }
                            final c1.h1 h1Var = iG;
                            final long j6 = j;
                            return dVar2.b(new Function1() { // from class: Ie.g
                                public final Object invoke(Object obj5) {
                                    P1.M m = (P1.M) obj5;
                                    Intrinsics.checkNotNullParameter(m, "$this$onDrawWithContent");
                                    m.b();
                                    float fFloatValue3 = ((Number) h1Var.getValue()).floatValue();
                                    float f26 = f20;
                                    float f27 = fFloatValue3 * f26;
                                    float f28 = fA4;
                                    float f29 = ((f27 + f28) + f21) % f26;
                                    int i14 = i10;
                                    long j7 = j6;
                                    float f30 = fA;
                                    ArrayList arrayList2 = arrayList;
                                    D.i0(f26, i14, f28, j7, m, f30, arrayList2, f27);
                                    D.i0(f26, i14, f28, j7, m, f30, arrayList2, f29);
                                    return Unit.a;
                                }
                            });
                        }
                    };
                    tVar.s0(objT4);
                }
                rVarB = androidx.compose.ui.draw.a.b(rVar, (Function1) objT4);
                i5 = 0;
                tVar.q(false);
            }
            p1.r rVarThen = rVarA.then(rVarB);
            float f12 = i5;
            Object objT5 = tVar.T();
            if (objT5 == obj) {
                objT5 = g6.a.p(tVar);
            }
            r0.l lVar = (r0.l) objT5;
            float f13 = f3;
            int i10 = i3;
            p1.r rVar2 = rVar;
            c1.t tVar3 = tVar;
            Object obj4 = obj;
            int i11 = i2;
            Qk.F f14 = f2;
            String str2 = str;
            bf.Q q3 = q;
            p1.r rVarA2 = p1.a.a(rVarThen, new C1293i(AbstractC4551a0.c(tVar).u(), AbstractC4551a0.c(tVar).t(), (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f13, tVar))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f13, tVar))) << c2), (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f12, tVar))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f12, tVar))) << c2), lVar, b2, p3, q3, zVar, c0568n, z));
            J1.q.a.getClass();
            p1.r rVarF = J1.s.f(rVarA2, J1.s.c);
            N1.d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode = Long.hashCode(tVar3.T);
            c1.s0 s0VarL = tVar3.l();
            p1.r rVarD = p1.a.d(tVar3, rVarF);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (dVar == null) {
                c1.c.v();
                throw th2;
            }
            tVar3.l0();
            if (tVar3.S) {
                tVar3.k(iVar);
            } else {
                tVar3.v0();
            }
            P1.h hVar = P1.j.f;
            c1.c.G(tVar3, d0VarD, hVar);
            P1.h hVar2 = P1.j.e;
            c1.c.G(tVar3, s0VarL, hVar2);
            P1.h hVar3 = P1.j.g;
            if (tVar3.S || !Intrinsics.b(tVar3.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar3, iHashCode, hVar3);
            }
            P1.h hVar4 = P1.j.d;
            c1.c.G(tVar3, rVarD, hVar4);
            if (z) {
                tVar3.h0(958558547);
            } else {
                tVar3.h0(964954312);
                A(tVar3, 6);
            }
            tVar3.q(false);
            p1.r rVarP = androidx.compose.foundation.layout.a.p(androidx.compose.foundation.layout.d.c, 16, 0.0f, 2);
            t0.j0 j0VarA = t0.h0.a(t0.j.a, p1.c.k, tVar3, 48);
            int iHashCode2 = Long.hashCode(tVar3.T);
            c1.s0 s0VarL2 = tVar3.l();
            p1.r rVarD2 = p1.a.d(tVar3, rVarP);
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
            Bb.b.a(Zn.n.b((Zn.f) AbstractC4551a0.d(tVar3).G.a.getValue(), tVar3, 0), null, androidx.compose.foundation.layout.d.n(rVar2, 40), null, null, 0.0f, null, tVar3, 432, 120);
            p1.r rVarR = androidx.compose.foundation.layout.a.r(rVar2, f13, 0.0f, 0.0f, 0.0f, 14);
            t0.s sVarA = t0.r.a(t0.j.g(2), p1.c.m, tVar3, 6);
            int iHashCode3 = Long.hashCode(tVar3.T);
            c1.s0 s0VarL3 = tVar3.l();
            p1.r rVarD3 = p1.a.d(tVar3, rVarR);
            tVar3.l0();
            if (tVar3.S) {
                tVar3.k(iVar);
            } else {
                tVar3.v0();
            }
            c1.c.G(tVar3, sVarA, hVar);
            c1.c.G(tVar3, s0VarL3, hVar2);
            if (tVar3.S || !Intrinsics.b(tVar3.T(), Integer.valueOf(iHashCode3))) {
                A8.b.r(iHashCode3, tVar3, iHashCode3, hVar3);
            }
            c1.c.G(tVar3, rVarD3, hVar4);
            ej.B.H(c0568n.b().f, null, AbstractC4551a0.c(tVar3).C(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, Ui.d.c(AbstractC4551a0.e(tVar3).e, tVar3), tVar3, 0, 0, 131066);
            if (z) {
                tVar3.h0(-2050095286);
                Sk.w wVar = Qk.G0.a;
                Intrinsics.checkNotNullParameter(f14, str2);
                f4 = 1.0f;
                obj2 = obj4;
                ej.B.H(N5.e((Zn.L) Qk.G0.y.getValue(), tVar3, 0), null, AbstractC4551a0.c(tVar3).F(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, Ui.d.c(AbstractC4551a0.e(tVar3).w, tVar3), tVar3, 0, 0, 131066);
                tVar2 = tVar3;
                tVar2.q(false);
            } else {
                tVar3.h0(-2050904727);
                Object objT6 = tVar3.T();
                if (objT6 == obj4) {
                    Sk.w wVar2 = Qk.G0.a;
                    Intrinsics.checkNotNullParameter(f14, str2);
                    String strP = Pf.B.p((Zn.L) Qk.G0.z.getValue());
                    Intrinsics.checkNotNullParameter(f14, str2);
                    String strP2 = Pf.B.p((Zn.L) Qk.G0.A.getValue());
                    Intrinsics.checkNotNullParameter(f14, str2);
                    objT6 = kotlin.collections.z.m(new String[]{strP, strP2, Pf.B.p((Zn.L) Qk.G0.B.getValue())});
                    tVar3.s0(objT6);
                }
                com.moonshot.kimichat.ui.a.j((List) objT6, androidx.compose.foundation.layout.d.d(rVar2, 1.0f), a2.U.a(Ui.d.c(AbstractC4551a0.e(tVar3).w, tVar3), AbstractC4551a0.c(tVar3).F(), 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 5, 0L, (a2.C) null, (l2.i) null, 0, 16744446), 0L, false, false, false, null, tVar3, 48, 248);
                tVar2 = tVar3;
                tVar2.q(false);
                obj2 = obj4;
                f4 = 1.0f;
            }
            tVar2.q(true);
            if (f4 <= 0.0d) {
                u0.a.a("invalid weight; must be greater than zero");
            }
            A8.b.p(f4, true, tVar2);
            if (z) {
                tVar2.h0(1989659763);
                z2 = false;
                String strE = N5.e(Qk.c0.a(), tVar2, 0);
                ej.V v = AbstractC3199o.c;
                a2.U uC = Ui.d.c(AbstractC4551a0.e(tVar2).i, tVar2);
                C0.e eVar = v.a;
                float f15 = v.b;
                float f16 = v.d;
                float f17 = v.e;
                float f18 = v.f;
                boolean z3 = v.g;
                boolean z4 = v.h;
                Intrinsics.checkNotNullParameter(eVar, "shape");
                Intrinsics.checkNotNullParameter(uC, "textStyle");
                ej.V v2 = new ej.V(eVar, f15, uC, f16, f17, f18, z3, z4);
                t0.d0 d0Var = W0.m.a;
                c1.t tVar4 = tVar2;
                W0.l lVarA = W0.m.a(AbstractC4551a0.c(tVar2).j(), AbstractC4551a0.c(tVar2).C(), AbstractC4551a0.c(tVar2).j(), AbstractC4551a0.c(tVar2).C(), tVar4, 0);
                tVar2 = tVar4;
                boolean zH = tVar2.h(b2) | (i10 == 4) | tVar2.f(q3) | tVar2.h(zVar) | ((i4 & 112) == 32) | (i11 == 256);
                Object objT7 = tVar2.T();
                if (zH || objT7 == obj2) {
                    C1279d c1279d = new C1279d(b2, p3, q3, zVar, c0568n, z);
                    tVar2.s0(c1279d);
                    objT7 = c1279d;
                }
                ej.B.f0(null, strE, v2, lVarA, false, false, (Function0) objT7, tVar2, 0, 49);
            } else {
                z2 = false;
                tVar2.h0(1981186967);
            }
            tVar2.q(z2);
            tVar2.q(true);
            tVar2.q(true);
        } else {
            tVar2.b0();
        }
        c1.z0 z0VarV = tVar2.v();
        if (z0VarV != null) {
            z0VarV.d = new C1282e(p3, c0568n, z, i, 0);
        }
    }

    public static final void b0(int i, P3 p3, C0568n c0568n, c1.o oVar) throws Throwable {
        Object p1Var;
        z1 z1Var;
        boolean z;
        boolean z2;
        Object x1Var;
        C4068d c4068d;
        C0680z4 c0680z4;
        bf.Q q;
        c1.f0 f0Var;
        boolean z3;
        Object u;
        P3 p32 = p3;
        C0568n c0568n2 = c0568n;
        Intrinsics.checkNotNullParameter(p32, "model");
        Intrinsics.checkNotNullParameter(c0568n2, "block");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-102647869);
        int i2 = (tVar.f(p32) ? 4 : 2) | i | (tVar.f(c0568n2) ? 32 : 16);
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = c1.c.o(kotlin.coroutines.g.a, tVar);
                tVar.s0(objT);
            }
            Mm.B b2 = (Mm.B) objT;
            bf.Q q2 = (bf.Q) tVar.j(aj.I.l);
            String str = q2.a;
            String str2 = c0568n2.a;
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            boolean zF = (i3 == 4) | tVar.f(q2) | (i4 == 32);
            Object objT2 = tVar.T();
            if (zF || objT2 == obj) {
                objT2 = new u1(p32, c0568n2, null, q2);
                tVar.s0(objT2);
            }
            c1.c.h(str, str2, (Function2) objT2, tVar);
            boolean z4 = (c0568n2.p().r.isEmpty() && !c0568n2.p().d && q2.b) ? false : true;
            boolean zF2 = tVar.f(c0568n2.p().b);
            Object objT3 = tVar.T();
            if (zF2 || objT3 == obj) {
                C2424a c2424a = Zd.B.b;
                String str3 = c0568n2.p().b;
                c2424a.getClass();
                objT3 = C2424a.k(str3);
                tVar.s0(objT3);
            }
            Zd.B b3 = (Zd.B) objT3;
            if (b3 == Zd.B.m) {
                tVar.h0(34675203);
                boolean zH = tVar.h(b2) | (i4 == 32) | (i3 == 4) | tVar.f(q2);
                Object objT4 = tVar.T();
                if (zH || objT4 == obj) {
                    b3 b3Var = new b3(b2, c0568n2, p32, q2, 13);
                    tVar.s0(b3Var);
                    objT4 = b3Var;
                }
                e((Function0) objT4, k1.h.d(-117213027, new C0836g(2, z4), tVar), tVar, 48, 0);
                tVar.q(false);
            } else if (b3 == Zd.B.d) {
                tVar.h0(35640574);
                e(null, k1.h.d(-354128620, new k1(c0568n2, z4), tVar), tVar, 48, 1);
                tVar.q(false);
            } else if (b3.d() && Intrinsics.b(q2.f, R4.d)) {
                tVar.h0(36236270);
                Object objT5 = tVar.T();
                if (objT5 == obj) {
                    objT5 = new C4068d(BuildConfig.FLAVOR);
                    tVar.s0(objT5);
                }
                C4068d c4068d2 = (C4068d) objT5;
                Object objT6 = tVar.T();
                if (objT6 == obj) {
                    objT6 = c1.c.z(BuildConfig.FLAVOR);
                    tVar.s0(objT6);
                }
                c1.f0 f0Var2 = (c1.f0) objT6;
                String str4 = c0568n2.p().c;
                C0680z4 c0680z42 = q2.h;
                boolean zF3 = (i4 == 32) | tVar.f(q2);
                Object objT7 = tVar.T();
                if (zF3 || objT7 == obj) {
                    c4068d = c4068d2;
                    c0680z4 = c0680z42;
                    q = q2;
                    f0Var = f0Var2;
                    z3 = true;
                    x1Var = new x1(c0568n2, q, c4068d, f0Var, null);
                    tVar.s0(x1Var);
                } else {
                    c0680z4 = c0680z42;
                    x1Var = objT7;
                    f0Var = f0Var2;
                    q = q2;
                    c4068d = c4068d2;
                    z3 = true;
                }
                c1.c.h(str4, c0680z4, (Function2) x1Var, tVar);
                boolean zF4 = (i3 == 4 ? z3 : false) | tVar.f(q) | (i4 == 32 ? z3 : false);
                Object objT8 = tVar.T();
                if (zF4 || objT8 == obj) {
                    c1.f0 f0Var3 = f0Var;
                    u = new Fh.U(2, p3, q, c0568n, c4068d, f0Var3);
                    p32 = p3;
                    c0568n2 = c0568n;
                    f0Var = f0Var3;
                    tVar.s0(u);
                } else {
                    c0568n2 = c0568n;
                    u = objT8;
                    p32 = p3;
                }
                e((Function0) u, k1.h.d(161391829, new Bi.c(c0568n2, z4, f0Var, 6), tVar), tVar, 48, 0);
                tVar.q(false);
            } else {
                p32 = p3;
                if (b3 == Zd.B.e) {
                    tVar.h0(37381038);
                    w(c0568n2, z4, tVar, (i2 >> 3) & 14);
                    tVar.q(false);
                } else if (b3 == Zd.B.S) {
                    tVar.h0(37550949);
                    if (AbstractC1816b.d() && Intrinsics.b(p32.p().d().a, "sale")) {
                        tVar.h0(37622714);
                        AbstractC4674n6.a(((i2 << 3) & 112) | ((i2 >> 3) & 14), p32, c0568n2, tVar);
                        z2 = false;
                    } else {
                        z2 = false;
                        tVar.h0(28798719);
                    }
                    tVar.q(z2);
                    tVar.q(z2);
                } else if (b3 == Zd.B.f) {
                    tVar.h0(37825609);
                    H7.a(c0568n2, z4, tVar, (i2 >> 3) & 14);
                    tVar.q(false);
                } else if (b3 == Zd.B.T || b3 == Zd.B.U || b3 == Zd.B.V || b3 == Zd.B.W) {
                    tVar.h0(38009501);
                    y4.z zVar = (y4.z) tVar.j(aj.I.i);
                    List list = c0568n2.p().r;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((C0486d7) obj2).f != null) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.A.t(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        C0549k7 c0549k7 = ((C0486d7) it.next()).f;
                        if (c0549k7 == null) {
                            C0549k7.Companion.getClass();
                            c0549k7 = C0549k7.g;
                        }
                        arrayList2.add(c0549k7);
                    }
                    C0549k7 c0549k72 = (C0549k7) CollectionsKt.firstOrNull(arrayList2);
                    z1 z1VarK0 = k0(false, tVar, 6);
                    boolean zF5 = (i3 == 4) | tVar.f(q2) | (i4 == 32) | tVar.f(c0549k72) | tVar.h(zVar) | tVar.g(z4) | tVar.f(z1VarK0);
                    Object objT9 = tVar.T();
                    if (zF5 || objT9 == obj) {
                        z1Var = z1VarK0;
                        z = z4;
                        p1Var = new p1(p32, q2, c0549k72, zVar, z, c0568n, z1Var);
                        c0568n2 = c0568n;
                        tVar.s0(p1Var);
                    } else {
                        p1Var = objT9;
                        z1Var = z1VarK0;
                        z = z4;
                    }
                    e((Function0) p1Var, k1.h.d(-2071493671, new q1(c0568n2, z, z1Var), tVar), tVar, 48, 0);
                    tVar.q(false);
                } else if (c0568n2.p().l != null || Intrinsics.b(c0568n2.p().b, "add_cron_job")) {
                    tVar.h0(39068461);
                    o(c0568n2, tVar, (i2 >> 3) & 14);
                    tVar.q(false);
                } else if (c0568n2.p().q != null) {
                    tVar.h0(39152378);
                    L(i2 & 126, p32, c0568n2, tVar);
                    tVar.q(false);
                } else {
                    tVar.h0(39240015);
                    AbstractC1329a.h(i2 & 126, p32, c0568n2, tVar);
                    tVar.q(false);
                }
            }
            p32 = p3;
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1270a(i, 4, p32, c0568n2);
        }
    }

    public static final void c(P3 p3, C0568n c0568n, boolean z, c1.o oVar, int i) {
        Object c1279d;
        bf.Q q;
        y4.z zVar;
        Mm.B b2;
        Intrinsics.checkNotNullParameter(p3, "model");
        Intrinsics.checkNotNullParameter(c0568n, "block");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-331790599);
        int i2 = i | (tVar.f(p3) ? 4 : 2) | (tVar.f(c0568n) ? 32 : 16) | (tVar.g(z) ? 256 : 128);
        if (tVar.Y(i2 & 1, (i2 & 147) != 146)) {
            bf.Q q2 = (bf.Q) tVar.j(aj.I.l);
            y4.z zVar2 = (y4.z) tVar.j(aj.I.i);
            Object objT = tVar.T();
            c1.X x = c1.n.a;
            if (objT == x) {
                objT = c1.c.o(kotlin.coroutines.g.a, tVar);
                tVar.s0(objT);
            }
            Mm.B b3 = (Mm.B) objT;
            String str = c0568n.b().d;
            float f2 = 16;
            p1.r rVarD = androidx.compose.foundation.layout.d.d(p1.o.a, 1.0f);
            float f3 = 20;
            c1.i1 i1Var = Ui.q.a;
            p1.r rVarR = androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.a.p(AbstractC4887c4.a(androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.f(AbstractC4718s6.b(AbstractC4745v6.i(rVarD, f3, null, ((Ui.g) tVar.j(i1Var)).P(), ((Ui.g) tVar.j(i1Var)).P(), 6), C0.f.b(f3)), AbstractC5709r0.g(tVar).b * 0.5f), ((Ui.g) tVar.j(i1Var)).j(), C0.f.b(f3)), (float) 0.5d, ((Ui.g) tVar.j(i1Var)).O(), C0.f.b(f3)), f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, f2, 7);
            boolean zH = ((i2 & 112) == 32) | tVar.h(b3) | ((i2 & 14) == 4) | tVar.f(q2) | ((i2 & 896) == 256) | tVar.h(zVar2);
            Object objT2 = tVar.T();
            if (zH || objT2 == x) {
                q = q2;
                zVar = zVar2;
                b2 = b3;
                c1279d = new C1279d(b2, p3, q, z, zVar, c0568n, 1);
                tVar.s0(c1279d);
            } else {
                c1279d = objT2;
                q = q2;
                zVar = zVar2;
                b2 = b3;
            }
            f(AbstractC2415q.A(7, tVar, (Function0) c1279d, rVarR, false), f2, k1.h.d(-538952576, new C1301m(b2, p3, q, z, zVar, c0568n, str), tVar), tVar, 432);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1282e(p3, c0568n, z, i, 1);
        }
    }

    public static final void c0(boolean z, final boolean z2, k1.c cVar, c1.o oVar, int i) {
        k1.c cVar2;
        int i2;
        float f2;
        float f3;
        p1.r rVar;
        r0.l lVar;
        float f4;
        final float f5;
        float f6;
        final boolean z3 = z;
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-2055558841);
        int i3 = i | (tVar.g(z3) ? 4 : 2) | (tVar.g(z2) ? 32 : 16);
        if (tVar.Y(i3 & 1, (i3 & 147) != 146)) {
            a2.U u = ((Ui.e) tVar.j(Ui.q.c)).h;
            Intrinsics.checkNotNullParameter("Hello", "text");
            Intrinsics.checkNotNullParameter(u, "style");
            long jB = n2.b.b(0, 0, 15);
            a2.S sI = a2.J.i(0, tVar, 1);
            Object objT = tVar.T();
            c1.X x = c1.n.a;
            if (objT == x) {
                objT = a2.S.a(sI, "Hello", u, jB, 988);
                tVar.s0(objT);
            }
            int i4 = (int) (((a2.P) objT).c & 4294967295L);
            int iQ = (int) AbstractC2415q.Q(20, tVar);
            final int i5 = i4 < iQ ? iQ : i4;
            final float f7 = 2;
            float f8 = z3 ? 10 : 8;
            float f9 = z2 ? 10 : 8;
            float f10 = 12;
            Object objT2 = tVar.T();
            if (objT2 == x) {
                objT2 = g6.a.p(tVar);
            }
            r0.l lVar2 = (r0.l) objT2;
            float f11 = 22;
            final float f12 = (float) 0.5d;
            c1.i1 i1Var = Ui.q.a;
            final long jO = ((Ui.g) tVar.j(i1Var)).O();
            Object objT3 = tVar.T();
            if (objT3 == x) {
                i2 = i3;
                f2 = f9;
                f3 = f11;
                objT3 = new w1.h(new DashPathEffect(new float[]{6.0f, 6.0f}, 0.0f));
                tVar.s0(objT3);
            } else {
                i2 = i3;
                f2 = f9;
                f3 = f11;
            }
            final w1.h hVar = (w1.h) objT3;
            float f13 = 0;
            p1.r rVarA = p1.a.a(p1.o.a, new Gi.b(((Ui.g) tVar.j(i1Var)).u(), ((Ui.g) tVar.j(i1Var)).t(), (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f13, tVar))) << 32) | (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f13, tVar))) & 4294967295L), (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f13, tVar))) << 32) | (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f13, tVar))) & 4294967295L), lVar2, 1));
            J1.q.a.getClass();
            p1.r rVarF = J1.s.f(rVarA, J1.s.c);
            boolean zE = ((i2 & 14) == 4) | tVar.e(jO) | tVar.c(f8) | tVar.h(hVar) | ((i2 & 112) == 32) | tVar.d(i5);
            Object objT4 = tVar.T();
            if (zE || objT4 == x) {
                rVar = rVarF;
                lVar = lVar2;
                final float f14 = f3;
                z3 = z;
                f4 = f10;
                f5 = f8;
                f6 = f2;
                Function1 function1 = new Function1() { // from class: Ie.y1
                    public final Object invoke(Object obj) {
                        float f15;
                        float f16;
                        float f17;
                        y1.d dVar = (y1.d) obj;
                        Intrinsics.checkNotNullParameter(dVar, "$this$drawBehind");
                        float fL0 = dVar.l0(f14);
                        float f18 = f12;
                        float fL02 = fL0 - (dVar.l0(f18) / 2.0f);
                        boolean z4 = z3;
                        long j = jO;
                        float f19 = f5;
                        float f20 = f7;
                        w1.h hVar2 = hVar;
                        if (z4) {
                            f15 = 2.0f;
                            f16 = fL02;
                            f17 = f20;
                        } else {
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((dVar.l0(f18) / 2.0f) + fL02)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                            float fL03 = (dVar.l0(f18) / 2.0f) + fL02;
                            f15 = 2.0f;
                            f16 = fL02;
                            f17 = f20;
                            y1.d.S(dVar, j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(dVar.l0(f19 - f20))) & 4294967295L) | (Float.floatToRawIntBits(fL03) << 32), dVar.l0(f18), 0, hVar2, 464);
                        }
                        if (!z2) {
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((dVar.l0(f18) / f15) + f16)) << 32) | (((long) Float.floatToRawIntBits(dVar.l0(f19 + f17) + i5)) & 4294967295L);
                            float fL04 = (dVar.l0(f18) / f15) + f16;
                            y1.d.S(dVar, j, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (dVar.f() & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fL04) << 32), dVar.l0(f18), 0, hVar2, 464);
                        }
                        return Unit.a;
                    }
                };
                tVar.s0(function1);
                objT4 = function1;
            } else {
                z3 = z;
                rVar = rVarF;
                f4 = f10;
                f5 = f8;
                lVar = lVar2;
                f6 = f2;
            }
            p1.r rVarQ = androidx.compose.foundation.layout.a.q(androidx.compose.ui.draw.a.a(rVar, (Function1) objT4), f4, f5, f4, f6);
            N1.d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarQ);
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
            P1.h hVar2 = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar2);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            cVar2 = cVar;
            c1.c.a(aj.I.o.a(lVar), k1.h.d(1447224641, new Ee.A(cVar2, 6), tVar), tVar, 56);
            tVar.q(true);
        } else {
            cVar2 = cVar;
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new r1(z3, z2, cVar2, i);
        }
    }

    public static final void d(C0568n c0568n, c1.o oVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(c0568n, "block");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(195427736);
        if ((i & 6) == 0) {
            i2 = (tVar.f(c0568n) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tVar.Y(i2 & 1, (i2 & 3) != 2)) {
            bf.Q q = (bf.Q) tVar.j(aj.I.l);
            boolean zF = tVar.f(c0568n.b().d);
            Object objT = tVar.T();
            if (zF || objT == c1.n.a) {
                objT = c1.c.r(new C1316u(c0568n, 0));
                tVar.s0(objT);
            }
            c1.h1 h1Var = (c1.h1) objT;
            float f2 = 12;
            p1.r rVarA = AbstractC4887c4.a(AbstractC4718s6.b(androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.d(p1.o.a, 1.0f), 0.0f, 410, 1), C0.f.b(f2)), (float) 0.5d, ((Ui.g) tVar.j(Ui.q.a)).O(), C0.f.b(f2));
            t0.s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar, 0);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarA);
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
            J(q, (C3711s0) h1Var.getValue(), tVar, 0);
            I(q, (C3711s0) h1Var.getValue(), tVar, 0);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1318v(c0568n, i, 0, (byte) 0);
        }
    }

    public static final void d0(C3695k0 c3695k0, List list, c1.o oVar, int i) {
        Intrinsics.checkNotNullParameter(c3695k0, "messageItem");
        Intrinsics.checkNotNullParameter(list, "blockNodes");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(138619235);
        int i2 = (tVar.f(c3695k0) ? 4 : 2) | i | (tVar.h(list) ? 32 : 16);
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            float f2 = 10;
            p1.r rVarB = AbstractC4718s6.b(AbstractC4887c4.a(androidx.compose.foundation.layout.d.d(p1.o.a, 1.0f), (float) 0.5d, ((Ui.g) tVar.j(Ui.q.a)).O(), C0.f.b(f2)), C0.f.b(f2));
            t0.s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar, 0);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
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
            c1.c.G(tVar, sVarA, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            tVar.h0(1272909447);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    kotlin.collections.z.s();
                    throw null;
                }
                c0(i3 == 0, i3 == list.size() - 1, k1.h.d(656167076, new V0(c3695k0, (C3712t) obj), tVar), tVar, 384);
                i3 = i4;
            }
            tVar.q(false);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Q(c3695k0, list, i, 2);
        }
    }

    public static final void e(Function0 function0, k1.c cVar, c1.o oVar, int i, int i2) throws Throwable {
        Function0 function02;
        int i3;
        Function0 function03;
        Function0 function04;
        float f2;
        Throwable th2;
        Intrinsics.checkNotNullParameter(cVar, FirebaseAnalytics.Param.CONTENT);
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-1362187701);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function02 = function0;
        } else {
            function02 = function0;
            i3 = i | (tVar.h(function02) ? 4 : 2);
        }
        if (tVar.Y(i3 & 1, (i3 & 19) != 18)) {
            if (i4 != 0) {
                function02 = null;
            }
            bf.A a2 = (bf.A) tVar.j(aj.I.m);
            r0.l lVar = (r0.l) tVar.j(aj.I.o);
            p1.r rVarO = p1.o.a;
            p1.r rVarD = androidx.compose.foundation.layout.d.d(rVarO, 1.0f);
            if (a2.f == EnumC3710s.d) {
                tVar.h0(-2082454445);
                tVar.q(false);
                if (function02 != null) {
                    rVarO = p1.a.a(rVarO, new D0.n1(2, function02, lVar));
                }
                function04 = function02;
                th2 = null;
            } else {
                tVar.h0(-2082114189);
                c1.i1 i1Var = Ui.q.a;
                float f3 = 10;
                p1.r rVarA = AbstractC4887c4.a(rVarO, (float) 0.5d, ((Ui.g) tVar.j(i1Var)).O(), C0.f.b(f3));
                if (function02 != null) {
                    tVar.h0(-2081783822);
                    float f4 = 0;
                    Object objT = tVar.T();
                    if (objT == c1.n.a) {
                        objT = g6.a.p(tVar);
                    }
                    long jU = ((Ui.g) tVar.j(i1Var)).u();
                    long jT = ((Ui.g) tVar.j(i1Var)).t();
                    th2 = null;
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f3, tVar))) << 32) | (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f3, tVar))) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f4, tVar))) & 4294967295L) | (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f4, tVar))) << 32);
                    f2 = f3;
                    function04 = function02;
                    p1.r rVarA2 = p1.a.a(rVarO, new Aj.x0(jU, jT, jFloatToRawIntBits, jFloatToRawIntBits2, (r0.l) objT, function04, 4));
                    J1.q.a.getClass();
                    rVarO = J1.s.f(rVarA2, J1.s.c);
                    tVar.q(false);
                } else {
                    function04 = function02;
                    f2 = f3;
                    th2 = null;
                    tVar.h0(-2081586321);
                    tVar.q(false);
                }
                rVarO = androidx.compose.foundation.layout.a.o(rVarA.then(rVarO), 12, f2);
                tVar.q(false);
            }
            p1.r rVarThen = rVarD.then(rVarO);
            N1.d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD2 = p1.a.d(tVar, rVarThen);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar.a == null) {
                c1.c.v();
                throw th2;
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
            c1.c.G(tVar, rVarD2, P1.j.d);
            s3.e.p(6, cVar, tVar, true);
            function03 = function04;
        } else {
            tVar.b0();
            function03 = function02;
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Af.f(function03, cVar, i, i2, 9);
        }
    }

    public static final void e0(int i, P3 p3, C0568n c0568n, c1.o oVar) {
        Intrinsics.checkNotNullParameter(p3, "model");
        Intrinsics.checkNotNullParameter(c0568n, "block");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-1584327267);
        c1.d dVar = tVar.a;
        int i2 = (tVar.f(p3) ? 4 : 2) | i | (tVar.f(c0568n) ? 32 : 16);
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            m8 m8Var = c0568n.r;
            if (m8Var == null) {
                m8.Companion.getClass();
                m8Var = m8.c;
            }
            List list = m8Var.a;
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = new C4066b(0);
                tVar.s0(objT);
            }
            C4066b c4066b = (C4066b) objT;
            p1.o oVar2 = p1.o.a;
            p1.r rVarD = androidx.compose.foundation.layout.d.d(oVar2, 1.0f);
            Object objT2 = tVar.T();
            if (objT2 == obj) {
                objT2 = new J0(c4066b, 2);
                tVar.s0(objT2);
            }
            p1.r rVarR = androidx.compose.foundation.layout.a.r(androidx.compose.ui.layout.a.g(rVarD, (Function1) objT2), 0.0f, 12, 0.0f, 0.0f, 13);
            t0.s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar, 0);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD2 = p1.a.d(tVar, rVarR);
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
            c1.c.G(tVar, rVarD2, hVar4);
            p1.r rVarM = androidx.compose.foundation.layout.d.m(oVar2, AbstractC2415q.O(tVar, c4066b.a.j()) + 32);
            N1.d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode2 = Long.hashCode(tVar.T);
            c1.s0 s0VarL2 = tVar.l();
            p1.r rVarD3 = p1.a.d(tVar, rVarM);
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, d0VarD, hVar);
            c1.c.G(tVar, s0VarL2, hVar2);
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, tVar, iHashCode2, hVar3);
            }
            c1.c.G(tVar, rVarD3, hVar4);
            h0(c4066b.a.j(), p3, list, tVar, (i2 << 3) & 112);
            tVar.q(true);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1270a(i, 5, p3, c0568n);
        }
    }

    public static final void f(p1.r rVar, float f2, k1.c cVar, c1.o oVar, int i) {
        float f3;
        c1.t tVar = (c1.t) oVar;
        tVar.j0(548618069);
        int i2 = (tVar.f(rVar) ? 4 : 2) | i;
        if (tVar.Y(i2 & 1, (i2 & 147) != 146)) {
            f3 = f2;
            AbstractC2415q.e(new c1.y0[0], f3, f2, false, k1.h.d(-295905472, new C1303n(rVar, cVar), tVar), tVar, 432, 8);
        } else {
            f3 = f2;
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new He.d(rVar, f3, cVar, i);
        }
    }

    public static final void f0(p1.r rVar, P3 p3, int i, bf.Q q, F1 f1, List list, c1.o oVar, int i2) {
        c1.t tVar;
        c1.t tVar2 = (c1.t) oVar;
        tVar2.j0(729976507);
        c1.d dVar = tVar2.a;
        int i3 = i2 | (tVar2.f(rVar) ? 4 : 2) | (tVar2.f(p3) ? 32 : 16) | (tVar2.d(i) ? 256 : 128) | (tVar2.f(q) ? 2048 : 1024) | (tVar2.f(f1) ? 16384 : 8192) | (tVar2.h(list) ? 131072 : 65536);
        if (tVar2.Y(i3 & 1, (74899 & i3) != 74898)) {
            tVar2.d0();
            if ((i2 & 1) != 0 && !tVar2.E()) {
                tVar2.b0();
            }
            tVar2.r();
            p1.r rVarA = p1.a.a(rVar, new E1(p3, q, (Function1) tVar2.j(aj.I.j), f1, i, list));
            t0.f fVar = t0.j.c;
            p1.h hVar = p1.c.m;
            t0.s sVarA = t0.r.a(fVar, hVar, tVar2, 0);
            int iHashCode = Long.hashCode(tVar2.T);
            c1.s0 s0VarL = tVar2.l();
            p1.r rVarD = p1.a.d(tVar2, rVarA);
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
            P1.h hVar2 = P1.j.f;
            c1.c.G(tVar2, sVarA, hVar2);
            P1.h hVar3 = P1.j.e;
            c1.c.G(tVar2, s0VarL, hVar3);
            P1.h hVar4 = P1.j.g;
            if (tVar2.S || !Intrinsics.b(tVar2.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar2, iHashCode, hVar4);
            }
            P1.h hVar5 = P1.j.d;
            c1.c.G(tVar2, rVarD, hVar5);
            p1.o oVar2 = p1.o.a;
            p1.r rVarD2 = androidx.compose.foundation.layout.d.d(oVar2, 1.0f);
            t0.s sVarA2 = t0.r.a(fVar, hVar, tVar2, 0);
            int iHashCode2 = Long.hashCode(tVar2.T);
            c1.s0 s0VarL2 = tVar2.l();
            p1.r rVarD3 = p1.a.d(tVar2, rVarD2);
            tVar2.l0();
            if (tVar2.S) {
                tVar2.k(iVar);
            } else {
                tVar2.v0();
            }
            c1.c.G(tVar2, sVarA2, hVar2);
            c1.c.G(tVar2, s0VarL2, hVar3);
            if (tVar2.S || !Intrinsics.b(tVar2.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, tVar2, iHashCode2, hVar4);
            }
            c1.c.G(tVar2, rVarD3, hVar5);
            N1.d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode3 = Long.hashCode(tVar2.T);
            c1.s0 s0VarL3 = tVar2.l();
            p1.r rVarD4 = p1.a.d(tVar2, oVar2);
            tVar2.l0();
            if (tVar2.S) {
                tVar2.k(iVar);
            } else {
                tVar2.v0();
            }
            c1.c.G(tVar2, d0VarD, hVar2);
            c1.c.G(tVar2, s0VarL3, hVar3);
            if (tVar2.S || !Intrinsics.b(tVar2.T(), Integer.valueOf(iHashCode3))) {
                A8.b.r(iHashCode3, tVar2, iHashCode3, hVar4);
            }
            c1.c.G(tVar2, rVarD4, hVar5);
            String str = f1.a;
            float f2 = 8;
            p1.r rVarB = AbstractC4718s6.b(androidx.compose.foundation.layout.d.f(androidx.compose.foundation.layout.d.d(oVar2, 1.0f), 118), C0.f.d(f2, f2, 0.0f, 0.0f, 12));
            c1.i1 i1Var = Ui.q.a;
            p1.r rVarB2 = androidx.compose.foundation.a.b(rVarB, ((Ui.g) tVar2.j(i1Var)).t(), C0.f.d(f2, f2, 0.0f, 0.0f, 12));
            N1.p pVar = N1.q.c;
            x8.k.a(str, "video cover", rVarB2, (p1.j) null, pVar, (w1.l) null, tVar2, 1572912, 1976);
            Qk.F f3 = Qk.F.a;
            Sk.w wVar = Qk.q.a;
            Intrinsics.checkNotNullParameter(f3, "<this>");
            float f4 = 4;
            float f5 = 24;
            Bb.b.a(Zn.n.b((Zn.f) Qk.q.j.getValue(), tVar2, 0), "icon video play", androidx.compose.foundation.layout.b.a.a(androidx.compose.foundation.layout.d.f(androidx.compose.foundation.layout.d.s(androidx.compose.foundation.layout.a.n(oVar2, f4), f5), f5), p1.c.c), null, null, 0.0f, null, tVar2, 48, 120);
            tVar2.q(true);
            tVar2.q(true);
            String str2 = f1.b;
            p1.r rVarD5 = androidx.compose.foundation.layout.d.d(androidx.compose.foundation.layout.a.r(oVar2, f2, f2, f2, 0.0f, 8), 1.0f);
            if (1.0f <= 0.0d) {
                u0.a.a("invalid weight; must be greater than zero");
            }
            p1.r rVarM = A8.b.m(1.0f, rVarD5, true);
            c1.i1 i1Var2 = Ui.q.c;
            ej.B.H(str2, rVarM, 0L, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, a2.U.a(((Ui.e) tVar2.j(i1Var2)).i, ((Ui.g) tVar2.j(i1Var)).C(), 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, (l2.i) null, 0, 16777214), tVar2, 0, 24960, 110588);
            t0.d dVar2 = t0.j.a;
            p1.i iVar2 = p1.c.k;
            p1.r rVarQ = androidx.compose.foundation.layout.a.q(oVar2, f2, f4, f2, f2);
            t0.j0 j0VarA = t0.h0.a(dVar2, iVar2, tVar2, 54);
            int iHashCode4 = Long.hashCode(tVar2.T);
            c1.s0 s0VarL4 = tVar2.l();
            p1.r rVarD6 = p1.a.d(tVar2, rVarQ);
            tVar2.l0();
            if (tVar2.S) {
                tVar2.k(iVar);
            } else {
                tVar2.v0();
            }
            c1.c.G(tVar2, j0VarA, hVar2);
            c1.c.G(tVar2, s0VarL4, hVar3);
            if (tVar2.S || !Intrinsics.b(tVar2.T(), Integer.valueOf(iHashCode4))) {
                A8.b.r(iHashCode4, tVar2, iHashCode4, hVar4);
            }
            c1.c.G(tVar2, rVarD6, hVar5);
            String str3 = f1.d;
            p1.r rVarN = androidx.compose.foundation.layout.d.n(androidx.compose.foundation.layout.a.r(oVar2, 0.0f, 0.0f, f4, 0.0f, 11), 16);
            C0.e eVar = C0.f.a;
            x8.k.a(str3, "video user avatar", androidx.compose.foundation.a.b(AbstractC4718s6.b(rVarN, eVar), ((Ui.g) tVar2.j(i1Var)).Q(), eVar), (p1.j) null, pVar, (w1.l) null, tVar2, 1572912, 1976);
            ej.B.H(f1.e, null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 0, 0, a2.U.a(((Ui.e) tVar2.j(i1Var2)).j, ((Ui.g) tVar2.j(i1Var)).F(), 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, (l2.i) null, 0, 16777214), tVar2, 0, 3456, 118782);
            tVar = tVar2;
            tVar.q(true);
            tVar.q(true);
        } else {
            tVar = tVar2;
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Gh.i(rVar, p3, i, q, f1, list, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(p1.r r13, Dc.C0568n r14, java.lang.String r15, boolean r16, c1.o r17, int r18) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ie.D.g(p1.r, Dc.n, java.lang.String, boolean, c1.o, int):void");
    }

    public static final void g0(p1.r rVar, c1.o oVar, int i) {
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-62346250);
        c1.d dVar = tVar.a;
        int i2 = (tVar.f(rVar) ? 4 : 2) | i;
        if (tVar.Y(i2 & 1, (i2 & 3) != 2)) {
            O0.l lVar = t0.j.g;
            p1.h hVar = p1.c.m;
            t0.s sVarA = t0.r.a(lVar, hVar, tVar, 6);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
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
            P1.h hVar2 = P1.j.f;
            c1.c.G(tVar, sVarA, hVar2);
            P1.h hVar3 = P1.j.e;
            c1.c.G(tVar, s0VarL, hVar3);
            P1.h hVar4 = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar4);
            }
            P1.h hVar5 = P1.j.d;
            c1.c.G(tVar, rVarD, hVar5);
            p1.o oVar2 = p1.o.a;
            p1.r rVarD2 = androidx.compose.foundation.layout.d.d(oVar2, 1.0f);
            t0.s sVarA2 = t0.r.a(t0.j.c, hVar, tVar, 0);
            int iHashCode2 = Long.hashCode(tVar.T);
            c1.s0 s0VarL2 = tVar.l();
            p1.r rVarD3 = p1.a.d(tVar, rVarD2);
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, sVarA2, hVar2);
            c1.c.G(tVar, s0VarL2, hVar3);
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, tVar, iHashCode2, hVar4);
            }
            c1.c.G(tVar, rVarD3, hVar5);
            float f2 = 8;
            p1.r rVarB = AbstractC4718s6.b(androidx.compose.foundation.layout.d.f(androidx.compose.foundation.layout.d.d(oVar2, 1.0f), 96), C0.f.d(f2, f2, 0.0f, 0.0f, 12));
            c1.i1 i1Var = Ui.q.a;
            t0.e.d(tVar, androidx.compose.foundation.a.b(rVarB, ((Ui.g) tVar.j(i1Var)).Q(), C0.f.d(f2, f2, 0.0f, 0.0f, 12)));
            t0.e.d(tVar, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.p(androidx.compose.foundation.layout.a.r(oVar2, f2, f2, f2, 0.0f, 8), 72, f2), ((Ui.g) tVar.j(i1Var)).Q(), C0.f.b(f2)));
            t0.e.d(tVar, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.p(androidx.compose.foundation.layout.a.r(oVar2, f2, f2, f2, 0.0f, 8), 112, f2), ((Ui.g) tVar.j(i1Var)).Q(), C0.f.b(f2)));
            tVar.q(true);
            O0.l lVar2 = t0.j.e;
            p1.r rVarQ = androidx.compose.foundation.layout.a.q(oVar2, f2, 4, f2, 22);
            t0.j0 j0VarA = t0.h0.a(lVar2, p1.c.j, tVar, 6);
            int iHashCode3 = Long.hashCode(tVar.T);
            c1.s0 s0VarL3 = tVar.l();
            p1.r rVarD4 = p1.a.d(tVar, rVarQ);
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, j0VarA, hVar2);
            c1.c.G(tVar, s0VarL3, hVar3);
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode3))) {
                A8.b.r(iHashCode3, tVar, iHashCode3, hVar4);
            }
            c1.c.G(tVar, rVarD4, hVar5);
            t0.e.d(tVar, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.n(androidx.compose.foundation.layout.a.r(oVar2, 0.0f, 0.0f, f2, 0.0f, 11), f2), ((Ui.g) tVar.j(i1Var)).Q(), C0.f.a));
            t0.e.d(tVar, androidx.compose.foundation.a.b(androidx.compose.foundation.layout.d.p(oVar2, 47, f2), ((Ui.g) tVar.j(i1Var)).Q(), C0.f.b(f2)));
            tVar.q(true);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1(rVar, i, 0);
        }
    }

    public static final void h(boolean z, c1.o oVar, int i) {
        c1.t tVar = (c1.t) oVar;
        tVar.j0(1631877921);
        int i2 = (tVar.g(z) ? 4 : 2) | i;
        if (tVar.Y(i2 & 1, (i2 & 3) != 2)) {
            t0.j0 j0VarA = t0.h0.a(t0.j.a, p1.c.k, tVar, 48);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.o oVar2 = p1.o.a;
            p1.r rVarD = p1.a.d(tVar, oVar2);
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
            c1.c.G(tVar, j0VarA, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            m(oVar2, null, k1.h.d(-1556874700, new C1317u0(!z ? Zd.E.b : Zd.E.c, z, 1), tVar), h, null, tVar, 3462, 18);
            tVar.q(true);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C0836g(i, z, 1);
        }
    }

    public static final void h0(int i, P3 p3, List list, c1.o oVar, int i2) {
        c1.o oVar2;
        h8 h8Var;
        boolean z;
        float fQ;
        Intrinsics.checkNotNullParameter(p3, "model");
        c1.o oVar3 = (c1.t) oVar;
        oVar3.j0(-1314267205);
        int i3 = (i2 & 6) == 0 ? (oVar3.d(i) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= oVar3.f(p3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oVar3.h(list) ? 256 : 128;
        }
        if (oVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            oVar3.d0();
            if ((i2 & 1) != 0 && !oVar3.E()) {
                oVar3.b0();
            }
            oVar3.r();
            bf.Q q = (bf.Q) oVar3.j(aj.I.l);
            boolean zF = oVar3.f(list);
            Object objT = oVar3.T();
            c1.X x = c1.n.a;
            Object obj = objT;
            if (zF || objT == x) {
                Intrinsics.checkNotNullParameter(list, FirebaseAnalytics.Param.ITEMS);
                List<j8> list2 = list;
                ArrayList arrayList = new ArrayList(kotlin.collections.A.t(list2, 10));
                for (j8 j8Var : list2) {
                    String str = j8Var.g;
                    h8 h8Var2 = j8Var.d;
                    String str2 = j8Var.c;
                    String str3 = j8Var.e;
                    if (h8Var2 == null) {
                        h8.Companion.getClass();
                        h8Var = h8.c;
                    } else {
                        h8Var = h8Var2;
                    }
                    String str4 = h8Var.b;
                    if (h8Var2 == null) {
                        h8.Companion.getClass();
                        h8Var2 = h8.c;
                    }
                    arrayList.add(new F1(str, str2, str3, str4, h8Var2.a));
                }
                oVar3.s0(arrayList);
                obj = arrayList;
            }
            List list3 = (List) obj;
            Object objT2 = oVar3.T();
            if (objT2 == x) {
                objT2 = new C4068d(new n2.f(196));
                oVar3.s0(objT2);
            }
            C4068d c4068d = (C4068d) objT2;
            n2.c cVar = (n2.c) oVar3.j(Q1.w0.h);
            if (list.size() < 3) {
                oVar3.h0(-412054470);
                fQ = (i - AbstractC2415q.Q(8, oVar3)) / 2;
                z = false;
                oVar3.q(false);
            } else {
                z = false;
                oVar3.h0(-412003847);
                fQ = (i - AbstractC2415q.Q(16, oVar3)) / 2;
                oVar3.q(false);
            }
            p1.r rVarD = androidx.compose.foundation.layout.d.d(p1.o.a, 1.0f);
            boolean zH = oVar3.h(list3);
            if ((i3 & 112) == 32) {
                z = true;
            }
            boolean zF2 = zH | z | oVar3.f(q) | oVar3.c(fQ) | oVar3.f(cVar);
            Object objT3 = oVar3.T();
            if (zF2 || objT3 == x) {
                I i4 = new I(list3, p3, q, fQ, cVar, c4068d);
                oVar3.s0(i4);
                objT3 = i4;
            }
            oVar2 = oVar3;
            AbstractC4773y7.b(rVarD, null, null, false, null, null, null, false, null, (Function1) objT3, oVar2, 6, 510);
        } else {
            oVar2 = oVar3;
            oVar2.b0();
        }
        c1.z0 z0VarV = oVar2.v();
        if (z0VarV != null) {
            z0VarV.d = new Ch.d(i, p3, list, i2, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(t0.k0 r35, Ie.z1 r36, boolean r37, java.util.List r38, a2.g r39, boolean r40, boolean r41, a2.U r42, c1.o r43, int r44, int r45) {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ie.D.i(t0.k0, Ie.z1, boolean, java.util.List, a2.g, boolean, boolean, a2.U, c1.o, int, int):void");
    }

    public static final void i0(float f2, int i, float f3, long j, P1.M m, float f4, ArrayList arrayList, float f5) {
        int i2 = ((int) ((f5 / f2) * i)) % i;
        int iCeil = (int) Math.ceil((f3 / f2) * r4);
        ArrayList arrayList2 = new ArrayList(iCeil);
        for (int i3 = 0; i3 < iCeil; i3++) {
            arrayList2.add(new v1.b(((v1.b) arrayList.get((i2 + i3) % i)).a));
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        w1.D d2 = new w1.D(kotlin.collections.z.m(new w1.s[]{new w1.s(w1.s.c(j, 0.0f)), new w1.s(w1.s.c(j, 1.0f)), new w1.s(w1.s.c(j, 0.0f))}), (ArrayList) null, ((v1.b) CollectionsKt.U(arrayList2)).a, ((v1.b) CollectionsKt.b0(arrayList2)).a, 0);
        w1.g gVarA = w1.j.a();
        gVarA.m(Float.intBitsToFloat((int) (((v1.b) arrayList2.get(0)).a >> 32)), Float.intBitsToFloat((int) (((v1.b) arrayList2.get(0)).a & 4294967295L)));
        Iterator it = CollectionsKt.Q(arrayList2, 1).iterator();
        while (it.hasNext()) {
            long j2 = ((v1.b) it.next()).a;
            gVarA.l(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        }
        y1.d.X(m, gVarA, d2, 0.0f, new y1.h(f4, 0.0f, 0, 0, (w1.h) null, 30), 52);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(t0.k0 r18, Ie.z1 r19, boolean r20, boolean r21, k1.c r22, c1.o r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ie.D.j(t0.k0, Ie.z1, boolean, boolean, k1.c, c1.o, int, int):void");
    }

    public static final ArrayList j0(ArrayList arrayList) {
        Object next;
        Object objA;
        Intrinsics.checkNotNullParameter(arrayList, "blocks");
        C2978a.c("SlidesItemData", new Aj.c0(arrayList, 1));
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 3;
            if (!it.hasNext()) {
                break;
            }
            C0568n c0568n = (C0568n) it.next();
            boolean z = C2978a.a;
            C2978a.a("SlidesItemData", null, new C1316u(c0568n, i));
            Zf.f fVar = Zf.f.a;
            String str = c0568n.p().c;
            if (str != null) {
                try {
                } catch (Throwable th2) {
                    boolean z2 = C2978a.a;
                    C2978a.b("KimiJson", null, new Ad.V(15, str, th2));
                }
                if (str.length() == 0) {
                    objA = null;
                } else {
                    kn.t tVar = Zf.f.c;
                    tVar.getClass();
                    objA = tVar.a(N2.j(je.C1.Companion.serializer()), str);
                }
            } else {
                objA = null;
            }
            je.C1 c1 = (je.C1) objA;
            if (c1 == null) {
                boolean z3 = C2978a.a;
                C2978a.e("SlidesItemData", null, new C1316u(c0568n, 4));
            } else {
                boolean z4 = C2978a.a;
                C2978a.a("SlidesItemData", null, new T0(c1, 0));
                String str2 = c1.k;
                if (str2.length() == 0) {
                    str2 = c1.A;
                }
                String strK = AbstractC4646k5.k(c0568n.p());
                if (str2.length() <= 0 || strK.length() <= 0) {
                    C2978a.e("SlidesItemData", null, new C0119e0(str2, strK, 16));
                } else {
                    C2978a.c("SlidesItemData", new A0.e(strK, str2, c1, 26));
                    arrayList2.add(new U0(strK, str2, c1.l));
                }
            }
        }
        C2978a.c("SlidesItemData", new Aj.c0(arrayList2, 2));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : arrayList2) {
            String str3 = ((U0) obj).b;
            Object arrayList3 = linkedHashMap.get(str3);
            if (arrayList3 == null) {
                arrayList3 = new ArrayList();
                linkedHashMap.put(str3, arrayList3);
            }
            ((List) arrayList3).add(obj);
        }
        ArrayList<U0> arrayList4 = new ArrayList(linkedHashMap.size());
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            List list = (List) ((Map.Entry) it2.next()).getValue();
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
                if (!((U0) next).c) {
                    break;
                }
            }
            U0 u0 = (U0) next;
            if (u0 == null) {
                u0 = (U0) CollectionsKt.U(list);
            }
            arrayList4.add(u0);
        }
        ArrayList arrayList5 = new ArrayList(kotlin.collections.A.t(arrayList4, 10));
        for (U0 u02 : arrayList4) {
            arrayList5.add(new H0(u02.a, u02.b));
        }
        C2978a.c("SlidesItemData", new Aj.c0(arrayList5, 3));
        return arrayList5;
    }

    public static final void k(Zd.E e2, Zd.D d2, String str, a2.U u, c1.o oVar, int i, int i2) {
        int i3;
        a2.U u2;
        int i4;
        Intrinsics.checkNotNullParameter(e2, "toolStatus");
        Intrinsics.checkNotNullParameter(d2, "toolIcon");
        Intrinsics.checkNotNullParameter(str, FirebaseAnalytics.Param.CONTENT);
        c1.t tVar = (c1.t) oVar;
        tVar.j0(2028121011);
        if ((i & 6) == 0) {
            i3 = (tVar.d(e2.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tVar.d(d2.ordinal()) ? 32 : 16;
        }
        int i5 = i3 | (tVar.f(str) ? 256 : 128) | (((i2 & 8) == 0 && tVar.f(u)) ? 2048 : 1024);
        if (tVar.Y(i5 & 1, (i5 & 1171) != 1170)) {
            tVar.d0();
            if ((i & 1) == 0 || tVar.E()) {
                if ((i2 & 8) != 0) {
                    i4 = i5 & (-7169);
                    u2 = ((Ui.e) tVar.j(Ui.q.c)).h;
                }
                tVar.r();
                int i6 = (i4 & 14) | 3072;
                int i7 = i4 >> 3;
                l(e2, str, u2, k1.h.d(83972634, new Aj.o0(28, d2, e2), tVar), tVar, (i7 & 896) | i6 | (i7 & 112), 0);
            } else {
                tVar.b0();
                if ((i2 & 8) != 0) {
                    i5 &= -7169;
                }
            }
            i4 = i5;
            u2 = u;
            tVar.r();
            int i62 = (i4 & 14) | 3072;
            int i72 = i4 >> 3;
            l(e2, str, u2, k1.h.d(83972634, new Aj.o0(28, d2, e2), tVar), tVar, (i72 & 896) | i62 | (i72 & 112), 0);
        } else {
            tVar.b0();
            u2 = u;
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new a2(e2, d2, str, u2, i, i2, 3);
        }
    }

    public static final z1 k0(boolean z, c1.o oVar, int i) {
        Object[] objArr = {Boolean.valueOf(z)};
        boolean z2 = (((i & 14) ^ 6) > 4 && ((c1.t) oVar).g(z)) || (i & 6) == 4;
        c1.t tVar = (c1.t) oVar;
        Object objT = tVar.T();
        if (z2 || objT == c1.n.a) {
            objT = new Aj.a1(6, z);
            tVar.s0(objT);
        }
        return (z1) l1.l.e(objArr, z1.b, (Function0) objT, tVar, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(Zd.E r16, java.lang.String r17, a2.U r18, k1.c r19, c1.o r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ie.D.l(Zd.E, java.lang.String, a2.U, k1.c, c1.o, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(p1.r r18, Ie.z1 r19, gl.m r20, gl.m r21, gl.m r22, c1.o r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ie.D.m(p1.r, Ie.z1, gl.m, gl.m, gl.m, c1.o, int, int):void");
    }

    public static final void n(String str, Ch.k kVar, boolean z, c1.o oVar, int i) {
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-2039853895);
        int i2 = (tVar.f(str) ? 4 : 2) | i | (tVar.g(z) ? 256 : 128);
        if (tVar.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object objT = tVar.T();
            c1.X x = c1.n.a;
            if (z2 || objT == x) {
                objT = c1.c.r(new C0127i0(str, z, 4));
                tVar.s0(objT);
            }
            c1.h1 h1Var = (c1.h1) objT;
            bf.A a2 = (bf.A) tVar.j(aj.I.m);
            bf.Q q = (bf.Q) tVar.j(aj.I.l);
            boolean zF = tVar.f((String) h1Var.getValue());
            Object objT2 = tVar.T();
            if (zF || objT2 == x) {
                objT2 = c1.c.r(new C1299l(a2, q, h1Var, 0));
                tVar.s0(objT2);
            }
            c1.c.a(Dh.e.s.a(new Eh.c(new Eh.a(true, true, false), 511)), k1.h.d(257421305, new Aj.o0(27, kVar, (c1.h1) objT2), tVar), tVar, 56);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Bi.c(str, kVar, z, i, 3);
        }
    }

    public static final void o(C0568n c0568n, c1.o oVar, int i) throws Throwable {
        int i2;
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-501561386);
        if ((i & 6) == 0) {
            i2 = (tVar.f(c0568n) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        byte b2 = 0;
        int i3 = 1;
        if (tVar.Y(i2 & 1, (i2 & 3) != 2)) {
            bf.Q q = (bf.Q) tVar.j(aj.I.l);
            P3 p3 = (P3) tVar.j(Dh.e.r);
            boolean zG = ((i2 & 14) == 4) | tVar.g(q.b);
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (zG || objT == obj) {
                objT = o9.a.s(Zd.E.a, q.b, c0568n);
                tVar.s0(objT);
            }
            Zd.E e2 = (Zd.E) objT;
            D7 d7 = c0568n.p().l;
            if (d7 == null) {
                D7.Companion.getClass();
                d7 = D7.b;
            }
            String str = d7.a;
            boolean zD = e2.d();
            boolean zF = tVar.f(str);
            Object objT2 = tVar.T();
            if (zF || objT2 == obj) {
                Ti.B b3 = Ti.B.a;
                objT2 = Ti.B.l(str);
                tVar.s0(objT2);
            }
            c1.f0 f0VarM = c1.c.m((Pm.h) objT2, (Object) null, (CoroutineContext) null, tVar, 48, 2);
            Boolean boolValueOf = Boolean.valueOf(zD);
            boolean zG2 = tVar.g(zD) | tVar.f(str);
            Object objT3 = tVar.T();
            if (zG2 || objT3 == obj) {
                objT3 = new s1(null, str, zD);
                tVar.s0(objT3);
            }
            c1.c.h(str, boolValueOf, (Function2) objT3, tVar);
            md.X x = (md.X) f0VarM.getValue();
            boolean z = zD && str.length() > 0 && ((md.X) f0VarM.getValue()) != null && !Intrinsics.b(x != null ? x.e : null, C3962o0.d);
            boolean zG3 = tVar.g(z) | tVar.f(p3) | tVar.f(str);
            Object objT4 = tVar.T();
            if (zG3 || objT4 == obj) {
                objT4 = new C1281d1(z, p3, str);
                tVar.s0(objT4);
            }
            e((Function0) objT4, k1.h.d(1264966696, new r1(e2, zD, z), tVar), tVar, 48, 0);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1318v(c0568n, i, i3, b2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void p(float r23, int r24, Cf.P3 r25, Dc.C0568n r26, c1.o r27) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ie.D.p(float, int, Cf.P3, Dc.n, c1.o):void");
    }

    public static final void q(bf.Q q, Dc.R0 r0, List list, Function1 function1, c1.o oVar, int i) {
        Intrinsics.checkNotNullParameter(q, "messageUIData");
        Intrinsics.checkNotNullParameter(r0, "elemeMenuCard");
        Intrinsics.checkNotNullParameter(list, "skuList");
        Intrinsics.checkNotNullParameter(function1, "onEvent");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-1342377441);
        int i2 = i | (tVar.f(q) ? 4 : 2) | (tVar.f(r0) ? 32 : 16) | (tVar.h(list) ? 256 : 128) | (tVar.h(function1) ? 2048 : 1024);
        if (tVar.Y(i2 & 1, (i2 & 1171) != 1170)) {
            float f2 = 16;
            float f3 = ((AbstractC5709r0.g(tVar).a - 32) - f2) / 3.0f;
            P3 p3 = (P3) tVar.j(Dh.e.r);
            p1.r rVarD = androidx.compose.foundation.layout.d.d(p1.o.a, 1.0f);
            v0.v vVarA = v0.x.a(0, 0, tVar, 0, 3);
            t0.d0 d0VarB = androidx.compose.foundation.layout.a.b(2, f2, 0.0f);
            t0.h hVarG = t0.j.g(8);
            boolean zH = tVar.h(list) | tVar.c(f3) | tVar.f(p3) | ((i2 & 14) == 4) | ((i2 & 7168) == 2048) | ((i2 & 112) == 32);
            Object objT = tVar.T();
            if (zH || objT == c1.n.a) {
                I i3 = new I(list, f3, p3, q, function1, r0);
                tVar.s0(i3);
                objT = i3;
            }
            AbstractC4773y7.b(rVarD, vVarA, d0VarB, false, hVarG, null, null, false, null, (Function1) objT, tVar, 24966, 488);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Di.i(q, r0, list, function1, i, 10);
        }
    }

    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    public static final void r(p1.r rVar, Dc.R0 r0, float f2, Function1 function1, c1.o oVar, int i) {
        int i2;
        c1.t tVar;
        c1.t tVar2;
        String str;
        p1.r rVar2;
        ?? r1;
        Intrinsics.checkNotNullParameter(rVar, "modifier");
        Intrinsics.checkNotNullParameter(r0, "elemeMenuCard");
        Intrinsics.checkNotNullParameter(function1, "onEvent");
        c1.t tVar3 = (c1.t) oVar;
        tVar3.j0(-1086776910);
        if ((i & 6) == 0) {
            i2 = (tVar3.f(rVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tVar3.f(r0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tVar3.c(f2) ? 256 : 128;
        }
        if (tVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            t0.s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar3, 0);
            int iHashCode = Long.hashCode(tVar3.T);
            c1.s0 s0VarL = tVar3.l();
            p1.r rVarD = p1.a.d(tVar3, rVar);
            P1.k.R0.getClass();
            P1.i iVar = P1.j.b;
            if (tVar3.a == null) {
                c1.c.v();
                throw null;
            }
            tVar3.l0();
            if (tVar3.S) {
                tVar3.k(iVar);
            } else {
                tVar3.v0();
            }
            c1.c.G(tVar3, sVarA, P1.j.f);
            c1.c.G(tVar3, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar3.S || !Intrinsics.b(tVar3.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar3, iHashCode, hVar);
            }
            c1.c.G(tVar3, rVarD, P1.j.d);
            String str2 = r0.b;
            String str3 = r0.c;
            int length = str2.length();
            p1.r rVar3 = p1.o.a;
            if (length > 0) {
                tVar3.h0(2071234162);
                p1.r rVarR = androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.a.p(rVar3, f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16, 7);
                c1.i1 i1Var = Ui.q.c;
                p1.r rVarH = androidx.compose.foundation.layout.d.h(rVarR, AbstractC2415q.P(((Ui.e) tVar3.j(i1Var)).o.b.c, tVar3), 0.0f, 2);
                String string = StringsKt.y0(r0.b).toString();
                a2.U uA = a2.U.a(((Ui.e) tVar3.j(i1Var)).o, 0L, 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, new l2.i(l2.f.b, 0), 0, 15728639);
                str = str3;
                r1 = 0;
                rVar2 = rVar3;
                ej.B.H(string, rVarH, ((Ui.g) tVar3.j(Ui.q.a)).C(), 0L, null, null, 0L, new l2.k(5), 0L, 0, false, 0, 0, uA, tVar3, 0, 0, 130040);
                tVar2 = tVar3;
            } else {
                tVar2 = tVar3;
                str = str3;
                rVar2 = rVar3;
                r1 = 0;
                tVar2.h0(2064930374);
            }
            tVar2.q((boolean) r1);
            if (str.length() > 0) {
                tVar2.h0(2072084430);
                p1.r rVarP = androidx.compose.foundation.layout.a.p(rVar2, f2, 0.0f, 2);
                c1.i1 i1Var2 = Ui.q.c;
                c1.t tVar4 = tVar2;
                ej.B.H(StringsKt.y0(str).toString(), androidx.compose.foundation.layout.d.h(rVarP, AbstractC2415q.P(((Ui.e) tVar2.j(i1Var2)).q.b.c, tVar2), 0.0f, 2), ((Ui.g) tVar2.j(Ui.q.a)).C(), 0L, null, null, 0L, new l2.k(5), 0L, 0, false, 0, 0, a2.U.a(((Ui.e) tVar2.j(i1Var2)).q, 0L, 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, new l2.i(l2.f.b, (int) r1), 0, 15728639), tVar4, 0, 0, 130040);
                tVar2 = tVar4;
            } else {
                tVar2.h0(2064930374);
            }
            tVar2.q((boolean) r1);
            Qk.F f3 = Qk.F.d;
            Sk.w wVar = Qk.x0.a;
            Intrinsics.checkNotNullParameter(f3, "<this>");
            c1.t tVar5 = tVar2;
            y(N5.e((Zn.L) Qk.x0.c0.getValue(), tVar2, r1), r0.e, 16, null, null, null, 0L, 0L, tVar5, 384);
            float f4 = 12;
            Intrinsics.checkNotNullParameter(f3, "<this>");
            y(N5.e((Zn.L) Qk.x0.l0.getValue(), tVar5, 0), "¥" + r0.f, f4, null, null, null, 0L, 0L, tVar5, 384);
            Intrinsics.checkNotNullParameter(f3, "<this>");
            y(N5.e((Zn.L) Qk.x0.e0.getValue(), tVar5, 0), "¥" + r0.d, f4, null, null, null, 0L, 0L, tVar5, 384);
            tVar = tVar5;
            tVar.q(true);
        } else {
            tVar = tVar3;
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new H(rVar, r0, f2, function1, i);
        }
    }

    public static final void s(C0568n c0568n, float f2, c1.o oVar, int i) {
        c1.o oVar2;
        int i2;
        float f3;
        Function0 function0;
        P1.h hVar;
        Intrinsics.checkNotNullParameter(c0568n, "block");
        c1.o oVar3 = (c1.t) oVar;
        oVar3.j0(600823880);
        c1.d dVar = ((c1.t) oVar3).a;
        int i3 = i | (oVar3.f(c0568n) ? 4 : 2) | 48;
        if (oVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            float f4 = 0;
            bf.Q q = (bf.Q) oVar3.j(aj.I.l);
            Dc.V0 v0 = c0568n.q;
            if (v0 == null) {
                Dc.V0.Companion.getClass();
                v0 = Dc.V0.i;
            }
            t0.f fVar = t0.j.c;
            p1.h hVar2 = p1.c.m;
            t0.s sVarA = t0.r.a(fVar, hVar2, oVar3, 0);
            int iHashCode = Long.hashCode(((c1.t) oVar3).T);
            c1.s0 s0VarL = oVar3.l();
            p1.o oVar4 = p1.o.a;
            p1.r rVarD = p1.a.d(oVar3, oVar4);
            P1.k.R0.getClass();
            Dc.V0 v02 = v0;
            Function0 function02 = P1.j.b;
            if (dVar == null) {
                c1.c.v();
                throw null;
            }
            oVar3.l0();
            if (((c1.t) oVar3).S) {
                oVar3.k(function02);
            } else {
                oVar3.v0();
            }
            P1.h hVar3 = P1.j.f;
            c1.c.G(oVar3, sVarA, hVar3);
            P1.h hVar4 = P1.j.e;
            c1.c.G(oVar3, s0VarL, hVar4);
            P1.h hVar5 = P1.j.g;
            if (((c1.t) oVar3).S || !Intrinsics.b(oVar3.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, oVar3, iHashCode, hVar5);
            }
            P1.h hVar6 = P1.j.d;
            c1.c.G(oVar3, rVarD, hVar6);
            p1.r rVarP = androidx.compose.foundation.layout.a.p(oVar4, f4, 0.0f, 2);
            c1.i1 i1Var = Ui.q.c;
            p1.r rVarH = androidx.compose.foundation.layout.d.h(rVarP, AbstractC2415q.P(((Ui.e) oVar3.j(i1Var)).n.b.c, oVar3), 0.0f, 2);
            Qk.F f5 = Qk.F.d;
            Sk.w wVar = Qk.x0.a;
            Intrinsics.checkNotNullParameter(f5, "<this>");
            ej.B.H(N5.e((Zn.L) Qk.x0.g0.getValue(), oVar3, 0), rVarH, ((Ui.g) oVar3.j(Ui.q.a)).C(), 0L, null, null, 0L, new l2.k(5), 0L, 0, false, 0, 0, a2.U.a(((Ui.e) oVar3.j(i1Var)).n, 0L, 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, new l2.i(l2.f.b, 0), 0, 15728639), oVar3, 0, 0, 130040);
            oVar2 = oVar3;
            float f6 = 16;
            p1.r rVarR = androidx.compose.foundation.layout.a.r(oVar4, 0.0f, f6, 0.0f, 0.0f, 13);
            t0.s sVarA2 = t0.r.a(fVar, hVar2, oVar2, 0);
            int iHashCode2 = Long.hashCode(((c1.t) oVar2).T);
            c1.s0 s0VarL2 = oVar2.l();
            p1.r rVarD2 = p1.a.d(oVar2, rVarR);
            oVar2.l0();
            if (((c1.t) oVar2).S) {
                function0 = function02;
                oVar2.k(function0);
            } else {
                function0 = function02;
                oVar2.v0();
            }
            c1.c.G(oVar2, sVarA2, hVar3);
            c1.c.G(oVar2, s0VarL2, hVar4);
            if (((c1.t) oVar2).S || !Intrinsics.b(oVar2.T(), Integer.valueOf(iHashCode2))) {
                hVar = hVar5;
                A8.b.r(iHashCode2, oVar2, iHashCode2, hVar);
            } else {
                hVar = hVar5;
            }
            c1.c.G(oVar2, rVarD2, hVar6);
            f3 = f4;
            t(v02, f3, oVar2, 48);
            i2 = 1;
            oVar2.q(true);
            p1.r rVarR2 = androidx.compose.foundation.layout.a.r(oVar4, 0.0f, f6, 0.0f, 0.0f, 13);
            N1.d0 d0VarD = t0.n.d(p1.c.a, false);
            int iHashCode3 = Long.hashCode(((c1.t) oVar2).T);
            c1.s0 s0VarL3 = oVar2.l();
            p1.r rVarD3 = p1.a.d(oVar2, rVarR2);
            oVar2.l0();
            if (((c1.t) oVar2).S) {
                oVar2.k(function0);
            } else {
                oVar2.v0();
            }
            c1.c.G(oVar2, d0VarD, hVar3);
            c1.c.G(oVar2, s0VarL3, hVar4);
            if (((c1.t) oVar2).S || !Intrinsics.b(oVar2.T(), Integer.valueOf(iHashCode3))) {
                A8.b.r(iHashCode3, oVar2, iHashCode3, hVar);
            }
            c1.c.G(oVar2, rVarD3, hVar6);
            v(q, v02, f3, oVar2, 384);
            oVar2.q(true);
            oVar2.q(true);
        } else {
            oVar2 = oVar3;
            i2 = 1;
            oVar2.b0();
            f3 = f2;
        }
        c1.z0 z0VarV = oVar2.v();
        if (z0VarV != null) {
            z0VarV.d = new Ee.G(c0568n, f3, i, i2);
        }
    }

    public static final void t(Dc.V0 v0, float f2, c1.o oVar, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(v0, "elemeOrderCard");
        c1.o oVar2 = (c1.t) oVar;
        oVar2.j0(741536877);
        if ((i & 6) == 0) {
            i2 = (oVar2.f(v0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= oVar2.c(f2) ? 32 : 16;
        }
        if (oVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            p1.r rVarP = androidx.compose.foundation.layout.a.p(p1.o.a, f2, 0.0f, 2);
            c1.i1 i1Var = Ui.q.c;
            ej.B.H(StringsKt.y0(v0.b).toString(), androidx.compose.foundation.layout.d.h(rVarP, AbstractC2415q.P(((Ui.e) oVar2.j(i1Var)).o.b.c, oVar2), 0.0f, 2), ((Ui.g) oVar2.j(Ui.q.a)).C(), 0L, null, null, 0L, new l2.k(5), 0L, 0, false, 0, 0, a2.U.a(((Ui.e) oVar2.j(i1Var)).o, 0L, 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, new l2.i(l2.f.b, 0), 0, 15728639), oVar2, 0, 0, 130040);
            oVar2 = oVar2;
            float f3 = 16;
            Qk.F f4 = Qk.F.d;
            Sk.w wVar = Qk.x0.a;
            Intrinsics.checkNotNullParameter(f4, "<this>");
            String strE = N5.e((Zn.L) Qk.x0.h0.getValue(), oVar2, 0);
            List list = v0.g;
            Object objT = oVar2.T();
            if (objT == c1.n.a) {
                objT = new Hd.s(i3);
                oVar2.s0(objT);
            }
            y(strE, CollectionsKt.Z(list, ";", (String) null, (String) null, (Function1) objT, 30), f3, null, null, null, 0L, 0L, oVar2, 384);
            float f5 = 12;
            Intrinsics.checkNotNullParameter(f4, "<this>");
            y(N5.e((Zn.L) Qk.x0.i0.getValue(), oVar2, 0), "¥" + v0.d, f5, null, null, null, 0L, 0L, oVar2, 384);
            Intrinsics.checkNotNullParameter(f4, "<this>");
            y(N5.e((Zn.L) Qk.x0.j0.getValue(), oVar2, 0), v0.e, f5, null, null, null, 0L, 0L, oVar2, 384);
        } else {
            oVar2.b0();
        }
        c1.z0 z0VarV = oVar2.v();
        if (z0VarV != null) {
            z0VarV.d = new C0868w0(v0, f2, i);
        }
    }

    public static final void u(bf.Q q, Dc.R0 r0, Function1 function1, c1.o oVar, int i) {
        c1.t tVar;
        Intrinsics.checkNotNullParameter(q, "messageUIData");
        Intrinsics.checkNotNullParameter(r0, "elemeMenuCard");
        Intrinsics.checkNotNullParameter(function1, "onEvent");
        c1.t tVar2 = (c1.t) oVar;
        tVar2.j0(-40601218);
        int i2 = i | (tVar2.f(q) ? 4 : 2) | (tVar2.f(r0) ? 32 : 16) | (tVar2.h(function1) ? 256 : 128);
        if (tVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            P3 p3 = (P3) tVar2.j(Dh.e.r);
            p1.r rVarB = AbstractC4718s6.b(androidx.compose.foundation.layout.d.h(p1.o.a, 40, 0.0f, 2), C0.f.b(12));
            c1.i1 i1Var = Ui.q.a;
            p1.r rVarB2 = androidx.compose.foundation.a.b(rVarB, ((Ui.g) tVar2.j(i1Var)).u(), w1.M.a);
            boolean zF = ((i2 & 112) == 32) | tVar2.f(p3) | ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objT = tVar2.T();
            if (zF || objT == c1.n.a) {
                b3 b3Var = new b3(p3, q, function1, r0, 11);
                tVar2.s0(b3Var);
                objT = b3Var;
            }
            p1.r rVarD = androidx.compose.foundation.layout.d.d(AbstractC2415q.A(7, tVar2, (Function0) objT, rVarB2, false), 1.0f);
            N1.d0 d0VarD = t0.n.d(p1.c.e, false);
            int iHashCode = Long.hashCode(tVar2.T);
            c1.s0 s0VarL = tVar2.l();
            p1.r rVarD2 = p1.a.d(tVar2, rVarD);
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
            c1.c.G(tVar2, rVarD2, P1.j.d);
            Qk.F f2 = Qk.F.d;
            Sk.w wVar = Qk.x0.a;
            Intrinsics.checkNotNullParameter(f2, "<this>");
            ej.B.H(N5.e((Zn.L) Qk.x0.d0.getValue(), tVar2, 0), null, ((Ui.g) tVar2.j(i1Var)).n(), 0L, null, null, 0L, new l2.k(3), 0L, 0, false, 0, 0, ((Ui.e) tVar2.j(Ui.q.c)).e, tVar2, 0, 0, 130042);
            tVar = tVar2;
            tVar.q(true);
        } else {
            tVar = tVar2;
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Aj.s0(q, r0, function1, i, 14);
        }
    }

    public static final void v(bf.Q q, Dc.V0 v0, float f2, c1.o oVar, int i) {
        int i2;
        c1.o oVar2;
        Intrinsics.checkNotNullParameter(q, "messageUIData");
        Intrinsics.checkNotNullParameter(v0, "elemeOrderCard");
        c1.o oVar3 = (c1.t) oVar;
        oVar3.j0(1965074246);
        if ((i & 6) == 0) {
            i2 = (oVar3.f(q) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oVar3.f(v0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oVar3.c(f2) ? 256 : 128;
        }
        if (oVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            Function1 function1 = (Function1) oVar3.j(aj.I.j);
            P3 p3 = (P3) oVar3.j(Dh.e.r);
            p1.r rVarP = androidx.compose.foundation.layout.a.p(p1.o.a, f2, 0.0f, 2);
            boolean zF = oVar3.f(p3) | ((i2 & 14) == 4) | oVar3.f(function1) | ((i2 & 112) == 32);
            Object objT = oVar3.T();
            if (zF || objT == c1.n.a) {
                b3 b3Var = new b3(p3, q, function1, v0, 12);
                oVar3.s0(b3Var);
                objT = b3Var;
            }
            p1.r rVarA = AbstractC2415q.A(7, oVar3, (Function0) objT, rVarP, false);
            Qk.F f3 = Qk.F.d;
            Sk.w wVar = Qk.x0.a;
            Intrinsics.checkNotNullParameter(f3, "<this>");
            oVar2 = oVar3;
            ej.B.H(N5.e((Zn.L) Qk.x0.f0.getValue(), oVar3, 0), rVarA, ((Ui.g) oVar3.j(Ui.q.a)).n(), 0L, null, null, 0L, new l2.k(5), 0L, 0, false, 0, 0, ((Ui.e) oVar3.j(Ui.q.c)).q, oVar2, 0, 0, 130040);
        } else {
            oVar2 = oVar3;
            oVar2.b0();
        }
        c1.z0 z0VarV = oVar2.v();
        if (z0VarV != null) {
            z0VarV.d = new M(q, v0, f2, i, 0);
        }
    }

    public static final void w(C0568n c0568n, boolean z, c1.o oVar, int i) throws Throwable {
        boolean z2;
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-840089621);
        int i2 = (i & 6) == 0 ? (tVar.f(c0568n) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= tVar.g(z) ? 32 : 16;
        }
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean zF = tVar.f(c0568n.p().r);
            Object objT = tVar.T();
            Object obj = c1.n.a;
            if (zF || objT == obj) {
                List list = c0568n.p().r;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    C0629t7 c0629t7 = ((C0486d7) obj2).i;
                    if (c0629t7 != null) {
                        if (c0629t7 == null) {
                            C0629t7.Companion.getClass();
                            c0629t7 = C0629t7.e;
                        }
                        if (c0629t7.a.length() > 0) {
                            arrayList.add(obj2);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList(kotlin.collections.A.t(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C0629t7 c0629t72 = ((C0486d7) it.next()).i;
                    if (c0629t72 == null) {
                        C0629t7.Companion.getClass();
                        c0629t72 = C0629t7.e;
                    }
                    arrayList2.add(c0629t72);
                }
                tVar.s0(arrayList2);
                objT = arrayList2;
            }
            List list2 = (List) objT;
            boolean zF2 = tVar.f(list2);
            Object objT2 = tVar.T();
            if (zF2 || objT2 == obj) {
                List list3 = list2;
                ArrayList arrayList3 = new ArrayList(kotlin.collections.A.t(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((C0629t7) it2.next()).c);
                }
                objT2 = CollectionsKt.v0(CollectionsKt.P(arrayList3), 5);
                tVar.s0(objT2);
            }
            List list4 = (List) objT2;
            z1 z1VarK0 = k0(false, tVar, 6);
            boolean zH = tVar.h(list2) | tVar.f(z1VarK0);
            Object objT3 = tVar.T();
            if (zH || objT3 == obj) {
                objT3 = new C1324y(3, list2, z1VarK0);
                tVar.s0(objT3);
            }
            z2 = z;
            e((Function0) objT3, k1.h.d(-458189379, new Ch.f(z2, z1VarK0, list4, list2, 3), tVar), tVar, 48, 0);
        } else {
            z2 = z;
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new i1(c0568n, z2, i, 0);
        }
    }

    public static final void x(c1.o oVar, int i) {
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-1421884528);
        if (tVar.Y(i & 1, i != 0)) {
            t0.j0 j0VarA = t0.h0.a(t0.j.a, p1.c.k, tVar, 48);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.o oVar2 = p1.o.a;
            p1.r rVarD = p1.a.d(tVar, oVar2);
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
            c1.c.G(tVar, j0VarA, P1.j.f);
            c1.c.G(tVar, s0VarL, P1.j.e);
            P1.h hVar = P1.j.g;
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar, iHashCode, hVar);
            }
            c1.c.G(tVar, rVarD, P1.j.d);
            B1.c cVarB = Zn.n.b(Qk.i.a(), tVar, 0);
            p1.r rVarN = androidx.compose.foundation.layout.d.n(oVar2, 20);
            c1.i1 i1Var = Ui.q.a;
            K2.a(cVarB, null, rVarN, ((Ui.g) tVar.j(i1Var)).E(), tVar, 432);
            t0.e.d(tVar, androidx.compose.foundation.layout.d.s(oVar2, 4));
            Qk.F f2 = Qk.F.d;
            Sk.w wVar = Qk.g0.a;
            Intrinsics.checkNotNullParameter(f2, "<this>");
            ej.B.H(N5.e((Zn.L) Qk.g0.h0.getValue(), tVar, 0), null, ((Ui.g) tVar.j(i1Var)).E(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Ui.e) tVar.j(Ui.q.c)).e, tVar, 0, 0, 131066);
            tVar = tVar;
            tVar.q(true);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Bj.w(i, 23);
        }
    }

    public static final void y(final String str, final String str2, final float f2, p1.r rVar, a2.U u, a2.U u2, long j, long j2, c1.o oVar, final int i) {
        c1.t tVar;
        final p1.r rVar2;
        final a2.U u3;
        final a2.U u4;
        final long j3;
        final long j4;
        a2.U u5;
        long jN;
        a2.U u6;
        p1.r rVar3;
        long j5;
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.VALUE);
        c1.t tVar2 = (c1.t) oVar;
        tVar2.j0(-433355176);
        c1.d dVar = tVar2.a;
        int i2 = i | (tVar2.f(str) ? 4 : 2) | (tVar2.f(str2) ? 32 : 16) | 4795392;
        if (tVar2.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            tVar2.d0();
            int i3 = i & 1;
            p1.r rVar4 = p1.o.a;
            if (i3 == 0 || tVar2.E()) {
                c1.i1 i1Var = Ui.q.c;
                u5 = ((Ui.e) tVar2.j(i1Var)).q;
                a2.U u7 = ((Ui.e) tVar2.j(i1Var)).q;
                c1.i1 i1Var2 = Ui.q.a;
                jN = ((Ui.g) tVar2.j(i1Var2)).n();
                long jC = ((Ui.g) tVar2.j(i1Var2)).C();
                u6 = u7;
                rVar3 = rVar4;
                j5 = jC;
            } else {
                tVar2.b0();
                rVar3 = rVar;
                u5 = u;
                u6 = u2;
                jN = j;
                j5 = j2;
            }
            tVar2.r();
            p1.r rVar5 = rVar3;
            p1.r rVarR = androidx.compose.foundation.layout.a.r(rVar5, 0.0f, f2, 0.0f, 0.0f, 13);
            t0.j0 j0VarA = t0.h0.a(t0.j.a, p1.c.j, tVar2, 0);
            int iHashCode = Long.hashCode(tVar2.T);
            c1.s0 s0VarL = tVar2.l();
            p1.r rVarD = p1.a.d(tVar2, rVarR);
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
            c1.c.G(tVar2, j0VarA, hVar);
            P1.h hVar2 = P1.j.e;
            c1.c.G(tVar2, s0VarL, hVar2);
            P1.h hVar3 = P1.j.g;
            if (tVar2.S || !Intrinsics.b(tVar2.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, tVar2, iHashCode, hVar3);
            }
            P1.h hVar4 = P1.j.d;
            c1.c.G(tVar2, rVarD, hVar4);
            p1.r rVarS = androidx.compose.foundation.layout.d.s(rVar4, 24);
            N1.d0 d0VarD = t0.n.d(p1.c.e, false);
            a2.U u8 = u6;
            long j6 = jN;
            int iHashCode2 = Long.hashCode(tVar2.T);
            c1.s0 s0VarL2 = tVar2.l();
            p1.r rVarD2 = p1.a.d(tVar2, rVarS);
            tVar2.l0();
            if (tVar2.S) {
                tVar2.k(iVar);
            } else {
                tVar2.v0();
            }
            c1.c.G(tVar2, d0VarD, hVar);
            c1.c.G(tVar2, s0VarL2, hVar2);
            if (tVar2.S || !Intrinsics.b(tVar2.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, tVar2, iHashCode2, hVar3);
            }
            c1.c.G(tVar2, rVarD2, hVar4);
            p1.r rVarE = AbstractC4701q6.e(androidx.compose.foundation.layout.d.h(rVar4, AbstractC2415q.P(u5.b.c, tVar2), 0.0f, 2), 0.0f);
            float f3 = l2.f.b;
            a2.U u9 = u5;
            long j7 = j5;
            ej.B.H(" ", rVarE, j7, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, a2.U.a(u8, 0L, 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, new l2.i(f3, 0), 0, 15728639), tVar2, 6, 24960, 110584);
            t0.n.a(androidx.compose.foundation.a.b(AbstractC4718s6.b(androidx.compose.foundation.layout.d.n(rVar4, 6), C0.f.a), j6, w1.M.a), tVar2, 0);
            tVar2.q(true);
            p1.r rVarH = androidx.compose.foundation.layout.d.h(rVar4, AbstractC2415q.P(u9.b.c, tVar2), 0.0f, 2);
            N1.d0 d0VarD2 = t0.n.d(p1.c.a, false);
            int iHashCode3 = Long.hashCode(tVar2.T);
            c1.s0 s0VarL3 = tVar2.l();
            p1.r rVarD3 = p1.a.d(tVar2, rVarH);
            tVar2.l0();
            if (tVar2.S) {
                tVar2.k(iVar);
            } else {
                tVar2.v0();
            }
            c1.c.G(tVar2, d0VarD2, hVar);
            c1.c.G(tVar2, s0VarL3, hVar2);
            if (tVar2.S || !Intrinsics.b(tVar2.T(), Integer.valueOf(iHashCode3))) {
                A8.b.r(iHashCode3, tVar2, iHashCode3, hVar3);
            }
            c1.c.G(tVar2, rVarD3, hVar4);
            a2.d dVar2 = new a2.d();
            int iK = dVar2.k(new a2.K(0L, 0L, e2.w.i, (e2.q) null, (e2.r) null, (e2.j) null, (String) null, 0L, (l2.a) null, (l2.p) null, (h2.b) null, 0L, (l2.l) null, (w1.P) null, 65531));
            try {
                dVar2.f(str);
                Unit unit = Unit.a;
                dVar2.h(iK);
                dVar2.f(str2);
                ej.B.I(dVar2.l(), null, j7, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, a2.U.a(u8, 0L, 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (w1.P) null, 0, 0L, (a2.C) null, new l2.i(f3, 0), 0, 15728639), tVar2, 0, 0, 262138);
                tVar = tVar2;
                tVar.q(true);
                tVar.q(true);
                j4 = j7;
                rVar2 = rVar5;
                j3 = j6;
                u3 = u9;
                u4 = u8;
            } catch (Throwable th2) {
                dVar2.h(iK);
                throw th2;
            }
        } else {
            tVar = tVar2;
            tVar.b0();
            rVar2 = rVar;
            u3 = u;
            u4 = u2;
            j3 = j;
            j4 = j2;
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new Function2(str, str2, f2, rVar2, u3, u4, j3, j4, i) { // from class: Ie.E
                public final /* synthetic */ String a;
                public final /* synthetic */ String b;
                public final /* synthetic */ float c;
                public final /* synthetic */ p1.r d;
                public final /* synthetic */ a2.U e;
                public final /* synthetic */ a2.U f;
                public final /* synthetic */ long g;
                public final /* synthetic */ long h;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iJ = c1.c.J(385);
                    D.y(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, (c1.o) obj, iJ);
                    return Unit.a;
                }
            };
        }
    }

    public static final void z(C0568n c0568n, boolean z, c1.o oVar, int i) {
        c1.t tVar = (c1.t) oVar;
        tVar.j0(1789592908);
        int i2 = (tVar.f(c0568n) ? 4 : 2) | i | (tVar.g(z) ? 32 : 16);
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            bf.Q q = (bf.Q) tVar.j(aj.I.l);
            boolean zF = tVar.f(c0568n.p()) | ((i2 & 112) == 32);
            Object objT = tVar.T();
            if (zF || objT == c1.n.a) {
                objT = c1.c.r(new x2(c0568n, z, 8));
                tVar.s0(objT);
            }
            m(p1.o.a, null, k1.h.d(-1751450435, new j1(!z ? Zd.E.b : Zd.E.c, 0), tVar), k1.h.d(1556934172, new C0789x(3, q, (c1.h1) objT), tVar), null, tVar, 3462, 18);
        } else {
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new k1(c0568n, z, i);
        }
    }
}
