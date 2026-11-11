package x4;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import w4.C2250c;
import w4.C2252e;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y implements w4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2252e f28015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashSet f28016b = new LinkedHashSet();

    public Y(C2252e c2252e) {
        this.f28015a = c2252e;
    }

    @Override // w4.h
    public final int A0(p3.r rVar) {
        C2252e c2252e = this.f28015a;
        int iA0 = c2252e.A0(rVar);
        if (p3.K.j(rVar.f23436o)) {
            c2252e.Z(new t3.g(rVar.f23407A));
        }
        return iA0;
    }

    @Override // w4.h
    public final void E(int i4, ByteBuffer byteBuffer, C2250c c2250c) throws w4.i {
        this.f28015a.E(i4, byteBuffer, c2250c);
    }

    @Override // w4.h
    public final void Z(p3.I i4) {
        if (vb.v.g(i4)) {
            this.f28016b.add(i4);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws w4.i {
        Iterator it = this.f28016b.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            C2252e c2252e = this.f28015a;
            if (!zHasNext) {
                c2252e.close();
                return;
            }
            c2252e.Z((p3.I) it.next());
        }
    }
}
