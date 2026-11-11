package K;

import Cf.P3;
import Dc.z3;
import Gf.k2;
import P1.C0471h;
import P1.C0473i;
import P1.C0474j;
import P1.InterfaceC0475k;
import Qk.F;
import Qk.X;
import Sk.w;
import W0.AbstractC0646f3;
import Zd.E;
import Zn.L;
import a2.U;
import android.os.Handler;
import android.os.Looper;
import bf.P;
import bf.Q;
import c1.C1007c;
import c1.C1029n;
import c1.C1040t;
import c1.C1051y0;
import c1.C1053z0;
import c1.InterfaceC1014f0;
import c1.InterfaceC1031o;
import c1.InterfaceC1039s0;
import c1.h1;
import c1.i1;
import ej.B;
import fj.D;
import gf.r;
import j0.AbstractC1413e;
import je.C1;
import je.k0;
import kotlin.collections.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l2.C1541k;
import o9.C1731a;
import p1.AbstractC1816a;
import p1.C1818c;
import p1.C1830o;
import p1.InterfaceC1833r;
import t0.AbstractC2021j;
import t0.C2029s;
import t0.c0;
import t0.h0;
import t0.j0;
import t0.l0;
import ub.N5;
import ub.s6;
import v0.v;
import v1.C2139c;
import vb.d3;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Handler f4187a;

    public static final n2.k a(long j2, long j8) {
        int i4 = (int) (j2 >> 32);
        int i9 = (int) (j2 & 4294967295L);
        return new n2.k(i4, i9, ((int) (j8 >> 32)) + i4, ((int) (j8 & 4294967295L)) + i9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    public static final void b(Dc.n nVar, E e10, InterfaceC1031o interfaceC1031o, int i4) {
        ?? r22;
        C1040t c1040t;
        L l8;
        boolean z10;
        C1040t c1040t2;
        F f10 = F.d;
        C1040t c1040t3 = (C1040t) interfaceC1031o;
        c1040t3.j0(406867929);
        int i9 = i4 | (c1040t3.f(nVar) ? 4 : 2);
        if ((i4 & 48) == 0) {
            i9 |= c1040t3.d(e10.ordinal()) ? 32 : 16;
        }
        if (c1040t3.Y(i9 & 1, (i9 & 19) != 18)) {
            z3 z3Var = nVar.p().q;
            if (z3Var == null) {
                z3.Companion.getClass();
                z3Var = z3.d;
            }
            float f11 = 16;
            C1830o c1830o = C1830o.f23106a;
            float f12 = 8;
            float f13 = 12;
            InterfaceC1833r interfaceC1833rR = androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.a.p(c1830o, f11, 0.0f, 2), 0.0f, f12, 0.0f, f13, 5);
            j0 j0VarA = h0.a(AbstractC2021j.g(f12), C1818c.k, c1040t3, 54);
            int iHashCode = Long.hashCode(c1040t3.f13503T);
            InterfaceC1039s0 interfaceC1039s0L = c1040t3.l();
            InterfaceC1833r interfaceC1833rD = AbstractC1816a.d(c1040t3, interfaceC1833rR);
            InterfaceC0475k.f6514R0.getClass();
            C0473i c0473i = C0474j.f6480b;
            if (c1040t3.f13505a == null) {
                C1007c.v();
                throw null;
            }
            c1040t3.l0();
            if (c1040t3.f13502S) {
                c1040t3.k(c0473i);
            } else {
                c1040t3.v0();
            }
            C1007c.G(c1040t3, j0VarA, C0474j.f6484f);
            C1007c.G(c1040t3, interfaceC1039s0L, C0474j.f6483e);
            C0471h c0471h = C0474j.f6485g;
            if (c1040t3.f13502S || !Intrinsics.b(c1040t3.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, c1040t3, iHashCode, c0471h);
            }
            C1007c.G(c1040t3, interfaceC1833rD, C0474j.f6482d);
            if (e10.e()) {
                w wVar = X.a;
                Intrinsics.checkNotNullParameter(f10, "<this>");
                l8 = (L) X.m0.getValue();
            } else if (e10.f()) {
                w wVar2 = X.a;
                Intrinsics.checkNotNullParameter(f10, "<this>");
                l8 = (L) X.o0.getValue();
            } else {
                w wVar3 = X.a;
                Intrinsics.checkNotNullParameter(f10, "<this>");
                l8 = (L) X.n0.getValue();
            }
            String strE = N5.e(l8, c1040t3, 0);
            i1 i1Var = Ui.q.c;
            U u8 = ((Ui.e) c1040t3.j(i1Var)).e;
            i1 i1Var2 = Ui.q.a;
            z3 z3Var2 = z3Var;
            B.H(strE, (InterfaceC1833r) null, ((Ui.g) c1040t3.j(i1Var2)).C(), 0L, (e2.w) null, (e2.j) null, 0L, (C1541k) null, 0L, 0, false, 0, 0, u8, c1040t3, 0, 0, 131066);
            C1040t c1040t4 = c1040t3;
            AbstractC0646f3.o((float) 0.5d, 54, ((Ui.g) c1040t4.j(i1Var2)).O(), c1040t4, androidx.compose.foundation.layout.d.f(c1830o, f13));
            if (z3Var2.c.length() > 0) {
                c1040t4.h0(744953493);
                x8.k.a(z3Var2.c, null, s6.b(androidx.compose.foundation.layout.d.n(c1830o, f11), C0.f.f439a), null, null, null, c1040t4, 48, 2040);
                c1040t2 = c1040t4;
                z10 = false;
            } else {
                z10 = false;
                c1040t4.h0(733202757);
                c1040t2 = c1040t4;
            }
            c1040t2.q(z10);
            C1040t c1040t5 = c1040t2;
            B.H(z3Var2.b, (InterfaceC1833r) null, ((Ui.g) c1040t2.j(i1Var2)).F(), 0L, (e2.w) null, (e2.j) null, 0L, (C1541k) null, 0L, 2, false, 1, 0, ((Ui.e) c1040t2.j(i1Var)).d, c1040t5, 0, 24960, 110586);
            C1040t c1040t6 = c1040t5;
            c1040t6.q(true);
            r22 = z10;
            c1040t = c1040t6;
        } else {
            r22 = 0;
            c1040t3.b0();
            c1040t = c1040t3;
        }
        C1053z0 c1053z0V = c1040t.v();
        if (c1053z0V != null) {
            c1053z0V.f13556d = new Af.f(nVar, e10, i4, (int) r22);
        }
    }

    public static final void c(P3 p32, InterfaceC1031o interfaceC1031o, int i4) {
        C1040t c1040t = (C1040t) interfaceC1031o;
        c1040t.j0(2024661995);
        int i9 = (c1040t.f(p32) ? 4 : 2) | i4;
        if (c1040t.Y(i9 & 1, (i9 & 3) != 2)) {
            k2 k2Var = (k2) p32.z0.a.getValue();
            boolean zF = c1040t.f(k2Var.a);
            Object objT = c1040t.T();
            c1.X x7 = C1029n.f13450a;
            if (zF || objT == x7) {
                objT = C1007c.r(new Af.l(0, p32, k2Var));
                c1040t.s0(objT);
            }
            h1 h1Var = (h1) objT;
            boolean zF2 = c1040t.f((k0) h1Var.getValue()) | c1040t.f(k2Var.b);
            Object objT2 = c1040t.T();
            if (zF2 || objT2 == x7) {
                objT2 = C1007c.r(new Af.l(1, h1Var, k2Var));
                c1040t.s0(objT2);
            }
            h1 h1Var2 = (h1) objT2;
            boolean zF3 = c1040t.f(((Dc.n) h1Var2.getValue()).p().b);
            Object objT3 = c1040t.T();
            if (zF3 || objT3 == x7) {
                objT3 = C1007c.r(new Af.m(h1Var2, 0));
                c1040t.s0(objT3);
            }
            h1 h1Var3 = (h1) objT3;
            Q Q = P.Q((k0) h1Var.getValue(), 0, I.a, c1040t, 432, 4);
            boolean zF4 = c1040t.f((Dc.n) h1Var2.getValue()) | c1040t.f(Q);
            Object objT4 = c1040t.T();
            if (zF4 || objT4 == x7) {
                objT4 = C1007c.r(new Af.b(h1Var2, h1Var, 0));
                c1040t.s0(objT4);
            }
            h1 h1Var4 = (h1) objT4;
            boolean zF5 = c1040t.f((k0) h1Var.getValue()) | c1040t.f((Dc.n) h1Var2.getValue());
            Object objT5 = c1040t.T();
            if (zF5 || objT5 == x7) {
                objT5 = C1731a.s(E.a, ((k0) h1Var.getValue()).x(), (Dc.n) h1Var2.getValue());
                c1040t.s0(objT5);
            }
            E e10 = (E) objT5;
            boolean zG = c1040t.g(((Boolean) h1Var4.getValue()).booleanValue()) | c1040t.f(Q) | c1040t.f((Dc.n) h1Var2.getValue());
            Object objT6 = c1040t.T();
            if (zG || objT6 == x7) {
                r rVar = new r(((Boolean) h1Var4.getValue()).booleanValue(), Q.a, ((Dc.n) h1Var2.getValue()).p(), Q.f, 8);
                c1040t.s0(rVar);
                objT6 = rVar;
            }
            r rVar2 = (r) objT6;
            C2029s c2029sA = t0.r.a(AbstractC2021j.f24789c, C1818c.f23091m, c1040t, 0);
            int iHashCode = Long.hashCode(c1040t.f13503T);
            InterfaceC1039s0 interfaceC1039s0L = c1040t.l();
            InterfaceC1833r interfaceC1833rD = AbstractC1816a.d(c1040t, C1830o.f23106a);
            InterfaceC0475k.f6514R0.getClass();
            C0473i c0473i = C0474j.f6480b;
            if (c1040t.f13505a == null) {
                C1007c.v();
                throw null;
            }
            c1040t.l0();
            if (c1040t.f13502S) {
                c1040t.k(c0473i);
            } else {
                c1040t.v0();
            }
            C1007c.G(c1040t, c2029sA, C0474j.f6484f);
            C1007c.G(c1040t, interfaceC1039s0L, C0474j.f6483e);
            C0471h c0471h = C0474j.f6485g;
            if (c1040t.f13502S || !Intrinsics.b(c1040t.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, c1040t, iHashCode, c0471h);
            }
            C1007c.G(c1040t, interfaceC1833rD, C0474j.f6482d);
            f((Dc.n) h1Var2.getValue(), (Zd.B) h1Var3.getValue(), e10, c1040t, 0);
            C1007c.b(new C1051y0[]{aj.I.l.a(Q), gf.h.a.a(rVar2)}, k1.h.d(-855869663, new Af.c(e10, p32, k2Var, h1Var2, h1Var3, 0), c1040t), c1040t, 56);
            c1040t.q(true);
        } else {
            c1040t.b0();
        }
        C1053z0 c1053z0V = c1040t.v();
        if (c1053z0V != null) {
            c1053z0V.f13556d = new Af.d(p32, i4, 0);
        }
    }

    public static final void d(int i4, P3 p32, InterfaceC1031o interfaceC1031o, InterfaceC1833r interfaceC1833r) {
        Intrinsics.checkNotNullParameter(l0.f24799a, "<this>");
        Intrinsics.checkNotNullParameter(interfaceC1833r, "modifier");
        Intrinsics.checkNotNullParameter(p32, "model");
        C1040t c1040t = (C1040t) interfaceC1031o;
        c1040t.j0(880418175);
        int i9 = (c1040t.f(interfaceC1833r) ? 32 : 16) | i4 | (c1040t.f(p32) ? 256 : com.alipay.sdk.m.p.a.f17908a);
        if (c1040t.Y(i9 & 1, (i9 & 147) != 146)) {
            boolean z10 = ((k2) p32.z0.a.getValue()).a.length() > 0;
            Object objT = c1040t.T();
            c1.X x7 = C1029n.f13450a;
            if (objT == x7) {
                objT = C1007c.z(Boolean.valueOf(z10));
                c1040t.s0(objT);
            }
            InterfaceC1014f0 interfaceC1014f0 = (InterfaceC1014f0) objT;
            Boolean boolValueOf = Boolean.valueOf(z10);
            boolean zG = c1040t.g(z10);
            Object objT2 = c1040t.T();
            if (zG || objT2 == x7) {
                objT2 = new Af.n(z10, interfaceC1014f0, (Vk.a) null);
                c1040t.s0(objT2);
            }
            C1007c.f(c1040t, boolValueOf, (Function2) objT2);
            float f10 = 16;
            d3.d(((Boolean) interfaceC1014f0.getValue()).booleanValue(), androidx.compose.foundation.a.b(s6.b(androidx.compose.foundation.layout.a.p(interfaceC1833r, 0.0f, 4, 1), C0.f.b(f10)), ((Ui.g) c1040t.j(Ui.q.a)).i(), C0.f.b(f10)).then(androidx.compose.foundation.layout.d.f12039c), androidx.compose.animation.c.f(null, 3), androidx.compose.animation.c.h(AbstractC1413e.r(100, 0, null, 6), 2), (String) null, k1.h.d(2079210407, new Af.h(p32, z10, interfaceC1014f0, 0), c1040t), c1040t, 1600518, 16);
        } else {
            c1040t.b0();
        }
        C1053z0 c1053z0V = c1040t.v();
        if (c1053z0V != null) {
            c1053z0V.f13556d = new Af.i(interfaceC1833r, p32, i4, 0);
        }
    }

    public static final void e(P3 p32, InterfaceC1031o interfaceC1031o, int i4) {
        Intrinsics.checkNotNullParameter(p32, "model");
        C1040t c1040t = (C1040t) interfaceC1031o;
        c1040t.j0(-599221473);
        int i9 = (c1040t.f(p32) ? 4 : 2) | i4;
        if (c1040t.Y(i9 & 1, (i9 & 3) != 2)) {
            D dL = fj.a.l(((k2) p32.z0.a.getValue()).a.length() > 0, 0.0f, (v) null, c1040t, 0, 126);
            boolean z10 = (i9 & 14) == 4;
            Object objT = c1040t.T();
            if (z10 || objT == C1029n.f13450a) {
                objT = new Af.a(p32, 0);
                c1040t.s0(objT);
            }
            fj.a.c((InterfaceC1833r) null, dL, 0L, 0L, (c0) null, (C0.e) null, (Function0) objT, k1.h.d(548743923, new Af.g(p32, 0), c1040t), c1040t, 12582912, 61);
        } else {
            c1040t.b0();
        }
        C1053z0 c1053z0V = c1040t.v();
        if (c1053z0V != null) {
            c1053z0V.f13556d = new Af.d(p32, i4, 1);
        }
    }

    public static final void f(Dc.n nVar, Zd.B b10, E e10, InterfaceC1031o interfaceC1031o, int i4) {
        C1053z0 c1053z0V;
        Af.e eVar;
        boolean z10;
        C1040t c1040t = (C1040t) interfaceC1031o;
        c1040t.j0(-810808707);
        int i9 = i4 | (c1040t.f(nVar) ? 4 : 2) | (c1040t.d(b10.ordinal()) ? 32 : 16) | (c1040t.d(e10.ordinal()) ? 256 : com.alipay.sdk.m.p.a.f17908a);
        if (!c1040t.Y(i9 & 1, (i9 & 147) != 146)) {
            c1040t.b0();
        } else {
            if (nVar.p().q != null) {
                c1040t.h0(94031951);
                b(nVar, e10, c1040t, ((i9 >> 3) & 112) | (i9 & 14));
                c1040t.q(false);
                c1053z0V = c1040t.v();
                if (c1053z0V != null) {
                    eVar = new Af.e(nVar, b10, e10, i4, 0);
                    c1053z0V.f13556d = eVar;
                }
                return;
            }
            c1040t.h0(85171717);
            c1040t.q(false);
            Object objT = c1040t.T();
            c1.X x7 = C1029n.f13450a;
            if (objT == x7) {
                objT = C1007c.z(new C1());
                c1040t.s0(objT);
            }
            InterfaceC1014f0 interfaceC1014f0 = (InterfaceC1014f0) objT;
            String str = nVar.p().c;
            boolean z11 = (i9 & 14) == 4;
            Object objT2 = c1040t.T();
            if (z11 || objT2 == x7) {
                objT2 = new Af.r(nVar, interfaceC1014f0, (Vk.a) null);
                c1040t.s0(objT2);
            }
            C1007c.f(c1040t, str, (Function2) objT2);
            int i10 = i9 & 112;
            int i11 = i9 & 896;
            boolean zF = c1040t.f(nVar.p()) | c1040t.f((C1) interfaceC1014f0.getValue()) | (i10 == 32) | (i11 == 256);
            Object objT3 = c1040t.T();
            if (zF || objT3 == x7) {
                objT3 = Je.a.B(nVar.p(), (C1) interfaceC1014f0.getValue(), b10, e10);
                c1040t.s0(objT3);
            }
            String str2 = (String) objT3;
            InterfaceC1014f0 interfaceC1014f0N = C1007c.n(ch.i.f, c1040t);
            boolean zF2 = (i11 == 256) | (i10 == 32) | c1040t.f(nVar.p()) | c1040t.f((C1) interfaceC1014f0.getValue()) | c1040t.f((Yc.i) interfaceC1014f0N.getValue());
            Object objT4 = c1040t.T();
            if (zF2 || objT4 == x7) {
                objT4 = Je.a.C(nVar.p(), (C1) interfaceC1014f0.getValue(), b10, e10);
                c1040t.s0(objT4);
            }
            String str3 = (String) objT4;
            C1830o c1830o = C1830o.f23106a;
            float f10 = 8;
            float f11 = 12;
            InterfaceC1833r interfaceC1833rR = androidx.compose.foundation.layout.a.r(androidx.compose.foundation.layout.a.p(c1830o, 16, 0.0f, 2), 0.0f, f10, 0.0f, f11, 5);
            j0 j0VarA = h0.a(AbstractC2021j.g(f10), C1818c.k, c1040t, 54);
            int iHashCode = Long.hashCode(c1040t.f13503T);
            InterfaceC1039s0 interfaceC1039s0L = c1040t.l();
            InterfaceC1833r interfaceC1833rD = AbstractC1816a.d(c1040t, interfaceC1833rR);
            InterfaceC0475k.f6514R0.getClass();
            C0473i c0473i = C0474j.f6480b;
            if (c1040t.f13505a == null) {
                C1007c.v();
                throw null;
            }
            c1040t.l0();
            if (c1040t.f13502S) {
                c1040t.k(c0473i);
            } else {
                c1040t.v0();
            }
            C1007c.G(c1040t, j0VarA, C0474j.f6484f);
            C1007c.G(c1040t, interfaceC1039s0L, C0474j.f6483e);
            C0471h c0471h = C0474j.f6485g;
            if (c1040t.f13502S || !Intrinsics.b(c1040t.T(), Integer.valueOf(iHashCode))) {
                A8.b.r(iHashCode, c1040t, iHashCode, c0471h);
            }
            C1007c.G(c1040t, interfaceC1833rD, C0474j.f6482d);
            i1 i1Var = Ui.q.c;
            U u8 = ((Ui.e) c1040t.j(i1Var)).e;
            i1 i1Var2 = Ui.q.a;
            B.H(str2, (InterfaceC1833r) null, ((Ui.g) c1040t.j(i1Var2)).C(), 0L, (e2.w) null, (e2.j) null, 0L, (C1541k) null, 0L, 0, false, 0, 0, u8, c1040t, 0, 0, 131066);
            c1040t = c1040t;
            if (str3.length() > 0) {
                c1040t.h0(-1136914667);
                AbstractC0646f3.o((float) 0.5d, 54, ((Ui.g) c1040t.j(i1Var2)).O(), c1040t, androidx.compose.foundation.layout.d.f(c1830o, f11));
                B.H(str3, (InterfaceC1833r) null, ((Ui.g) c1040t.j(i1Var2)).F(), 0L, (e2.w) null, (e2.j) null, 0L, (C1541k) null, 0L, 2, false, 1, 0, ((Ui.e) c1040t.j(i1Var)).d, c1040t, 0, 24960, 110586);
                c1040t = c1040t;
                z10 = false;
            } else {
                z10 = false;
                c1040t.h0(-1147187447);
            }
            c1040t.q(z10);
            c1040t.q(true);
        }
        c1053z0V = c1040t.v();
        if (c1053z0V != null) {
            eVar = new Af.e(nVar, b10, e10, i4, 1);
            c1053z0V.f13556d = eVar;
        }
    }

    public static Handler g() {
        if (f4187a != null) {
            return f4187a;
        }
        synchronized (n.class) {
            try {
                if (f4187a == null) {
                    f4187a = Zb.a.c(Looper.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f4187a;
    }

    public static Sj.a h(Sj.l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        return new Sj.a(3);
    }

    public static final n2.k i(C2139c c2139c) {
        return new n2.k(Math.round(c2139c.f26259a), Math.round(c2139c.f26260b), Math.round(c2139c.f26261c), Math.round(c2139c.f26262d));
    }
}
