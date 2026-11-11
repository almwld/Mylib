package Cf;

import Ee.C0740d;
import Hf.C1078c1;
import Hf.C1093e4;
import Hf.C1123j4;
import Hf.C1141m4;
import Hf.C1144n1;
import Hf.C1171s;
import Hf.C1178t0;
import Hf.C1200w4;
import Hf.C1201x;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ue.AbstractC4797h;
import ue.C4801l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class S3 extends Hd.r implements Df.a {
    public static final /* synthetic */ int q = 0;
    public final P3 i;
    public final S7 j;
    public final C0439y6 k;
    public final C1178t0 l;
    public final C1093e4 m;
    public final Hf.C4 n;
    public final C1141m4 o;
    public final List p;

    public S3(P3 p3, S7 s7) {
        Intrinsics.checkNotNullParameter(p3, "model");
        Intrinsics.checkNotNullParameter(s7, "mainModel");
        this.i = p3;
        this.j = s7;
        C0439y6 c0439y6 = new C0439y6(this);
        this.k = c0439y6;
        C1178t0 c1178t0 = new C1178t0(p3.w0, p3, p3, this, new Q3(this, 0));
        this.l = c1178t0;
        Hf.v5 v5Var = new Hf.v5(this);
        Hf.E e = new Hf.E(this);
        Intrinsics.checkNotNullParameter(this, "delegate");
        C1123j4 c1123j4 = new C1123j4(this);
        C1201x c1201x = new C1201x(this, s7);
        Hf.i5 i5Var = new Hf.i5(this);
        Intrinsics.checkNotNullParameter(this, "delegate");
        Hf.V2 v2 = new Hf.V2(this);
        Hf.U4 u4 = new Hf.U4(this, p3);
        Hf.L l = new Hf.L(this);
        Intrinsics.checkNotNullParameter(this, "delegate");
        C1200w4 c1200w4 = new C1200w4(this);
        Hf.A3 a3 = new Hf.A3(this);
        C1093e4 c1093e4 = new C1093e4(this);
        this.m = c1093e4;
        Hf.C4 c4 = new Hf.C4(this);
        this.n = c4;
        C1141m4 c1141m4 = new C1141m4(this);
        this.o = c1141m4;
        this.p = kotlin.collections.z.m(new Df.c[]{c0439y6, c1178t0, v5Var, e, c1123j4, c1201x, i5Var, v2, l, c1200w4, a3, c1093e4, u4, c4, c1141m4, new Hf.S2(this), new Hf.W0(this), new C1171s(this), new C1078c1(this), new C1144n1(this)});
    }

    public static Unit G(S3 s3, Hd.G g, C0740d c0740d, Ad.O o) {
        Intrinsics.checkNotNullParameter(o, "it");
        if (o == Ad.O.a) {
            super.q(g, c0740d);
        }
        return Unit.a;
    }

    public static Unit H(S3 s3, Hd.G g, C0740d c0740d, Ad.O o) {
        Intrinsics.checkNotNullParameter(o, "it");
        if (o == Ad.O.a) {
            super.q(g, c0740d);
        }
        return Unit.a;
    }

    public static Unit I(S3 s3, Hd.G g, C0740d c0740d, Ad.O o) {
        Intrinsics.checkNotNullParameter(o, "it");
        if (o == Ad.O.a) {
            super.q(g, c0740d);
        }
        return Unit.a;
    }

    public static Unit J(S3 s3, Hd.G g, C0740d c0740d, Ad.O o) {
        Intrinsics.checkNotNullParameter(o, "it");
        if (o == Ad.O.a) {
            super.q(g, c0740d);
        }
        return Unit.a;
    }

    public final Object K(Hd.G g, Vk.a aVar) {
        Object objO = o(g, aVar);
        return objO == Wk.a.a ? objO : Unit.a;
    }

    @Override // Df.b
    public final void a(boolean z) {
        for (Df.c cVar : this.p) {
            Df.b bVar = cVar instanceof Df.b ? (Df.b) cVar : null;
            if (bVar != null) {
                bVar.a(z);
            }
        }
    }

    @Override // Df.b
    public final void b(boolean z) {
        for (Df.c cVar : this.p) {
            Df.b bVar = cVar instanceof Df.b ? (Df.b) cVar : null;
            if (bVar != null) {
                bVar.b(z);
            }
        }
    }

    @Override // Df.b
    public final void d() {
        for (Df.c cVar : this.p) {
            Df.b bVar = cVar instanceof Df.b ? (Df.b) cVar : null;
            if (bVar != null) {
                bVar.d();
            }
        }
    }

    @Override // Df.b
    public final void e(Mm.B b, C4801l c4801l) {
        Intrinsics.checkNotNullParameter(b, "scope");
        Intrinsics.checkNotNullParameter(c4801l, "streamService");
        super.e(b, c4801l);
        for (Df.c cVar : this.p) {
            Df.b bVar = cVar instanceof Df.b ? (Df.b) cVar : null;
            if (bVar != null) {
                bVar.e(b, c4801l);
            }
        }
    }

    @Override // Hd.r
    public final void k() {
        if (this.i.d) {
            qg.v vVar = AbstractC4797h.a;
            AbstractC4797h.b(this.k.n);
        }
        for (Df.c cVar : this.p) {
            Df.d dVar = cVar instanceof Df.d ? (Df.d) cVar : null;
            if (dVar != null) {
                dVar.k();
            }
        }
        this.l.k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
    
        if (Bh.g.c.contains(r1) != false) goto L29;
     */
    @Override // Hd.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q(final Hd.G r5, final Ee.C0740d r6) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Cf.S3.q(Hd.G, Ee.d):void");
    }

    @Override // Hd.r
    public final Hd.i v() {
        return this.i;
    }

    @Override // Hd.r
    public final void y() {
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            ((Df.c) it.next()).c();
        }
        Rf.k kVar = Rf.k.a;
        Rf.k.b(androidx.lifecycle.Z.i(this), Rf.l.N, false, new Aj.h0(this, (Vk.a) null, 3));
    }

    public /* synthetic */ S3(P3 p3) {
        this(p3, new S7());
    }
}
