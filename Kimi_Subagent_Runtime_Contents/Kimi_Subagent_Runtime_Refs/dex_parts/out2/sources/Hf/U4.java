package Hf;

import Cf.AbstractC0221a3;
import Cf.C0246d1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import ue.C4801l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class U4 extends Df.d implements Df.b {
    public static final /* synthetic */ int m = 0;
    public final Cf.P3 k;
    public final Jc.b l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U4(Cf.S3 s3, Cf.P3 p3) {
        super(s3);
        Intrinsics.checkNotNullParameter(s3, "delegate");
        Intrinsics.checkNotNullParameter(p3, "chatModel");
        this.k = p3;
        this.l = new Jc.b(3);
    }

    public final void G(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "slidesIds");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Mm.E.z(androidx.lifecycle.Z.i(this), Mm.P.a, (Mm.C) null, new T4(this, (E4) it.next(), null), 2);
        }
    }

    @Override // Df.c
    public final void c() {
        G4 g4 = new G4(this, null);
        kotlin.jvm.internal.K k = kotlin.jvm.internal.J.a;
        w(k.b(Cf.X.class), g4);
        w(k.b(Cf.Y2.class), new H4(this, null));
        w(k.b(Cf.Z2.class), new I4(this, null));
        w(k.b(AbstractC0221a3.class), new J4(this, null));
        w(k.b(C0246d1.class), new M4(this, null));
    }

    @Override // Df.b
    public final void e(Mm.B b, C4801l c4801l) {
        Intrinsics.checkNotNullParameter(b, "scope");
        Intrinsics.checkNotNullParameter(c4801l, "streamService");
        super.e(b, c4801l);
        Mm.E.z(androidx.lifecycle.Z.i(this), (CoroutineContext) null, (Mm.C) null, new Q4(c4801l, this, null), 3);
    }
}
