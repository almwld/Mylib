package gf;

import Cf.P3;
import Dc.C0568n;
import Dc.Z6;
import Ie.K0;
import W0.f1;
import W0.f3;
import Zd.B;
import bc.C2424a;
import bf.C2474h;
import bf.P;
import bf.Q;
import c1.f0;
import c1.t;
import c1.y0;
import c1.z0;
import cf.C2600k;
import com.google.firebase.encoders.json.BuildConfig;
import ek.K;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import t0.d0;
import ub.AbstractC4773y7;
import vb.AbstractC4977s;
import yd.AbstractC5709r0;

/* JADX INFO: renamed from: gf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public abstract class AbstractC3377a {
    public static final k1.c a = new k1.c(new K(5), false, -1153990133);

    public static final void a(final P3 p3, final B b, Z6 z6, c1.o oVar, final int i) {
        P3 p32;
        B b2;
        t tVar;
        z0 z0VarV;
        Function2 function2;
        final Z6 z62 = z6;
        Intrinsics.checkNotNullParameter(p3, "model");
        Intrinsics.checkNotNullParameter(b, "toolDefine");
        Intrinsics.checkNotNullParameter(z62, "toolBlock");
        t tVar2 = (t) oVar;
        tVar2.j0(-1373507158);
        int i2 = (tVar2.f(p3) ? 4 : 2) | i | (tVar2.d(b.ordinal()) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= tVar2.f(z62) ? 256 : 128;
        }
        int i3 = i2;
        if (tVar2.Y(i3 & 1, (i3 & 147) != 146)) {
            Object objT = tVar2.T();
            Object obj = c1.n.a;
            if (objT == obj) {
                objT = c1.c.z(BuildConfig.FLAVOR);
                tVar2.s0(objT);
            }
            f0 f0Var = (f0) objT;
            String str = z62.c;
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object objT2 = tVar2.T();
            if (z || objT2 == obj) {
                objT2 = new C3388l(z62, f0Var, null);
                tVar2.s0(objT2);
            }
            c1.c.f(tVar2, str, (Function2) objT2);
            Object objT3 = tVar2.T();
            if (objT3 == obj) {
                objT3 = c1.c.o(kotlin.coroutines.g.a, tVar2);
                tVar2.s0(objT3);
            }
            Mm.B b3 = (Mm.B) objT3;
            if (z62.q != null) {
                tVar2.h0(2129525);
                StringBuilder sb2 = new StringBuilder(16);
                ArrayList arrayListM = g6.a.m();
                new ArrayList();
                sb2.append((String) f0Var.getValue());
                String string = sb2.toString();
                ArrayList arrayList = new ArrayList(arrayListM.size());
                int size = arrayListM.size();
                for (int iE = 0; iE < size; iE = S0.b.e(sb2, (a2.c) arrayListM.get(iE), arrayList, iE, 1)) {
                }
                AbstractC4977s.d(new a2.g(string, arrayList), z62, tVar2, (i3 >> 3) & 112);
                tVar2.q(false);
                z0VarV = tVar2.v();
                if (z0VarV != null) {
                    final int i5 = 0;
                    function2 = new Function2() { // from class: gf.j
                        public final Object invoke(Object obj2, Object obj3) {
                            int i6 = i5;
                            c1.o oVar2 = (c1.o) obj2;
                            ((Integer) obj3).getClass();
                            switch (i6) {
                                case 0:
                                    AbstractC3377a.a(p3, b, z62, oVar2, c1.c.J(i | 1));
                                    break;
                                default:
                                    AbstractC3377a.a(p3, b, z62, oVar2, c1.c.J(i | 1));
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    z0VarV.d = function2;
                }
                return;
            }
            b2 = b;
            tVar2.h0(-713640);
            tVar2.q(false);
            int iOrdinal = b2.ordinal();
            if (iOrdinal == 47 || iOrdinal == 48) {
                p32 = p3;
                tVar = tVar2;
                tVar.h0(6519001);
                kf.a.m(z62, tVar, (i3 >> 6) & 14);
                tVar.q(false);
            } else if (iOrdinal == 50) {
                p32 = p3;
                tVar = tVar2;
                tVar.h0(6672017);
                kf.a.a(z62, tVar, (i3 >> 6) & 14);
                tVar.q(false);
            } else if (iOrdinal == 57) {
                p32 = p3;
                tVar = tVar2;
                tVar.h0(7057936);
                StringBuilder sb3 = new StringBuilder(16);
                ArrayList arrayListM2 = g6.a.m();
                new ArrayList();
                sb3.append((String) f0Var.getValue());
                String string2 = sb3.toString();
                ArrayList arrayList2 = new ArrayList(arrayListM2.size());
                int size2 = arrayListM2.size();
                for (int iE2 = 0; iE2 < size2; iE2 = S0.b.e(sb3, (a2.c) arrayListM2.get(iE2), arrayList2, iE2, 1)) {
                }
                AbstractC4977s.d(new a2.g(string2, arrayList2), z62, tVar, (i3 >> 3) & 112);
                tVar.q(false);
            } else if (iOrdinal != 59) {
                switch (iOrdinal) {
                    case 11:
                    case 12:
                        p32 = p3;
                        tVar = tVar2;
                        tVar.h0(2891133);
                        kf.a.r(z62, tVar, (i3 >> 6) & 14);
                        tVar.q(false);
                        break;
                    case 13:
                        p32 = p3;
                        tVar = tVar2;
                        tVar.h0(3909979);
                        Object objT4 = tVar.T();
                        if (objT4 == obj) {
                            objT4 = c1.c.z(I.a);
                            tVar.s0(objT4);
                        }
                        f0 f0Var2 = (f0) objT4;
                        boolean z2 = i4 == 256;
                        Object objT5 = tVar.T();
                        if (z2 || objT5 == obj) {
                            objT5 = new C3390n(z62, f0Var2, null);
                            tVar.s0(objT5);
                        }
                        c1.c.f(tVar, z62, (Function2) objT5);
                        AbstractC4977s.e((List) f0Var2.getValue(), z62, tVar, (i3 >> 3) & 112);
                        tVar.q(false);
                        break;
                    case 14:
                        p32 = p3;
                        tVar = tVar2;
                        tVar.h0(4535900);
                        kf.a.l(z62, tVar, (i3 >> 6) & 14);
                        tVar.q(false);
                        break;
                    case 15:
                    case 16:
                    case 17:
                        p32 = p3;
                        tVar = tVar2;
                        tVar.h0(3114612);
                        kf.a.c(b2, z62, tVar, (i3 >> 3) & 126);
                        tVar.q(false);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                        p32 = p3;
                        tVar2.h0(2717812);
                        kf.a.s(null, z62, null, tVar2, (i3 >> 3) & 112, 5);
                        z62 = z62;
                        tVar = tVar2;
                        tVar.q(false);
                        break;
                    case 28:
                        p32 = p3;
                        tVar2.h0(6298901);
                        Object objT6 = tVar2.T();
                        if (objT6 == obj) {
                            objT6 = new C3387k(0);
                            tVar2.s0(objT6);
                        }
                        kf.a.i(z62, (Function0) objT6, tVar2, ((i3 >> 6) & 14) | 48);
                        tVar2.q(false);
                        tVar = tVar2;
                        break;
                    case 29:
                        p32 = p3;
                        tVar2.h0(5040921);
                        kf.a.t(p32, z62, tVar2, (i3 & 14) | ((i3 >> 3) & 112));
                        tVar2.q(false);
                        tVar = tVar2;
                        break;
                    case 30:
                    case 31:
                    case 32:
                        tVar2.h0(5350270);
                        Q q = (Q) tVar2.j(aj.I.l);
                        boolean zF = ((i3 & 14) == 4) | tVar2.f(q) | tVar2.h(b3) | (i4 == 256);
                        Object objT7 = tVar2.T();
                        if (zF || objT7 == obj) {
                            f1 f1Var = new f1(p3, q, b3, z62, 7);
                            p32 = p3;
                            z62 = z62;
                            tVar2.s0(f1Var);
                            objT7 = f1Var;
                        } else {
                            p32 = p3;
                        }
                        kf.a.i(z62, (Function0) objT7, tVar2, (i3 >> 6) & 14);
                        tVar2.q(false);
                        tVar = tVar2;
                        break;
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                        tVar2.h0(4831888);
                        kf.a.f(b2, z62, tVar2, (i3 >> 3) & 126);
                        tVar2.q(false);
                        p32 = p3;
                        tVar = tVar2;
                        break;
                    case 37:
                    case 38:
                        tVar2.h0(3365712);
                        StringBuilder sb4 = new StringBuilder(16);
                        ArrayList arrayListM3 = g6.a.m();
                        new ArrayList();
                        sb4.append((String) f0Var.getValue());
                        String string3 = sb4.toString();
                        ArrayList arrayList3 = new ArrayList(arrayListM3.size());
                        int size3 = arrayListM3.size();
                        for (int iE3 = 0; iE3 < size3; iE3 = S0.b.e(sb4, (a2.c) arrayListM3.get(iE3), arrayList3, iE3, 1)) {
                        }
                        AbstractC4977s.d(new a2.g(string3, arrayList3), z62, tVar2, (i3 >> 3) & 112);
                        tVar2.q(false);
                        p32 = p3;
                        tVar = tVar2;
                        break;
                    case 39:
                    case 40:
                        tVar2.h0(3654384);
                        StringBuilder sb5 = new StringBuilder(16);
                        ArrayList arrayListM4 = g6.a.m();
                        new ArrayList();
                        sb5.append((String) f0Var.getValue());
                        String string4 = sb5.toString();
                        ArrayList arrayList4 = new ArrayList(arrayListM4.size());
                        int size4 = arrayListM4.size();
                        for (int iE4 = 0; iE4 < size4; iE4 = S0.b.e(sb5, (a2.c) arrayListM4.get(iE4), arrayList4, iE4, 1)) {
                        }
                        AbstractC4977s.d(new a2.g(string4, arrayList4), z62, tVar2, (i3 >> 3) & 112);
                        tVar2.q(false);
                        p32 = p3;
                        tVar = tVar2;
                        break;
                    default:
                        switch (iOrdinal) {
                            case 52:
                            case 53:
                            case 54:
                            case 55:
                                tVar2.h0(7453744);
                                StringBuilder sb6 = new StringBuilder(16);
                                ArrayList arrayListM5 = g6.a.m();
                                new ArrayList();
                                sb6.append((String) f0Var.getValue());
                                String string5 = sb6.toString();
                                ArrayList arrayList5 = new ArrayList(arrayListM5.size());
                                int size5 = arrayListM5.size();
                                for (int iE5 = 0; iE5 < size5; iE5 = S0.b.e(sb6, (a2.c) arrayListM5.get(iE5), arrayList5, iE5, 1)) {
                                }
                                AbstractC4977s.d(new a2.g(string5, arrayList5), z62, tVar2, (i3 >> 3) & 112);
                                tVar2.q(false);
                                break;
                            default:
                                tVar2.h0(7671798);
                                AbstractC3384h.c(tVar2, 0);
                                tVar2.q(false);
                                break;
                        }
                        p32 = p3;
                        tVar = tVar2;
                        break;
                }
            } else {
                p32 = p3;
                tVar = tVar2;
                tVar.h0(6815888);
                StringBuilder sb7 = new StringBuilder(16);
                ArrayList arrayListM6 = g6.a.m();
                new ArrayList();
                sb7.append((String) f0Var.getValue());
                String string6 = sb7.toString();
                ArrayList arrayList6 = new ArrayList(arrayListM6.size());
                int size6 = arrayListM6.size();
                for (int iE6 = 0; iE6 < size6; iE6 = S0.b.e(sb7, (a2.c) arrayListM6.get(iE6), arrayList6, iE6, 1)) {
                }
                AbstractC4977s.d(new a2.g(string6, arrayList6), z62, tVar, (i3 >> 3) & 112);
                tVar.q(false);
            }
        } else {
            p32 = p3;
            b2 = b;
            tVar = tVar2;
            tVar.b0();
        }
        z0VarV = tVar.v();
        if (z0VarV != null) {
            final int i6 = 1;
            final P3 p33 = p32;
            final B b4 = b2;
            function2 = new Function2() { // from class: gf.j
                public final Object invoke(Object obj2, Object obj3) {
                    int i62 = i6;
                    c1.o oVar2 = (c1.o) obj2;
                    ((Integer) obj3).getClass();
                    switch (i62) {
                        case 0:
                            AbstractC3377a.a(p33, b4, z62, oVar2, c1.c.J(i | 1));
                            break;
                        default:
                            AbstractC3377a.a(p33, b4, z62, oVar2, c1.c.J(i | 1));
                            break;
                    }
                    return Unit.a;
                }
            };
            z0VarV.d = function2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x035a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0360  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(Cf.P3 r60, gf.C3395s r61, W0.z3 r62, c1.o r63, int r64) {
        /*
            Method dump skipped, instruction units count: 1912
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gf.AbstractC3377a.b(Cf.P3, gf.s, W0.z3, c1.o, int):void");
    }

    public static final void c(P3 p3, C3395s c3395s, c1.o oVar, int i) {
        c1.o oVar2;
        EnumC3393q enumC3393q;
        Intrinsics.checkNotNullParameter(p3, "model");
        Intrinsics.checkNotNullParameter(c3395s, "okcUiState");
        c1.o oVar3 = (t) oVar;
        oVar3.j0(1373514107);
        int i2 = (oVar3.f(p3) ? 4 : 2) | i | (oVar3.f(c3395s) ? 32 : 16);
        if (oVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            C0568n c0568n = c3395s.c;
            p1.o oVar4 = p1.o.a;
            if (c0568n == null || (enumC3393q = c3395s.a) == EnumC3393q.h || enumC3393q == EnumC3393q.i) {
                oVar2 = oVar3;
                oVar2.h0(206207033);
                K0.B(oVar4, 16, oVar2, false);
            } else {
                oVar3.h0(205589420);
                float f = 12;
                f3.d(androidx.compose.foundation.layout.a.p(androidx.compose.foundation.layout.d.d(oVar4, 1.0f), 0.0f, f, 1), (float) 0.5d, ((Ui.g) oVar3.j(Ui.q.a)).O(), oVar3, 54, 0);
                oVar2 = oVar3;
                c1.c.b(new y0[]{aj.I.m.a(P.P(c0568n, c3395s.b, oVar3)), aj.I.l.a(P.Q(c3395s.b, p3.j().a.size() - 1, p3.j().a, oVar3, 0, 4))}, k1.h.d(1661847766, new C2474h(c0568n, 3), oVar2), oVar2, 56);
                K0.B(oVar4, f, oVar2, false);
            }
        } else {
            oVar2 = oVar3;
            oVar2.b0();
        }
        z0 z0VarV = oVar2.v();
        if (z0VarV != null) {
            z0VarV.d = new C3385i(p3, c3395s, i, 0);
        }
    }

    public static final void d(P3 p3, Z6 z6, c1.o oVar, int i) {
        Intrinsics.checkNotNullParameter(p3, "model");
        t tVar = (t) oVar;
        tVar.j0(-970260086);
        int i2 = (tVar.f(p3) ? 4 : 2) | i | (tVar.f(z6) ? 32 : 16);
        if (tVar.Y(i2 & 1, (i2 & 19) != 18)) {
            if (z6 != null) {
                tVar.h0(111793485);
                boolean z = (i2 & 112) == 32;
                Object objT = tVar.T();
                if (z || objT == c1.n.a) {
                    C2424a c2424a = B.b;
                    String str = z6.b;
                    c2424a.getClass();
                    objT = c1.c.z(C2424a.k(str));
                    tVar.s0(objT);
                }
                a(p3, (B) ((f0) objT).getValue(), z6, tVar, ((i2 << 3) & 896) | (i2 & 14));
            } else {
                tVar.h0(109667288);
            }
            tVar.q(false);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C2600k(p3, z6, i, 11);
        }
    }

    public static final void e(C3395s c3395s, c1.o oVar, int i) {
        t tVar = (t) oVar;
        tVar.j0(121631121);
        int i2 = (tVar.f(c3395s) ? 4 : 2) | i;
        if (tVar.Y(i2 & 1, (i2 & 3) != 2)) {
            p1.r rVarH = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.s(p1.o.a, AbstractC5709r0.g(tVar).a - 90), 0.0f, 240, 1);
            float f = 16;
            d0 d0Var = new d0(f, f, f, f);
            t0.h hVarG = t0.j.g(12);
            boolean z = (i2 & 14) == 4;
            Object objT = tVar.T();
            if (z || objT == c1.n.a) {
                objT = new e2.k(12, c3395s);
                tVar.s0(objT);
            }
            AbstractC4773y7.a(rVarH, null, d0Var, false, hVarG, null, null, false, null, (Function1) objT, tVar, 24960, 490);
        } else {
            tVar.b0();
        }
        z0 z0VarV = tVar.v();
        if (z0VarV != null) {
            z0VarV.d = new C3378b(c3395s, i);
        }
    }
}
