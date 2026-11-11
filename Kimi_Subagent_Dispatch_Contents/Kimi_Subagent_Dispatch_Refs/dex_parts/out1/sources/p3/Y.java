package p3;

import android.net.Uri;
import g6.AbstractC1252a;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object f23238p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final E f23239q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23241b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f23243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f23244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C1838A f23248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f23249j;
    public long k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f23250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f23251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f23252n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f23253o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f23240a = f23238p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public E f23242c = f23239q;

    static {
        W5.f fVar = new W5.f();
        Ob.H h9 = Ob.S.b;
        Ob.p0 p0Var = Ob.p0.e;
        List list = Collections.EMPTY_LIST;
        Ob.p0 p0Var2 = Ob.p0.e;
        C1863z c1863z = new C1863z();
        C c5 = C.f23138a;
        Uri uri = Uri.EMPTY;
        f23239q = new E("androidx.media3.common.Timeline", new C1862y(fVar), uri != null ? new B(uri, null, null, list, p0Var2, -9223372036854775807L) : null, new C1838A(c1863z), H.f23173B, c5);
        AbstractC1252a.r(1, 2, 3, 4, 5);
        AbstractC1252a.r(6, 7, 8, 9, 10);
        s3.I.z(11);
        s3.I.z(12);
        s3.I.z(13);
    }

    public final boolean a() {
        return this.f23248i != null;
    }

    public final void b(E e10, boolean z10, boolean z11, C1838A c1838a, long j2, long j8) {
        this.f23240a = f23238p;
        this.f23242c = e10 != null ? e10 : f23239q;
        if (e10 != null) {
            B b10 = e10.f23141b;
        }
        this.f23241b = null;
        this.f23243d = -9223372036854775807L;
        this.f23244e = -9223372036854775807L;
        this.f23245f = -9223372036854775807L;
        this.f23246g = z10;
        this.f23247h = z11;
        this.f23248i = c1838a;
        this.k = j2;
        this.f23250l = j8;
        this.f23251m = 0;
        this.f23252n = 0;
        this.f23253o = 0L;
        this.f23249j = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Y.class.equals(obj.getClass())) {
            return false;
        }
        Y y9 = (Y) obj;
        return Objects.equals(this.f23240a, y9.f23240a) && Objects.equals(this.f23242c, y9.f23242c) && Objects.equals(this.f23248i, y9.f23248i) && this.f23243d == y9.f23243d && this.f23244e == y9.f23244e && this.f23245f == y9.f23245f && this.f23246g == y9.f23246g && this.f23247h == y9.f23247h && this.f23249j == y9.f23249j && this.k == y9.k && this.f23250l == y9.f23250l && this.f23251m == y9.f23251m && this.f23252n == y9.f23252n && this.f23253o == y9.f23253o;
    }

    public final int hashCode() {
        int iHashCode = (this.f23242c.hashCode() + ((this.f23240a.hashCode() + 217) * 31)) * 961;
        C1838A c1838a = this.f23248i;
        int iHashCode2 = c1838a == null ? 0 : c1838a.hashCode();
        long j2 = this.f23243d;
        int i4 = (((iHashCode + iHashCode2) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j8 = this.f23244e;
        int i9 = (i4 + ((int) (j8 ^ (j8 >>> 32)))) * 31;
        long j10 = this.f23245f;
        int i10 = (((((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f23246g ? 1 : 0)) * 31) + (this.f23247h ? 1 : 0)) * 31) + (this.f23249j ? 1 : 0)) * 31;
        long j11 = this.k;
        int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
        long j12 = this.f23250l;
        int i12 = (((((i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31) + this.f23251m) * 31) + this.f23252n) * 31;
        long j13 = this.f23253o;
        return i12 + ((int) (j13 ^ (j13 >>> 32)));
    }
}
