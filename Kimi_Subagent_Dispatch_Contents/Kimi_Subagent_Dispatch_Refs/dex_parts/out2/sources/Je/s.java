package Je;

import Dc.C0568n;
import Fh.C0828c;
import Gf.C1039z0;
import Le.Q;
import Qk.Q0;
import Qk.Z0;
import Ti.B0;
import Uc.C2120z2;
import W0.f1;
import W0.f3;
import Zn.L;
import a2.U;
import aj.g0;
import c1.f0;
import c1.h1;
import c1.s0;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import le.C3876c;
import le.C3891r;
import ng.C4068d;
import rf.AbstractC4363l;
import rf.C4352a;
import t0.k0;
import ub.N5;
import vb.AbstractC4917h4;
import w1.P;
import yc.C5673g;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class s implements gl.l {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, boolean z, Object obj4, h1 h1Var, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
        this.f = obj4;
        this.g = h1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c1.t tVar;
        L l;
        int i = this.a;
        Object obj4 = c1.n.a;
        boolean z = this.b;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        switch (i) {
            case 0:
                Zd.B b = (Zd.B) obj9;
                Zd.E e = (Zd.E) obj8;
                C0568n c0568n = (C0568n) obj7;
                U u = (U) obj6;
                h1 h1Var = (h1) obj5;
                k0 k0Var = (k0) obj;
                c1.t tVar2 = (c1.o) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Qk.F f = Qk.F.d;
                Intrinsics.checkNotNullParameter(k0Var, "$this$CommonToolInfoArea");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= tVar2.f(k0Var) ? 4 : 2;
                }
                c1.t tVar3 = tVar2;
                if (tVar3.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    b.getClass();
                    Zd.B b2 = Zd.B.G;
                    p1.o oVar = p1.o.a;
                    if (((b == b2 || b == Zd.B.I || b == Zd.B.H || b == Zd.B.F) && !e.d()) || AbstractC1329a.D(e, c0568n) || ((String) h1Var.getValue()).length() <= 0) {
                        tVar = tVar3;
                        tVar.h0(-63077290);
                    } else {
                        tVar3.h0(-50133829);
                        f3.o((float) 0.5d, 54, ((Ui.g) tVar3.j(Ui.q.a)).O(), tVar3, androidx.compose.foundation.layout.d.f(oVar, 12));
                        tVar = tVar3;
                    }
                    tVar.q(false);
                    AbstractC1329a.x(b, c0568n, e, this.b, tVar, 0);
                    if (AbstractC1329a.D(e, c0568n)) {
                        tVar.h0(-49496996);
                        p1.r rVarR = androidx.compose.foundation.layout.a.r(k0Var.c(1.0f, oVar, true), 4, 0.0f, 0.0f, 0.0f, 14);
                        C5673g c5673g = c0568n.p().n;
                        if (c5673g == null) {
                            C5673g.Companion.getClass();
                            c5673g = C5673g.e;
                        }
                        if (c5673g.a) {
                            Sk.w wVar = Z0.a;
                            Intrinsics.checkNotNullParameter(f, "<this>");
                            l = (L) Z0.T.getValue();
                        } else {
                            Sk.w wVar2 = Z0.a;
                            Intrinsics.checkNotNullParameter(f, "<this>");
                            l = (L) Z0.S.getValue();
                        }
                        ej.B.H(N5.e(l, tVar, 0), rVarR, 0L, 0L, null, null, 0L, new l2.k(6), 0L, 2, false, 1, 0, U.a(u, ((Ui.g) tVar.j(Ui.q.a)).F(), 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (P) null, 0, 0L, (a2.C) null, (l2.i) null, 0, 16777214), tVar, 0, 24960, 109564);
                        tVar.q(false);
                    } else {
                        tVar.h0(-48806285);
                        ej.B.H((String) h1Var.getValue(), null, 0L, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, U.a(u, ((Ui.g) tVar.j(Ui.q.a)).F(), 0L, (e2.w) null, (e2.q) null, (e2.j) null, 0L, (l2.l) null, (P) null, 0, 0L, (a2.C) null, (l2.i) null, 0, 16777214), tVar, 0, 24960, 110590);
                        tVar.q(false);
                    }
                } else {
                    tVar3.b0();
                }
                return Unit.a;
            case 1:
                C3876c c3876c = (C3876c) obj9;
                Function1 function1 = (Function1) obj8;
                z0.B b3 = (z0.B) obj7;
                C3891r c3891r = (C3891r) obj6;
                f0 f0Var = (f0) obj5;
                C0828c c0828c = (C0828c) obj;
                c1.t tVar4 = (c1.o) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter(c0828c, "$this$MarkdownBlockHeader");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= tVar4.f(c0828c) ? 4 : 2;
                }
                c1.t tVar5 = tVar4;
                if (tVar5.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    c0828c.e.setValue(Boolean.valueOf(c3876c.e()));
                    c0828c.o.setValue(Boolean.valueOf(c3876c.e()));
                    boolean zF = tVar5.f(function1);
                    Object objT = tVar5.T();
                    if (zF || objT == obj4) {
                        objT = new Me.s(23, function1);
                        tVar5.s0(objT);
                    }
                    Function0 function0 = (Function0) objT;
                    if (b3.k() != 0) {
                        function0 = null;
                    }
                    c0828c.b(function0);
                    boolean zF2 = tVar5.f(function1) | tVar5.h(c3876c);
                    Object objT2 = tVar5.T();
                    if (zF2 || objT2 == obj4) {
                        objT2 = new Qg.a(23, function1, c3876c);
                        tVar5.s0(objT2);
                    }
                    Function0 function02 = (Function0) objT2;
                    if (!z || c3891r.i.f.length() != 0) {
                        function02 = null;
                    }
                    c0828c.p.setValue(function02);
                    c0828c.a(!((Boolean) f0Var.getValue()).booleanValue());
                    Object objT3 = tVar5.T();
                    if (objT3 == obj4) {
                        objT3 = new B0(f0Var, 3);
                        tVar5.s0(objT3);
                    }
                    Function0 function03 = (Function0) objT3;
                    if (b3.k() != 0) {
                        function03 = null;
                    }
                    c0828c.d(function03);
                    c0828c.i.setValue(Boolean.valueOf(c3876c.e()));
                    boolean zF3 = tVar5.f(function1);
                    Object objT4 = tVar5.T();
                    if (zF3 || objT4 == obj4) {
                        objT4 = new Me.s(24, function1);
                        tVar5.s0(objT4);
                    }
                    c0828c.c((z && b3.k() == 1) ? (Function0) objT4 : null);
                } else {
                    tVar5.b0();
                }
                return Unit.a;
            case 2:
                Function1 function12 = (Function1) obj9;
                C1039z0 c1039z0 = (C1039z0) obj8;
                C4068d c4068d = (C4068d) obj7;
                Function0 function04 = (Function0) obj6;
                Set set = (Set) obj5;
                c1.t tVar6 = (c1.o) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter((t0.t) obj, "$this$DraggableToClose");
                c1.t tVar7 = tVar6;
                if (tVar7.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    boolean zF4 = tVar7.f(function12) | tVar7.h(c1039z0) | tVar7.f(c4068d) | tVar7.f(function04);
                    Object objT5 = tVar7.T();
                    if (zF4 || objT5 == obj4) {
                        objT5 = new f1(function12, c1039z0, function04, c4068d, 16);
                        tVar7.s0(objT5);
                    }
                    AbstractC4363l.d(z, (Function0) objT5, tVar7, 0);
                    float f2 = 16;
                    p1.r rVarO = t0.e.o(androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.a.p(AbstractC4917h4.b(androidx.compose.foundation.layout.d.c, AbstractC4917h4.a(0, tVar7, 1), true), f2, 0.0f, 2), 0.0f, 0.0f, 0.0f, f2, 7));
                    t0.s sVarA = t0.r.a(t0.j.c, p1.c.m, tVar7, 0);
                    int iHashCode = Long.hashCode(tVar7.T);
                    s0 s0VarL = tVar7.l();
                    p1.r rVarD = p1.a.d(tVar7, rVarO);
                    P1.k.R0.getClass();
                    P1.i iVar = P1.j.b;
                    if (tVar7.a == null) {
                        c1.c.v();
                        throw null;
                    }
                    tVar7.l0();
                    if (tVar7.S) {
                        tVar7.k(iVar);
                    } else {
                        tVar7.v0();
                    }
                    c1.c.G(tVar7, sVarA, P1.j.f);
                    c1.c.G(tVar7, s0VarL, P1.j.e);
                    P1.h hVar = P1.j.g;
                    if (tVar7.S || !Intrinsics.b(tVar7.T(), Integer.valueOf(iHashCode))) {
                        A8.b.r(iHashCode, tVar7, iHashCode, hVar);
                    }
                    c1.c.G(tVar7, rVarD, P1.j.d);
                    Set set2 = (Set) c4068d.a.getValue();
                    boolean zF5 = tVar7.f(c4068d);
                    Object objT6 = tVar7.T();
                    if (zF5 || objT6 == obj4) {
                        objT6 = new g0(24, c4068d);
                        tVar7.s0(objT6);
                    }
                    Function1 function13 = (Function1) objT6;
                    boolean zF6 = tVar7.f(function12);
                    Object objT7 = tVar7.T();
                    if (zF6 || objT7 == obj4) {
                        objT7 = new C4352a(2, function12);
                        tVar7.s0(objT7);
                    }
                    Function0 function05 = (Function0) objT7;
                    boolean zF7 = tVar7.f(function12);
                    Object objT8 = tVar7.T();
                    if (zF7 || objT8 == obj4) {
                        objT8 = new We.a(13, function12);
                        tVar7.s0(objT8);
                    }
                    Function1 function14 = (Function1) objT8;
                    boolean zF8 = tVar7.f(function12);
                    Object objT9 = tVar7.T();
                    if (zF8 || objT9 == obj4) {
                        objT9 = new C4352a(3, function12);
                        tVar7.s0(objT9);
                    }
                    AbstractC4363l.o(set2, set, function13, function05, function14, (Function0) objT9, tVar7, 0, 0);
                    tVar7.q(true);
                } else {
                    tVar7.b0();
                }
                return Unit.a;
            default:
                Function1 function15 = (Function1) obj9;
                C2120z2 c2120z2 = (C2120z2) obj8;
                C4068d c4068d2 = (C4068d) obj7;
                C4068d c4068d3 = (C4068d) obj6;
                Function0 function06 = (Function0) obj5;
                c1.t tVar8 = (c1.o) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                Intrinsics.checkNotNullParameter((t0.t) obj, "$this$DraggableToClose");
                c1.t tVar9 = tVar8;
                if (tVar9.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    boolean zF9 = tVar9.f(function15) | tVar9.f(c2120z2) | tVar9.f(c4068d2) | tVar9.f(c4068d3) | tVar9.f(function06);
                    Object objT10 = tVar9.T();
                    if (zF9 || objT10 == obj4) {
                        objT10 = new Fh.U(function15, c2120z2, function06, c4068d2, c4068d3, 10);
                        tVar9.s0(objT10);
                    }
                    AbstractC4363l.y(z, (Function0) objT10, tVar9, 0);
                    float f3 = 16;
                    p1.r rVarR2 = androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.a.p(androidx.compose.foundation.layout.d.c, f3, 0.0f, 2), 0.0f, f3, 0.0f, 0.0f, 13);
                    t0.s sVarA2 = t0.r.a(t0.j.g(f3), p1.c.m, tVar9, 6);
                    int iHashCode2 = Long.hashCode(tVar9.T);
                    s0 s0VarL2 = tVar9.l();
                    p1.r rVarD2 = p1.a.d(tVar9, rVarR2);
                    P1.k.R0.getClass();
                    P1.i iVar2 = P1.j.b;
                    if (tVar9.a == null) {
                        c1.c.v();
                        throw null;
                    }
                    tVar9.l0();
                    if (tVar9.S) {
                        tVar9.k(iVar2);
                    } else {
                        tVar9.v0();
                    }
                    c1.c.G(tVar9, sVarA2, P1.j.f);
                    c1.c.G(tVar9, s0VarL2, P1.j.e);
                    P1.h hVar2 = P1.j.g;
                    if (tVar9.S || !Intrinsics.b(tVar9.T(), Integer.valueOf(iHashCode2))) {
                        A8.b.r(iHashCode2, tVar9, iHashCode2, hVar2);
                    }
                    c1.c.G(tVar9, rVarD2, P1.j.d);
                    Qk.F f4 = Qk.F.d;
                    Sk.w wVar3 = Q0.a;
                    Intrinsics.checkNotNullParameter(f4, "<this>");
                    AbstractC4363l.v(N5.e((L) Q0.E.getValue(), tVar9, 0), k1.h.d(-919178847, new Q(10, c4068d2), tVar9), tVar9, 48);
                    Intrinsics.checkNotNullParameter(f4, "<this>");
                    AbstractC4363l.v(N5.e((L) Q0.D.getValue(), tVar9, 0), k1.h.d(971087192, new Q(11, c4068d3), tVar9), tVar9, 48);
                    tVar9.q(true);
                } else {
                    tVar9.b0();
                }
                return Unit.a;
        }
    }

    public /* synthetic */ s(boolean z, Function1 function1, Object obj, C4068d c4068d, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = z;
        this.c = function1;
        this.d = obj;
        this.e = c4068d;
        this.f = obj2;
        this.g = obj3;
    }
}
