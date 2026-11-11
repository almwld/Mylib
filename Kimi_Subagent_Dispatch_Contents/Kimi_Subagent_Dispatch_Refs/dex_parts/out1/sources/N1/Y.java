package N1;

import kotlin.jvm.internal.Intrinsics;
import v1.C2138b;
import v1.C2139c;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P1.T f5602a;

    public Y(P1.T t8) {
        this.f5602a = t8;
    }

    @Override // N1.G
    public final long E(long j2) {
        return C2138b.j(this.f5602a.f6340o.E(j2), a());
    }

    @Override // N1.G
    public final G M() {
        P1.T tE1;
        if (!i()) {
            M1.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        P1.j0 j0Var = ((P1.j0) this.f5602a.f6340o.f6502o.f6255F.f6446e).f6506s;
        if (j0Var == null || (tE1 = j0Var.e1()) == null) {
            return null;
        }
        return tE1.f6343r;
    }

    @Override // N1.G
    public final C2139c P(G g10, boolean z10) {
        return this.f5602a.f6340o.P(g10, z10);
    }

    @Override // N1.G
    public final long Q(G g10, long j2) {
        return o(g10, j2, true);
    }

    @Override // N1.G
    public final long W(long j2) {
        return C2138b.j(this.f5602a.f6340o.W(j2), a());
    }

    @Override // N1.G
    public final long Y(long j2) {
        return this.f5602a.f6340o.Y(C2138b.j(j2, a()));
    }

    public final long a() {
        P1.T t8 = this.f5602a;
        P1.T tJ = D0.j(t8);
        return C2138b.i(o(tJ.f6343r, 0L, true), t8.f6340o.o(tJ.f6340o, 0L, true));
    }

    @Override // N1.G
    public final void a0(G g10, float[] fArr) {
        this.f5602a.f6340o.a0(g10, fArr);
    }

    @Override // N1.G
    public final long e(long j2) {
        return this.f5602a.f6340o.e(C2138b.j(j2, a()));
    }

    @Override // N1.G
    public final boolean i() {
        return this.f5602a.f6340o.g1().f23119n;
    }

    @Override // N1.G
    public final void j(float[] fArr) {
        this.f5602a.f6340o.j(fArr);
    }

    @Override // N1.G
    public final long k() {
        P1.T t8 = this.f5602a;
        return (((long) t8.f5679a) << 32) | (((long) t8.f5680b) & 4294967295L);
    }

    @Override // N1.G
    public final long o(G g10, long j2, boolean z10) {
        boolean z11 = g10 instanceof Y;
        P1.T t8 = this.f5602a;
        if (!z11) {
            P1.T tJ = D0.j(t8);
            P1.j0 j0Var = tJ.f6340o;
            long jO = o(tJ.f6343r, j2, z10);
            long j8 = tJ.f6341p;
            long jI = C2138b.i(jO, (4294967295L & ((long) Float.floatToRawIntBits((int) (j8 & 4294967295L)))) | (Float.floatToRawIntBits((int) (j8 >> 32)) << 32));
            if (!j0Var.g1().f23119n) {
                M1.a.c("LayoutCoordinate operations are only valid when isAttached is true");
            }
            j0Var.p1();
            P1.j0 j0Var2 = j0Var.f6506s;
            if (j0Var2 != null) {
                j0Var = j0Var2;
            }
            return C2138b.j(jI, j0Var.o(g10, 0L, z10));
        }
        P1.T t10 = ((Y) g10).f5602a;
        P1.j0 j0Var3 = t10.f6340o;
        j0Var3.p1();
        P1.T tE1 = t8.f6340o.c1(j0Var3).e1();
        if (tE1 != null) {
            boolean z12 = !z10;
            long jC = n2.j.c(n2.j.d(t10.Z0(tE1, z12), I8.g.c(j2)), t8.Z0(tE1, z12));
            return (((long) Float.floatToRawIntBits((int) (jC >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (jC & 4294967295L))) & 4294967295L);
        }
        P1.T tJ2 = D0.j(t10);
        boolean z13 = !z10;
        long jD = n2.j.d(n2.j.d(t10.Z0(tJ2, z13), tJ2.f6341p), I8.g.c(j2));
        P1.T tJ3 = D0.j(t8);
        long jC2 = n2.j.c(jD, n2.j.d(t8.Z0(tJ3, z13), tJ3.f6341p));
        long jFloatToRawIntBits = Float.floatToRawIntBits((int) (jC2 >> 32));
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits((int) (jC2 & 4294967295L))) & 4294967295L;
        P1.j0 j0Var4 = tJ3.f6340o.f6506s;
        Intrinsics.d(j0Var4);
        P1.j0 j0Var5 = tJ2.f6340o.f6506s;
        Intrinsics.d(j0Var5);
        return j0Var4.o(j0Var5, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32), z10);
    }

    @Override // N1.G
    public final long x(long j2) {
        return this.f5602a.f6340o.x(C2138b.j(0L, a()));
    }
}
