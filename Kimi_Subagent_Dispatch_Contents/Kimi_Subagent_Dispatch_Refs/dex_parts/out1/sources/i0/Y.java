package i0;

import c1.C1030n0;
import c1.h1;
import j0.AbstractC1413e;
import j0.C1428l0;
import j0.P0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ub.E7;
import v1.C2138b;
import v1.C2139c;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y extends kotlin.jvm.internal.r implements Function1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z f20019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ N1.t0 f20020f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(N1.t0 t0Var, Z z10) {
        super(1);
        this.f20018d = 2;
        this.f20020f = t0Var;
        this.f20019e = z10;
    }

    public final Object invoke(Object obj) {
        long j2;
        C2138b c2138b;
        long jG;
        long j8;
        C1428l0 c1428l0Q;
        N1.G gD;
        C0 c02;
        switch (this.f20018d) {
            case 0:
                N1.s0 s0Var = (N1.s0) obj;
                Z z10 = this.f20019e;
                boolean zA = z10.f20022p.a().a();
                N1.t0 t0Var = this.f20020f;
                if (!zA) {
                    C2139c c2139cA = z10.f20022p.c().a();
                    if (c2139cA != null) {
                        N1.G gD2 = s0Var.d();
                        long jC = gD2 != null ? I8.g.c(C2138b.i(c2139cA.g(), z10.e1().Q(gD2, 0L))) : 0L;
                        s0Var.h(t0Var, (int) (jC >> 32), (int) (jC & 4294967295L), 0.0f);
                    } else {
                        s0Var.h(t0Var, 0, 0, 0.0f);
                    }
                } else if (z10.f20022p.a().a() || !z10.f20022p.c().b()) {
                    s0Var.h(t0Var, 0, 0, 0.0f);
                }
                return Unit.a;
            case 1:
                N1.s0 s0Var2 = (N1.s0) obj;
                N1.G gD3 = s0Var2.d();
                N1.t0 t0Var2 = this.f20020f;
                if (gD3 == null) {
                    s0Var2.h(t0Var2, 0, 0, 0.0f);
                } else {
                    Z z11 = this.f20019e;
                    long jQ = z11.e1().Q(gD3, 0L);
                    if (z11.f20022p.c().c() != null) {
                        C2139c c2139cA2 = z11.f20022p.c().a();
                        if (c2139cA2 == null) {
                            j2 = 4294967295L;
                            c2139cA2 = E7.c(jQ, (((long) Float.floatToRawIntBits(t0Var2.f5680b)) & 4294967295L) | (((long) Float.floatToRawIntBits(t0Var2.f5679a)) << 32));
                        } else {
                            j2 = 4294967295L;
                        }
                        C1344x c1344xA = z11.f20022p.a();
                        C0 c0C = z11.f20022p.c().c();
                        Intrinsics.d(c0C);
                        C2139c c2139cC = E7.c(C2138b.j(((C2138b) c0C.f19942b.getValue()).f26257a, ((C2138b) c0C.f19943c.getValue()).f26257a), ((v1.e) c0C.f19941a.getValue()).f26271a);
                        h0 h0Var = c1344xA.f20198a;
                        C1030n0 c1030n0 = c1344xA.f20203f;
                        if (((o0) h0Var).a()) {
                            if (((h1) c1030n0.getValue()) == null) {
                                switch (((aj.j0) c1344xA.f20201d.getValue()).a) {
                                    case 0:
                                        Intrinsics.checkNotNullParameter(c2139cA2, "<unused var>");
                                        Intrinsics.checkNotNullParameter(c2139cC, "<unused var>");
                                        c1428l0Q = AbstractC1413e.q(0.0f, 1000.0f, P0.f20598a, 1);
                                        break;
                                    default:
                                        c1428l0Q = r0.f20160a;
                                        break;
                                }
                                c1344xA.f20202e = c1428l0Q;
                            }
                            c1030n0.setValue(((j0.v0) c1344xA.f20200c.getValue()).a(new B1.b(27, c1344xA), new P1.L(c1344xA, c2139cC, c2139cA2, 2)));
                        }
                    } else {
                        j2 = 4294967295L;
                    }
                    C2139c c2139cB = z11.f20022p.a().b();
                    if (c2139cB != null) {
                        C0 c0C2 = z11.f20022p.c().c();
                        Intrinsics.d(c0C2);
                        c2138b = new C2138b(C2138b.j(C2138b.i(c2139cB.g(), ((C2138b) c0C2.f19942b.getValue()).f26257a), ((C2138b) c0C2.f19944d.getValue()).f26257a));
                    } else {
                        c2138b = null;
                    }
                    if (z11.f20022p.a().a()) {
                        j8 = c2138b != null ? c2138b.f26257a : jQ;
                        z11.f20022p.c().f20033e.setValue(c2138b == null ? E7.c(jQ, L.f.e(gD3.k())) : E7.c(c2138b.f26257a, c2139cB.f()));
                    } else {
                        if (c2138b != null) {
                            jG = c2138b.f26257a;
                        } else {
                            C2139c c2139cA3 = z11.f20022p.c().a();
                            Intrinsics.d(c2139cA3);
                            jG = c2139cA3.g();
                        }
                        j8 = jG;
                    }
                    long jI = C2138b.i(j8, jQ);
                    s0Var2.h(t0Var2, Math.round(Float.intBitsToFloat((int) (jI >> 32))), Math.round(Float.intBitsToFloat((int) (jI & j2))), 0.0f);
                }
                return Unit.a;
            default:
                N1.s0 s0Var3 = (N1.s0) obj;
                s0Var3.h(this.f20020f, 0, 0, 0.0f);
                Z z12 = this.f20019e;
                C1320b0 c1320b0C = z12.f20022p.c();
                C1322c0 c1322c0 = z12.f20022p;
                c1320b0C.i();
                if (c1320b0C.b() && c1322c0.a().a() && (gD = s0Var3.d()) != null) {
                    long jE = L.f.e(gD.k());
                    o0 o0Var = c1322c0.c().f20030b;
                    N1.G g10 = c1322c0.c().f20030b.f20142h;
                    if (g10 == null) {
                        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                    }
                    long jC2 = o0Var.f20135a.c(g10, gD);
                    o0 o0Var2 = c1322c0.c().f20030b;
                    N1.G g11 = c1322c0.c().f20030b.f20142h;
                    if (g11 == null) {
                        throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                    }
                    long jO = g11.o(gD, 0L, (6 & 4) != 0);
                    C0 c0C3 = c1320b0C.c();
                    if (c0C3 == null) {
                        c0C3 = new C0(jE, C2138b.i(jC2, jO), jO);
                    }
                    C1030n0 c1030n02 = c0C3.f19942b;
                    C1030n0 c1030n03 = c0C3.f19944d;
                    C1030n0 c1030n04 = c0C3.f19941a;
                    C1030n0 c1030n05 = c0C3.f19943c;
                    if (C2138b.d(((C2138b) c1030n05.getValue()).f26257a, jO) && v1.e.a(((v1.e) c1030n04.getValue()).f26271a, jE) && !c1320b0C.f20038j) {
                        c02 = c0C3;
                    } else {
                        c1030n04.setValue(new v1.e(jE));
                        c1030n05.setValue(new C2138b(jO));
                        if (c1320b0C.f20038j) {
                            c02 = c0C3;
                            c1030n02.setValue(new C2138b(C2138b.i(C2138b.i(jC2, jO), C2138b.i(((C2138b) c1030n03.getValue()).f26257a, ((C2138b) c1030n02.getValue()).f26257a))));
                        } else {
                            c02 = c0C3;
                        }
                        if (c1320b0C.a() == null) {
                            C2139c c2139cG = c1320b0C.g();
                            if (c2139cG == null) {
                                c2139cG = E7.c(jC2, jE);
                            }
                            c1320b0C.f20033e.setValue(c2139cG);
                        }
                    }
                    c1030n03.setValue(new C2138b(C2138b.i(jC2, jO)));
                    if (c1320b0C.b()) {
                        c1320b0C.f20032d.setValue(c02);
                    }
                    c1320b0C.f20038j = false;
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(Z z10, N1.t0 t0Var, int i4) {
        super(1);
        this.f20018d = i4;
        this.f20019e = z10;
        this.f20020f = t0Var;
    }
}
