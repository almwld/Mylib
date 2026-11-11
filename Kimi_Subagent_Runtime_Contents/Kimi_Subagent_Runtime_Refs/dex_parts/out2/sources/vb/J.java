package vb;

import Cf.P3;
import Hf.C1135l4;
import Hf.C1141m4;
import Le.C1429t;
import Mm.C;
import Mm.E;
import Mm.y0;
import P1.f0;
import aj.AbstractC2415q;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.lifecycle.Z;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.Constants;
import dg.C2978a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kd.f1;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import qi.C4277e;
import ub.AbstractC4718s6;
import ub.N5;
import ue.C4801l;
import ve.C5128h;
import ve.W0;
import ve.X0;
import ze.C5867e;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public abstract class J {
    public static final void a(Zn.L l, boolean z, Function0 function0, c1.o oVar, int i, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        c1.t tVar = (c1.t) oVar;
        tVar.j0(-1501983593);
        int i4 = i | (tVar.f(l) ? 32 : 16);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 384;
            z2 = z;
        } else {
            z2 = z;
            i3 = i4 | (tVar.g(z2) ? 256 : 128);
        }
        int i6 = i3 | (tVar.h(function0) ? 2048 : 1024);
        if (tVar.Y(i6 & 1, (i6 & 1171) != 1170)) {
            boolean z4 = i5 != 0 ? false : z2;
            if (1.0f <= 0.0d) {
                u0.a.a("invalid weight; must be greater than zero");
            }
            float f = 12;
            p1.r rVarB = AbstractC4718s6.b(androidx.compose.foundation.layout.d.h(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 40, 0.0f, 2), C0.f.b(f));
            c1.i1 i1Var = Ui.q.a;
            p1.r rVarB2 = androidx.compose.foundation.a.b(rVarB, ((Ui.g) tVar.j(i1Var)).j(), w1.M.a);
            boolean z5 = !z4;
            float f2 = 4;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f2, tVar))) << 32) | (((long) Float.floatToRawIntBits(AbstractC2415q.Q(f2, tVar))) & 4294967295L);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
            Object objT = tVar.T();
            if (objT == c1.n.a) {
                objT = g6.a.p(tVar);
            }
            p1.r rVarA = p1.a.a(rVarB2, new Ti.X(((Ui.g) tVar.j(i1Var)).u(), ((Ui.g) tVar.j(i1Var)).t(), jFloatToRawIntBits, jFloatToRawIntBits2, (r0.l) objT, z5, function0, 1));
            J1.q.a.getClass();
            p1.r rVarO = androidx.compose.foundation.layout.a.o(J1.s.f(rVarA, J1.s.c), f, 8);
            N1.d0 d0VarD = t0.n.d(p1.c.e, false);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarO);
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
            if (z4) {
                tVar.h0(-934734254);
                ej.B.i(androidx.compose.foundation.layout.d.n(p1.o.a, 24), ((Ui.g) tVar.j(i1Var)).E(), tVar, 6, 0);
                tVar.q(false);
            } else {
                tVar.h0(-934536133);
                ej.B.H(N5.e(l, tVar, (i6 >> 3) & 14), null, ((Ui.g) tVar.j(i1Var)).C(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Ui.e) tVar.j(Ui.q.c)).e, tVar, 0, 0, 131066);
                tVar = tVar;
                tVar.q(false);
            }
            tVar.q(true);
            z3 = z4;
        } else {
            tVar.b0();
            z3 = z2;
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new D0.X(l, z3, function0, i, i2);
        }
    }

    public static final void b(sf.I i, c1.o oVar, int i2) {
        int i3;
        final int i4;
        Zn.L l;
        Intrinsics.checkNotNullParameter(i, "chatUiState");
        c1.t tVar = (c1.t) oVar;
        tVar.j0(22376530);
        c1.d dVar = tVar.a;
        if ((i2 & 6) == 0) {
            i3 = i2 | (tVar.f(i) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if (tVar.Y(i3 & 1, (i3 & 3) != 2)) {
            Cf.S3 s3 = i.a;
            Cf.P3 p3 = s3.i;
            final C1141m4 c1141m4 = s3.o;
            p1.o oVar2 = p1.o.a;
            float f = 12;
            float f2 = 8;
            p1.r rVarB = AbstractC4718s6.b(androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.d.u(t0.e.o(oVar2), 0.0f, Pf.G.d, 1), f, f, f, f2), C0.f.b(14));
            c1.i1 i1Var = Ui.q.a;
            p1.r rVarN = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.a.b(rVarB, ((Ui.g) tVar.j(i1Var)).i(), w1.M.a), f);
            t0.s sVarA = t0.r.a(t0.j.g(f), p1.c.m, tVar, 6);
            int iHashCode = Long.hashCode(tVar.T);
            c1.s0 s0VarL = tVar.l();
            p1.r rVarD = p1.a.d(tVar, rVarN);
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
            t0.j0 j0VarA = t0.h0.a(t0.j.g(f2), p1.c.k, tVar, 54);
            int iHashCode2 = Long.hashCode(tVar.T);
            c1.s0 s0VarL2 = tVar.l();
            p1.r rVarD2 = p1.a.d(tVar, oVar2);
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, j0VarA, hVar);
            c1.c.G(tVar, s0VarL2, hVar2);
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode2))) {
                A8.b.r(iHashCode2, tVar, iHashCode2, hVar3);
            }
            c1.c.G(tVar, rVarD2, hVar4);
            Sk.w wVar = Qk.q.a;
            Intrinsics.checkNotNullParameter(Qk.F.a, "<this>");
            W0.i0.a(Zn.n.b((Zn.f) Qk.q.o0.getValue(), tVar, 0), (String) null, androidx.compose.foundation.layout.d.n(oVar2, 16), ((Ui.g) tVar.j(i1Var)).C(), tVar, 432, 0);
            Qk.F f3 = Qk.F.d;
            Sk.w wVar2 = Qk.O.a;
            Intrinsics.checkNotNullParameter(f3, "<this>");
            final int i5 = 0;
            String strE = N5.e((Zn.L) Qk.O.C0.getValue(), tVar, 0);
            c1.i1 i1Var2 = Ui.q.c;
            ej.B.H(strE, null, ((Ui.g) tVar.j(i1Var)).C(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Ui.e) tVar.j(i1Var2)).i, tVar, 0, 0, 131066);
            tVar = tVar;
            if (p3.b0()) {
                tVar.h0(-905984623);
                Intrinsics.checkNotNullParameter(f3, "<this>");
                ej.B.H(N5.e((Zn.L) Qk.O.p0.getValue(), tVar, 0), null, ((Ui.g) tVar.j(i1Var)).F(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((Ui.e) tVar.j(i1Var2)).h, tVar, 0, 0, 131066);
                tVar = tVar;
            } else {
                tVar.h0(-909194518);
            }
            tVar.q(false);
            i4 = 1;
            tVar.q(true);
            t0.j0 j0VarA2 = t0.h0.a(t0.j.g(f), p1.c.j, tVar, 6);
            int iHashCode3 = Long.hashCode(tVar.T);
            c1.s0 s0VarL3 = tVar.l();
            p1.r rVarD3 = p1.a.d(tVar, oVar2);
            tVar.l0();
            if (tVar.S) {
                tVar.k(iVar);
            } else {
                tVar.v0();
            }
            c1.c.G(tVar, j0VarA2, hVar);
            c1.c.G(tVar, s0VarL3, hVar2);
            if (tVar.S || !Intrinsics.b(tVar.T(), Integer.valueOf(iHashCode3))) {
                A8.b.r(iHashCode3, tVar, iHashCode3, hVar3);
            }
            c1.c.G(tVar, rVarD3, hVar4);
            if (p3.b0()) {
                Intrinsics.checkNotNullParameter(f3, "<this>");
                l = (Zn.L) Qk.O.o0.getValue();
            } else {
                Intrinsics.checkNotNullParameter(f3, "<this>");
                l = (Zn.L) Qk.O.n0.getValue();
            }
            Zn.L l2 = l;
            boolean zBooleanValue = ((Boolean) c1141m4.l.a.getValue()).booleanValue();
            boolean zH = tVar.h(c1141m4);
            Object objT = tVar.T();
            c1.X x = c1.n.a;
            if (zH || objT == x) {
                objT = new Function0() { // from class: ff.a
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                C1141m4 c1141m42 = c1141m4;
                                P3 p32 = c1141m42.j;
                                f1 f1Var = p32.D0;
                                C4801l c4801l = c1141m42.k.k.n;
                                if (p32.b0()) {
                                    c1141m42.l.setValue(Boolean.TRUE);
                                    A8.a aVar = new A8.a(21, c1141m42);
                                    c4801l.getClass();
                                    Intrinsics.checkNotNullParameter(aVar, "resultBlock");
                                    f0 f0Var = c4801l.c;
                                    f0Var.getClass();
                                    Intrinsics.checkNotNullParameter(aVar, "resultBlock");
                                    C2978a.a("StreamApiImpl", null, new C5128h(17));
                                    y0 y0Var = (y0) f0Var.d;
                                    if (y0Var != null) {
                                        y0Var.m((CancellationException) null);
                                    }
                                    E.z(f0Var.q(), (CoroutineContext) null, (C) null, new W0(f0Var, aVar, null), 3);
                                    Intrinsics.checkNotNullParameter(f1Var, "showcase");
                                    Intrinsics.checkNotNullParameter(p32, "model");
                                    e7.b.g("msh_replay_page_view_result_click", f1Var, p32).v();
                                } else {
                                    f0 f0Var2 = c4801l.c;
                                    f0Var2.getClass();
                                    C2978a.a("StreamApiImpl", null, new C5128h(16));
                                    C4277e c4277e = (C4277e) f0Var2.g;
                                    if (c4277e == null) {
                                        Intrinsics.l("onEvent");
                                        throw null;
                                    }
                                    Intrinsics.checkNotNullParameter("startReplayStream", Constants.MessagePayloadKeys.FROM);
                                    c4277e.invoke(new C5867e("ClearChatList"));
                                    E.z(f0Var2.q(), (CoroutineContext) null, (C) null, new X0(f0Var2, null), 3);
                                    Intrinsics.checkNotNullParameter(f1Var, "showcase");
                                    Intrinsics.checkNotNullParameter(p32, "model");
                                    e7.b.g("msh_replay_page_replay_click", f1Var, p32).v();
                                }
                                return Unit.a;
                            default:
                                C1141m4 c1141m43 = c1141m4;
                                c1141m43.getClass();
                                E.z(Z.i(c1141m43), (CoroutineContext) null, (C) null, new C1135l4(c1141m43, null), 3);
                                return Unit.a;
                        }
                    }
                };
                tVar.s0(objT);
            }
            a(l2, zBooleanValue, (Function0) objT, tVar, 6, 0);
            Zn.L lH = Qk.O.h();
            boolean zH2 = tVar.h(c1141m4);
            Object objT2 = tVar.T();
            if (zH2 || objT2 == x) {
                objT2 = new Function0() { // from class: ff.a
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                C1141m4 c1141m42 = c1141m4;
                                P3 p32 = c1141m42.j;
                                f1 f1Var = p32.D0;
                                C4801l c4801l = c1141m42.k.k.n;
                                if (p32.b0()) {
                                    c1141m42.l.setValue(Boolean.TRUE);
                                    A8.a aVar = new A8.a(21, c1141m42);
                                    c4801l.getClass();
                                    Intrinsics.checkNotNullParameter(aVar, "resultBlock");
                                    f0 f0Var = c4801l.c;
                                    f0Var.getClass();
                                    Intrinsics.checkNotNullParameter(aVar, "resultBlock");
                                    C2978a.a("StreamApiImpl", null, new C5128h(17));
                                    y0 y0Var = (y0) f0Var.d;
                                    if (y0Var != null) {
                                        y0Var.m((CancellationException) null);
                                    }
                                    E.z(f0Var.q(), (CoroutineContext) null, (C) null, new W0(f0Var, aVar, null), 3);
                                    Intrinsics.checkNotNullParameter(f1Var, "showcase");
                                    Intrinsics.checkNotNullParameter(p32, "model");
                                    e7.b.g("msh_replay_page_view_result_click", f1Var, p32).v();
                                } else {
                                    f0 f0Var2 = c4801l.c;
                                    f0Var2.getClass();
                                    C2978a.a("StreamApiImpl", null, new C5128h(16));
                                    C4277e c4277e = (C4277e) f0Var2.g;
                                    if (c4277e == null) {
                                        Intrinsics.l("onEvent");
                                        throw null;
                                    }
                                    Intrinsics.checkNotNullParameter("startReplayStream", Constants.MessagePayloadKeys.FROM);
                                    c4277e.invoke(new C5867e("ClearChatList"));
                                    E.z(f0Var2.q(), (CoroutineContext) null, (C) null, new X0(f0Var2, null), 3);
                                    Intrinsics.checkNotNullParameter(f1Var, "showcase");
                                    Intrinsics.checkNotNullParameter(p32, "model");
                                    e7.b.g("msh_replay_page_replay_click", f1Var, p32).v();
                                }
                                return Unit.a;
                            default:
                                C1141m4 c1141m43 = c1141m4;
                                c1141m43.getClass();
                                E.z(Z.i(c1141m43), (CoroutineContext) null, (C) null, new C1135l4(c1141m43, null), 3);
                                return Unit.a;
                        }
                    }
                };
                tVar.s0(objT2);
            }
            a(lH, false, (Function0) objT2, tVar, 6, 2);
            tVar.q(true);
            tVar.q(true);
        } else {
            i4 = 1;
            tVar.b0();
        }
        c1.z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C1429t(i, i2, i4);
        }
    }

    public static final re.m c(qm.D d, wl.j jVar, int i) {
        if (jVar == null || sm.l.f(jVar)) {
            return null;
        }
        int size = jVar.n().size() + i;
        if (jVar.C()) {
            List listSubList = d.X().subList(i, size);
            wl.l lVarJ = jVar.j();
            return new re.m(jVar, listSubList, c(d, lVarJ instanceof wl.j ? (wl.j) lVarJ : null, size));
        }
        if (size != d.X().size()) {
            cm.d.n(jVar);
        }
        return new re.m(jVar, d.X().subList(i, d.X().size()), (re.m) null);
    }

    public static final List d(wl.j jVar) {
        List parameters;
        Object next;
        qm.P pQ;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        List listN = jVar.n();
        Intrinsics.checkNotNullExpressionValue(listN, "getDeclaredTypeParameters(...)");
        if (!jVar.C() && !(jVar.j() instanceof wl.b)) {
            return listN;
        }
        int i = gm.d.a;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        gm.b bVar = gm.b.b;
        Sequence sequenceI = Cm.w.i(Cm.s.g(bVar, jVar), 1);
        wl.r rVar = wl.r.d;
        Intrinsics.checkNotNullParameter(sequenceI, "<this>");
        Intrinsics.checkNotNullParameter(rVar, "predicate");
        List listQ = Cm.w.q(Cm.w.l(Cm.w.j(new Cm.f(sequenceI, rVar, 1), wl.r.e), wl.r.f));
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Iterator it = Cm.w.i(Cm.s.g(bVar, jVar), 1).iterator();
        while (true) {
            parameters = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next instanceof wl.f) {
                break;
            }
        }
        wl.f fVar = (wl.f) next;
        if (fVar != null && (pQ = fVar.q()) != null) {
            parameters = pQ.getParameters();
        }
        if (parameters == null) {
            parameters = kotlin.collections.I.a;
        }
        if (listQ.isEmpty() && parameters.isEmpty()) {
            List listN2 = jVar.n();
            Intrinsics.checkNotNullExpressionValue(listN2, "getDeclaredTypeParameters(...)");
            return listN2;
        }
        ArrayList<wl.T> arrayListJ0 = CollectionsKt.j0(listQ, parameters);
        ArrayList arrayList = new ArrayList(kotlin.collections.A.t(arrayListJ0, 10));
        for (wl.T t : arrayListJ0) {
            Intrinsics.d(t);
            arrayList.add(new wl.e(t, jVar, listN.size()));
        }
        return CollectionsKt.j0(listN, arrayList);
    }

    public static final void e(M0.f fVar, int i, int i2) {
        a2.T t = fVar.f;
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        fVar.e(iMin, iMax, BuildConfig.FLAVOR);
        if (t != null) {
            long jB = M0.g.b(iMin, t.a, iMax, 0);
            if (a2.T.d(jB)) {
                fVar.g((a2.T) null);
            } else {
                fVar.f(a2.T.g(jB), (List) null, a2.T.f(jB));
            }
        }
    }

    public static final void f(M0.f fVar, int i, int i2, CharSequence charSequence) {
        int iMin = Math.min(i, i2);
        int iMax = Math.max(i, i2);
        int i3 = 0;
        int i4 = iMin;
        while (i4 < iMax && i3 < charSequence.length() && charSequence.charAt(i3) == fVar.c.charAt(i4)) {
            i3++;
            i4++;
        }
        int length = charSequence.length();
        while (iMax > i4 && length > i3 && charSequence.charAt(length - 1) == fVar.c.charAt(iMax - 1)) {
            length--;
            iMax--;
        }
        if (i4 == iMax && i3 == length) {
            fVar.g((a2.T) null);
            fVar.h = null;
        } else {
            fVar.e(i4, iMax, charSequence.subSequence(i3, length));
        }
        int length2 = charSequence.length() + iMin;
        fVar.h(a2.J.b(length2, length2));
    }
}
