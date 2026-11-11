package Ag;

import Aj.y2;
import Cf.C0380s1;
import Cf.C0416w1;
import Cf.C0434y1;
import Cf.C0439y6;
import Cf.F1;
import Cf.I6;
import Cf.P3;
import Ec.C0720i;
import Id.C1266g;
import Id.EnumC1263d;
import Qk.V0;
import Uc.C2120z2;
import c1.X;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.SendException;
import dg.C2978a;
import java.util.List;
import je.C3695k0;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nf.C4042k0;
import rf.AbstractC4363l;
import ub.N5;
import ue.C4801l;
import vb.J3;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class R0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ R0(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
        this.f = obj4;
    }

    public final Object invoke(Object obj) {
        final boolean z;
        final Function1 function1;
        final C2120z2 c2120z2;
        final boolean z2;
        final Function1 function12;
        int i = this.a;
        float fFloatValue = 1.0f;
        final int i2 = 0;
        final int i3 = 1;
        boolean z3 = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                C1266g c1266g = (C1266g) obj;
                Intrinsics.checkNotNullParameter(c1266g, "$this$showDialog");
                Qk.F f = Qk.F.d;
                Sk.w wVar = Qk.x0.a;
                Intrinsics.checkNotNullParameter(f, "<this>");
                c1266g.a = Ie.K0.m((Zn.L) Qk.x0.I.getValue(), c1266g, "title");
                Intrinsics.checkNotNullParameter(f, "<this>");
                String strP = Pf.B.p((Zn.L) Qk.x0.H.getValue());
                Intrinsics.checkNotNullParameter(strP, FirebaseAnalytics.Param.CONTENT);
                c1266g.c = strP;
                c1266g.g = Ie.K0.q("leftButtonText");
                Intrinsics.checkNotNullParameter(f, "<this>");
                String strP2 = Pf.B.p((Zn.L) Qk.x0.G.getValue());
                Intrinsics.checkNotNullParameter(strP2, "rightButtonText");
                c1266g.h = strP2;
                EnumC1263d enumC1263d = EnumC1263d.d;
                Intrinsics.checkNotNullParameter(enumC1263d, "rightButtonColor");
                c1266g.s = enumC1263d;
                S0 s0 = new S0((Hd.r) obj5, (Uc.N0) obj4, (String) obj3, this.b, (gl.l) obj2);
                Intrinsics.checkNotNullParameter(s0, "onRightButtonClick");
                c1266g.k = s0;
                break;
            case 1:
                y4.l lVar = (y4.l) obj;
                Intrinsics.checkNotNullParameter(lVar, "entry");
                ((kotlin.jvm.internal.E) obj5).a = true;
                ((kotlin.jvm.internal.E) obj4).a = true;
                ((B4.h) obj3).r(lVar, z3, (kotlin.collections.r) obj2);
                break;
            case 2:
                String str = (String) obj3;
                C3695k0 c3695k0 = (C3695k0) obj5;
                P3 p3 = ((C0439y6) obj4).j;
                Bj.f fVar = (Bj.f) obj2;
                Boolean bool = (Boolean) obj;
                if (bool.booleanValue()) {
                    Intrinsics.checkNotNullParameter(str, "enterMethod");
                    Intrinsics.checkNotNullParameter(c3695k0, "message");
                    Y6.k kVar = new Y6.k(z3 ? "msh_dislike" : "msh_dislike_cancel", 29);
                    boolean z4 = Jd.c.a;
                    kVar.y(Jd.c.a(false), "enter_from");
                    kVar.y(Jd.c.c.a, "msh_conversation_id");
                    kVar.y(str, "enter_method");
                    kVar.y(c3695k0.a.a, "msh_message_id");
                    kVar.y(Boolean.valueOf(c3695k0.j()), "have_researcher");
                    kVar.y(Boolean.valueOf(c3695k0.m()), "have_k1think");
                    kVar.y(c3695k0.k() ? "rag" : "common", "msh_response_type");
                    kVar.y(Boolean.valueOf(c3695k0.h()), "have_memory_update");
                    kVar.y(c3695k0.a.f.d(), "req_scenario");
                    kVar.v();
                    p3.getClass();
                    Intrinsics.checkNotNullParameter(c3695k0, "<set-?>");
                    p3.f0.setValue(c3695k0);
                    if (z3) {
                        P3.O0(p3, c3695k0, false);
                    }
                } else {
                    J3.h(Qk.i1.b(), 6);
                }
                fVar.invoke(bool);
                break;
            case SendException.ERROR_TTL_EXCEEDED /* 3 */:
                ((Boolean) obj).getClass();
                Mm.E.z(androidx.lifecycle.Z.i((C0439y6) obj5), (CoroutineContext) null, (Mm.C) null, new I6((C4801l) obj4, (C3695k0) obj3, (C0720i) obj2, this.b, null), 3);
                break;
            case SendException.ERROR_TOO_MANY_MESSAGES /* 4 */:
                O0.O o = (O0.O) obj4;
                long jA = R0.b0.a(o.s(z3));
                ((kotlin.jvm.internal.H) obj5).a = jA;
                o.F((D0.z0) obj3, jA);
                ((kotlin.jvm.internal.H) obj2).a = 0L;
                o.w = -1;
                break;
            case 5:
                c1.n0 n0Var = ((j0.P) obj5).c;
                c1.f0 f0Var = (c1.f0) obj4;
                c1.h1 h1Var = (c1.h1) obj3;
                c1.h1 h1Var2 = (c1.h1) obj2;
                w1.N n = (w1.N) obj;
                float fFloatValue2 = 0.8f;
                n.o(!z3 ? ((Number) h1Var.getValue()).floatValue() : ((Boolean) n0Var.getValue()).booleanValue() ? 1.0f : 0.8f);
                if (!z3) {
                    fFloatValue2 = ((Number) h1Var.getValue()).floatValue();
                } else if (((Boolean) n0Var.getValue()).booleanValue()) {
                    fFloatValue2 = 1.0f;
                }
                n.u(fFloatValue2);
                if (!z3) {
                    fFloatValue = ((Number) h1Var2.getValue()).floatValue();
                } else if (!((Boolean) n0Var.getValue()).booleanValue()) {
                    fFloatValue = 0.0f;
                }
                n.b(fFloatValue);
                n.G(((w1.V) f0Var.getValue()).a);
                break;
            case 6:
                nh.b0 b0Var = (nh.b0) obj5;
                c1.h1 h1Var3 = (c1.h1) obj4;
                c1.h1 h1Var4 = (c1.h1) obj3;
                c1.h1 h1Var5 = (c1.h1) obj2;
                w1.N n2 = (w1.N) obj;
                Intrinsics.checkNotNullParameter(n2, "$this$graphicsLayer");
                b0Var.g.setValue(new v1.e(n2.f()));
                float fFloatValue3 = b0Var.c() ? ((Number) h1Var3.getValue()).floatValue() : b0Var.j();
                n2.o(fFloatValue3);
                n2.u(fFloatValue3);
                n2.L(b0Var.c() ? ((Number) h1Var4.getValue()).floatValue() : Float.intBitsToFloat((int) (b0Var.i() >> 32)));
                n2.M(b0Var.c() ? ((Number) h1Var5.getValue()).floatValue() : Float.intBitsToFloat((int) (b0Var.i() & 4294967295L)));
                if (z3 && (b0Var.j() != ((Number) b0Var.d.getValue()).floatValue() || !v1.b.d(b0Var.i(), 0L))) {
                    b0Var.n(1.0f);
                    b0Var.m(0L);
                    b0Var.c.setValue(Boolean.FALSE);
                    boolean z5 = C2978a.a;
                    C2978a.b("PhotoView", null, new C4042k0(10));
                }
                break;
            default:
                final List list = (List) obj5;
                final List list2 = (List) obj4;
                final C2120z2 c2120z22 = (C2120z2) obj3;
                final Function1 function13 = (Function1) obj2;
                v0.f fVar2 = (v0.f) obj;
                Intrinsics.checkNotNullParameter(fVar2, "$this$LazyColumn");
                v0.f.p(fVar2, (String) null, (String) null, new k1.c(new y2(23, c2120z22), true, 711922037), 3);
                final boolean z6 = this.b;
                v0.f.p(fVar2, (String) null, (String) null, new k1.c(new gl.l() { // from class: rf.F
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i4 = i3;
                        androidx.compose.foundation.lazy.a aVar = (androidx.compose.foundation.lazy.a) obj6;
                        c1.t tVar = (c1.o) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        switch (i4) {
                            case 0:
                                Intrinsics.checkNotNullParameter(aVar, "$this$item");
                                c1.t tVar2 = tVar;
                                if (tVar2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    p1.o oVar = p1.o.a;
                                    boolean z7 = z6;
                                    final Function1 function14 = function13;
                                    final C2120z2 c2120z23 = c2120z22;
                                    X x = c1.n.a;
                                    if (z7) {
                                        tVar2.h0(1091135099);
                                        boolean zF = tVar2.f(function14) | tVar2.f(c2120z23);
                                        Object objT = tVar2.T();
                                        if (zF || objT == x) {
                                            final int i5 = 0;
                                            objT = new Function0() { // from class: rf.G
                                                public final Object invoke() {
                                                    switch (i5) {
                                                        case 0:
                                                            function14.invoke(new C0380s1(c2120z23.a));
                                                            break;
                                                        case 1:
                                                            function14.invoke(new C0434y1(c2120z23.a));
                                                            break;
                                                        case 2:
                                                            function14.invoke(new C0416w1(c2120z23.a));
                                                            break;
                                                        default:
                                                            function14.invoke(new F1(true, c2120z23.a));
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            tVar2.s0(objT);
                                        }
                                        AbstractC4363l.t(48, tVar2, (Function0) objT, androidx.compose.foundation.layout.a.p(oVar, 24, 0.0f, 2));
                                        tVar2.q(false);
                                    } else {
                                        tVar2.h0(1091579391);
                                        boolean zF2 = tVar2.f(function14) | tVar2.f(c2120z23);
                                        Object objT2 = tVar2.T();
                                        if (zF2 || objT2 == x) {
                                            final int i6 = 1;
                                            objT2 = new Function0() { // from class: rf.G
                                                public final Object invoke() {
                                                    switch (i6) {
                                                        case 0:
                                                            function14.invoke(new C0380s1(c2120z23.a));
                                                            break;
                                                        case 1:
                                                            function14.invoke(new C0434y1(c2120z23.a));
                                                            break;
                                                        case 2:
                                                            function14.invoke(new C0416w1(c2120z23.a));
                                                            break;
                                                        default:
                                                            function14.invoke(new F1(true, c2120z23.a));
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            tVar2.s0(objT2);
                                        }
                                        AbstractC4363l.I(48, tVar2, (Function0) objT2, androidx.compose.foundation.layout.a.p(oVar, 24, 0.0f, 2));
                                        tVar2.q(false);
                                    }
                                } else {
                                    tVar2.b0();
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(aVar, "$this$item");
                                c1.t tVar3 = tVar;
                                if (tVar3.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    p1.r rVarP = androidx.compose.foundation.layout.a.p(p1.o.a, 24, 0.0f, 2);
                                    final Function1 function15 = function13;
                                    boolean zF3 = tVar3.f(function15);
                                    final C2120z2 c2120z24 = c2120z22;
                                    boolean zF4 = zF3 | tVar3.f(c2120z24);
                                    Object objT3 = tVar3.T();
                                    Object obj9 = c1.n.a;
                                    if (zF4 || objT3 == obj9) {
                                        final int i7 = 2;
                                        objT3 = new Function0() { // from class: rf.G
                                            public final Object invoke() {
                                                switch (i7) {
                                                    case 0:
                                                        function15.invoke(new C0380s1(c2120z24.a));
                                                        break;
                                                    case 1:
                                                        function15.invoke(new C0434y1(c2120z24.a));
                                                        break;
                                                    case 2:
                                                        function15.invoke(new C0416w1(c2120z24.a));
                                                        break;
                                                    default:
                                                        function15.invoke(new F1(true, c2120z24.a));
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        tVar3.s0(objT3);
                                    }
                                    Function0 function0 = (Function0) objT3;
                                    boolean zF5 = tVar3.f(function15) | tVar3.f(c2120z24);
                                    Object objT4 = tVar3.T();
                                    if (zF5 || objT4 == obj9) {
                                        final int i8 = 3;
                                        objT4 = new Function0() { // from class: rf.G
                                            public final Object invoke() {
                                                switch (i8) {
                                                    case 0:
                                                        function15.invoke(new C0380s1(c2120z24.a));
                                                        break;
                                                    case 1:
                                                        function15.invoke(new C0434y1(c2120z24.a));
                                                        break;
                                                    case 2:
                                                        function15.invoke(new C0416w1(c2120z24.a));
                                                        break;
                                                    default:
                                                        function15.invoke(new F1(true, c2120z24.a));
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        tVar3.s0(objT4);
                                    }
                                    Function0 function02 = (Function0) objT4;
                                    boolean zF6 = tVar3.f(function15);
                                    Object objT5 = tVar3.T();
                                    if (zF6 || objT5 == obj9) {
                                        objT5 = new C4352a(12, function15);
                                        tVar3.s0(objT5);
                                    }
                                    AbstractC4363l.c(48, tVar3, function0, function02, (Function0) objT5, rVarP, z6);
                                } else {
                                    tVar3.b0();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }, true, -788472340), 3);
                if (list.isEmpty()) {
                    z = z6;
                    function1 = function13;
                    c2120z2 = c2120z22;
                } else {
                    final int i4 = 0;
                    z = z6;
                    function1 = function13;
                    c2120z2 = c2120z22;
                    v0.f.p(fVar2, (String) null, (String) null, new k1.c(new gl.l() { // from class: rf.K
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i5 = i4;
                            p1.o oVar = p1.o.a;
                            switch (i5) {
                                case 0:
                                    c1.t tVar = (c1.o) obj7;
                                    int iIntValue = ((Integer) obj8).intValue();
                                    Intrinsics.checkNotNullParameter((androidx.compose.foundation.lazy.a) obj6, "$this$item");
                                    c1.t tVar2 = tVar;
                                    if (tVar2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        Sk.w wVar2 = V0.a;
                                        Intrinsics.checkNotNullParameter(Qk.F.d, "<this>");
                                        AbstractC4363l.X(48, tVar2, N5.e((Zn.L) V0.p.getValue(), tVar2, 0), androidx.compose.foundation.layout.a.p(oVar, 40, 0.0f, 2));
                                        t0.e.d(tVar2, androidx.compose.foundation.layout.d.f(oVar, 8));
                                        AbstractC4363l.K(list, c2120z2, z, function1, androidx.compose.foundation.layout.a.p(oVar, 24, 0.0f, 2), tVar2, 24576);
                                    } else {
                                        tVar2.b0();
                                    }
                                    break;
                                default:
                                    c1.t tVar3 = (c1.o) obj7;
                                    int iIntValue2 = ((Integer) obj8).intValue();
                                    Intrinsics.checkNotNullParameter((androidx.compose.foundation.lazy.a) obj6, "$this$item");
                                    c1.t tVar4 = tVar3;
                                    if (tVar4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        Sk.w wVar3 = V0.a;
                                        Intrinsics.checkNotNullParameter(Qk.F.d, "<this>");
                                        AbstractC4363l.X(48, tVar4, N5.e((Zn.L) V0.m.getValue(), tVar4, 0), androidx.compose.foundation.layout.a.p(oVar, 40, 0.0f, 2));
                                        t0.e.d(tVar4, androidx.compose.foundation.layout.d.f(oVar, 8));
                                        AbstractC4363l.K(list, c2120z2, z, function1, androidx.compose.foundation.layout.a.p(oVar, 24, 0.0f, 2), tVar4, 24576);
                                    } else {
                                        tVar4.b0();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, true, -554794224), 3);
                }
                final C2120z2 c2120z23 = c2120z2;
                if (list2.isEmpty()) {
                    z2 = z;
                    function12 = function1;
                } else {
                    final int i5 = 1;
                    final boolean z7 = z;
                    final Function1 function14 = function1;
                    z2 = z7;
                    function12 = function14;
                    v0.f.p(fVar2, (String) null, (String) null, new k1.c(new gl.l() { // from class: rf.K
                        public final Object invoke(Object obj6, Object obj7, Object obj8) {
                            int i52 = i5;
                            p1.o oVar = p1.o.a;
                            switch (i52) {
                                case 0:
                                    c1.t tVar = (c1.o) obj7;
                                    int iIntValue = ((Integer) obj8).intValue();
                                    Intrinsics.checkNotNullParameter((androidx.compose.foundation.lazy.a) obj6, "$this$item");
                                    c1.t tVar2 = tVar;
                                    if (tVar2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        Sk.w wVar2 = V0.a;
                                        Intrinsics.checkNotNullParameter(Qk.F.d, "<this>");
                                        AbstractC4363l.X(48, tVar2, N5.e((Zn.L) V0.p.getValue(), tVar2, 0), androidx.compose.foundation.layout.a.p(oVar, 40, 0.0f, 2));
                                        t0.e.d(tVar2, androidx.compose.foundation.layout.d.f(oVar, 8));
                                        AbstractC4363l.K(list2, c2120z23, z7, function14, androidx.compose.foundation.layout.a.p(oVar, 24, 0.0f, 2), tVar2, 24576);
                                    } else {
                                        tVar2.b0();
                                    }
                                    break;
                                default:
                                    c1.t tVar3 = (c1.o) obj7;
                                    int iIntValue2 = ((Integer) obj8).intValue();
                                    Intrinsics.checkNotNullParameter((androidx.compose.foundation.lazy.a) obj6, "$this$item");
                                    c1.t tVar4 = tVar3;
                                    if (tVar4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        Sk.w wVar3 = V0.a;
                                        Intrinsics.checkNotNullParameter(Qk.F.d, "<this>");
                                        AbstractC4363l.X(48, tVar4, N5.e((Zn.L) V0.m.getValue(), tVar4, 0), androidx.compose.foundation.layout.a.p(oVar, 40, 0.0f, 2));
                                        t0.e.d(tVar4, androidx.compose.foundation.layout.d.f(oVar, 8));
                                        AbstractC4363l.K(list2, c2120z23, z7, function14, androidx.compose.foundation.layout.a.p(oVar, 24, 0.0f, 2), tVar4, 24576);
                                    } else {
                                        tVar4.b0();
                                    }
                                    break;
                            }
                            return Unit.a;
                        }
                    }, true, 1667912903), 3);
                }
                v0.f.p(fVar2, (String) null, (String) null, new k1.c(new gl.l() { // from class: rf.F
                    public final Object invoke(Object obj6, Object obj7, Object obj8) {
                        int i42 = i2;
                        androidx.compose.foundation.lazy.a aVar = (androidx.compose.foundation.lazy.a) obj6;
                        c1.t tVar = (c1.o) obj7;
                        int iIntValue = ((Integer) obj8).intValue();
                        switch (i42) {
                            case 0:
                                Intrinsics.checkNotNullParameter(aVar, "$this$item");
                                c1.t tVar2 = tVar;
                                if (tVar2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    p1.o oVar = p1.o.a;
                                    boolean z72 = z2;
                                    final Function1 function142 = function12;
                                    final C2120z2 c2120z232 = c2120z23;
                                    X x = c1.n.a;
                                    if (z72) {
                                        tVar2.h0(1091135099);
                                        boolean zF = tVar2.f(function142) | tVar2.f(c2120z232);
                                        Object objT = tVar2.T();
                                        if (zF || objT == x) {
                                            final int i52 = 0;
                                            objT = new Function0() { // from class: rf.G
                                                public final Object invoke() {
                                                    switch (i52) {
                                                        case 0:
                                                            function142.invoke(new C0380s1(c2120z232.a));
                                                            break;
                                                        case 1:
                                                            function142.invoke(new C0434y1(c2120z232.a));
                                                            break;
                                                        case 2:
                                                            function142.invoke(new C0416w1(c2120z232.a));
                                                            break;
                                                        default:
                                                            function142.invoke(new F1(true, c2120z232.a));
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            tVar2.s0(objT);
                                        }
                                        AbstractC4363l.t(48, tVar2, (Function0) objT, androidx.compose.foundation.layout.a.p(oVar, 24, 0.0f, 2));
                                        tVar2.q(false);
                                    } else {
                                        tVar2.h0(1091579391);
                                        boolean zF2 = tVar2.f(function142) | tVar2.f(c2120z232);
                                        Object objT2 = tVar2.T();
                                        if (zF2 || objT2 == x) {
                                            final int i6 = 1;
                                            objT2 = new Function0() { // from class: rf.G
                                                public final Object invoke() {
                                                    switch (i6) {
                                                        case 0:
                                                            function142.invoke(new C0380s1(c2120z232.a));
                                                            break;
                                                        case 1:
                                                            function142.invoke(new C0434y1(c2120z232.a));
                                                            break;
                                                        case 2:
                                                            function142.invoke(new C0416w1(c2120z232.a));
                                                            break;
                                                        default:
                                                            function142.invoke(new F1(true, c2120z232.a));
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            };
                                            tVar2.s0(objT2);
                                        }
                                        AbstractC4363l.I(48, tVar2, (Function0) objT2, androidx.compose.foundation.layout.a.p(oVar, 24, 0.0f, 2));
                                        tVar2.q(false);
                                    }
                                } else {
                                    tVar2.b0();
                                }
                                break;
                            default:
                                Intrinsics.checkNotNullParameter(aVar, "$this$item");
                                c1.t tVar3 = tVar;
                                if (tVar3.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    p1.r rVarP = androidx.compose.foundation.layout.a.p(p1.o.a, 24, 0.0f, 2);
                                    final Function1 function15 = function12;
                                    boolean zF3 = tVar3.f(function15);
                                    final C2120z2 c2120z24 = c2120z23;
                                    boolean zF4 = zF3 | tVar3.f(c2120z24);
                                    Object objT3 = tVar3.T();
                                    Object obj9 = c1.n.a;
                                    if (zF4 || objT3 == obj9) {
                                        final int i7 = 2;
                                        objT3 = new Function0() { // from class: rf.G
                                            public final Object invoke() {
                                                switch (i7) {
                                                    case 0:
                                                        function15.invoke(new C0380s1(c2120z24.a));
                                                        break;
                                                    case 1:
                                                        function15.invoke(new C0434y1(c2120z24.a));
                                                        break;
                                                    case 2:
                                                        function15.invoke(new C0416w1(c2120z24.a));
                                                        break;
                                                    default:
                                                        function15.invoke(new F1(true, c2120z24.a));
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        tVar3.s0(objT3);
                                    }
                                    Function0 function0 = (Function0) objT3;
                                    boolean zF5 = tVar3.f(function15) | tVar3.f(c2120z24);
                                    Object objT4 = tVar3.T();
                                    if (zF5 || objT4 == obj9) {
                                        final int i8 = 3;
                                        objT4 = new Function0() { // from class: rf.G
                                            public final Object invoke() {
                                                switch (i8) {
                                                    case 0:
                                                        function15.invoke(new C0380s1(c2120z24.a));
                                                        break;
                                                    case 1:
                                                        function15.invoke(new C0434y1(c2120z24.a));
                                                        break;
                                                    case 2:
                                                        function15.invoke(new C0416w1(c2120z24.a));
                                                        break;
                                                    default:
                                                        function15.invoke(new F1(true, c2120z24.a));
                                                        break;
                                                }
                                                return Unit.a;
                                            }
                                        };
                                        tVar3.s0(objT4);
                                    }
                                    Function0 function02 = (Function0) objT4;
                                    boolean zF6 = tVar3.f(function15);
                                    Object objT5 = tVar3.T();
                                    if (zF6 || objT5 == obj9) {
                                        objT5 = new C4352a(12, function15);
                                        tVar3.s0(objT5);
                                    }
                                    AbstractC4363l.c(48, tVar3, function0, function02, (Function0) objT5, rVarP, z2);
                                } else {
                                    tVar3.b0();
                                }
                                break;
                        }
                        return Unit.a;
                    }
                }, true, 429807277), 3);
                v0.f.p(fVar2, (String) null, (String) null, AbstractC4363l.h, 3);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ R0(C0439y6 c0439y6, C4801l c4801l, C3695k0 c3695k0, C0720i c0720i, boolean z) {
        this.a = 3;
        this.c = c0439y6;
        this.d = c4801l;
        this.e = c3695k0;
        this.f = c0720i;
        this.b = z;
    }

    public /* synthetic */ R0(Hd.r rVar, Uc.N0 n0, String str, boolean z, gl.l lVar) {
        this.a = 0;
        this.c = rVar;
        this.d = n0;
        this.e = str;
        this.b = z;
        this.f = (Xk.i) lVar;
    }

    public /* synthetic */ R0(String str, boolean z, C3695k0 c3695k0, C0439y6 c0439y6, Bj.f fVar) {
        this.a = 2;
        this.e = str;
        this.b = z;
        this.c = c3695k0;
        this.d = c0439y6;
        this.f = fVar;
    }

    public /* synthetic */ R0(kotlin.jvm.internal.H h, O0.O o, boolean z, D0.z0 z0Var, kotlin.jvm.internal.H h2) {
        this.a = 4;
        this.c = h;
        this.d = o;
        this.b = z;
        this.e = z0Var;
        this.f = h2;
    }

    public /* synthetic */ R0(nh.b0 b0Var, boolean z, c1.h1 h1Var, c1.h1 h1Var2, c1.h1 h1Var3) {
        this.a = 6;
        this.c = b0Var;
        this.b = z;
        this.d = h1Var;
        this.e = h1Var2;
        this.f = h1Var3;
    }

    public /* synthetic */ R0(boolean z, j0.P p, c1.f0 f0Var, j0.y0 y0Var, j0.y0 y0Var2) {
        this.a = 5;
        this.b = z;
        this.c = p;
        this.d = f0Var;
        this.e = y0Var;
        this.f = y0Var2;
    }
}
