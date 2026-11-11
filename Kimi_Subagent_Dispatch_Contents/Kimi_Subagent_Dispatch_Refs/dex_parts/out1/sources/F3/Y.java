package F3;

import D.C0121w;
import android.net.Uri;
import android.os.Looper;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y extends AbstractC0193a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u3.g f2266h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0121w f2267i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final A3.i f2268j;
    public final Y6.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f2269l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p3.r f2270m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f2271n = true;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f2272o = -9223372036854775807L;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2273p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f2274q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f2275r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public u3.z f2276s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p3.E f2277t;

    public Y(p3.E e10, u3.g gVar, C0121w c0121w, A3.i iVar, Y6.h hVar, int i4, p3.r rVar) {
        this.f2277t = e10;
        this.f2266h = gVar;
        this.f2267i = c0121w;
        this.f2268j = iVar;
        this.k = hVar;
        this.f2269l = i4;
        this.f2270m = rVar;
    }

    @Override // F3.AbstractC0193a
    public final InterfaceC0217z a(B b10, re.m mVar, long j2) {
        u3.h hVarN = this.f2266h.n();
        u3.z zVar = this.f2276s;
        if (zVar != null) {
            hVarN.B(zVar);
        }
        p3.B b11 = g().f23141b;
        b11.getClass();
        Uri uri = b11.f23133a;
        this.f2291g.getClass();
        return new V(uri, hVarN, new fk.c((M3.q) this.f2267i.f1020b), this.f2268j, new A3.e(this.f2288d.f44c, 0, b10), this.k, new A3.e(this.f2287c.f44c, 0, b10), this, mVar, this.f2269l, this.f2270m, s3.I.H(b11.f23137e), null);
    }

    @Override // F3.AbstractC0193a
    public final synchronized p3.E g() {
        return this.f2277t;
    }

    @Override // F3.AbstractC0193a
    public final void i() {
    }

    @Override // F3.AbstractC0193a
    public final void k(u3.z zVar) {
        this.f2276s = zVar;
        Looper.myLooper().getClass();
        this.f2291g.getClass();
        A3.i iVar = this.f2268j;
        iVar.getClass();
        iVar.getClass();
        s();
    }

    @Override // F3.AbstractC0193a
    public final void m(InterfaceC0217z interfaceC0217z) {
        V v4 = (V) interfaceC0217z;
        if (v4.f2258x) {
            for (b0 b0Var : v4.f2255u) {
                b0Var.i();
                H7.a aVar = b0Var.f2308h;
                if (aVar != null) {
                    aVar.z(b0Var.f2305e);
                    b0Var.f2308h = null;
                    b0Var.f2307g = null;
                }
            }
        }
        I3.l lVar = v4.f2246l;
        J3.a aVar2 = lVar.f3266a;
        I3.i iVar = lVar.f3267b;
        if (iVar != null) {
            iVar.a(true);
        }
        aVar2.execute(new Ab.c0(14, v4));
        aVar2.f4106b.accept(aVar2.f4105a);
        v4.f2251q.removeCallbacksAndMessages(null);
        v4.f2252r = null;
        v4.Q = true;
    }

    @Override // F3.AbstractC0193a
    public final void o() {
        this.f2268j.getClass();
    }

    @Override // F3.AbstractC0193a
    public final synchronized void r(p3.E e10) {
        this.f2277t = e10;
    }

    public final void s() {
        p3.Z f0Var = new f0(this.f2272o, this.f2273p, this.f2274q, g());
        if (this.f2271n) {
            f0Var = new W(f0Var);
        }
        l(f0Var);
    }

    public final void t(long j2, M3.z zVar, boolean z10) {
        if (this.f2275r && zVar.d()) {
            return;
        }
        this.f2275r = !zVar.d();
        if (j2 == -9223372036854775807L) {
            j2 = this.f2272o;
        }
        boolean zB = zVar.b();
        if (!this.f2271n && this.f2272o == j2 && this.f2273p == zB && this.f2274q == z10) {
            return;
        }
        this.f2272o = j2;
        this.f2273p = zB;
        this.f2274q = z10;
        this.f2271n = false;
        s();
    }
}
