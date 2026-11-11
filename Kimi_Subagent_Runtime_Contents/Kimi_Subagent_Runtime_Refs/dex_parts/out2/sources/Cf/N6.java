package Cf;

import Dc.C0639v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ue.C4801l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class N6 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ C0639v b;

    public /* synthetic */ N6(int i, C0639v c0639v) {
        this.a = i;
        this.b = c0639v;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                C0639v c0639v = (C0639v) obj;
                Intrinsics.checkNotNullParameter(c0639v, "it");
                return Boolean.valueOf(Intrinsics.b(c0639v.a, this.b.a));
            default:
                C4801l c4801l = (C4801l) obj;
                Intrinsics.checkNotNullParameter(c4801l, "it");
                String str = ((C0639v) c4801l.i.getValue()).a;
                C0639v c0639v2 = this.b;
                return Boolean.valueOf(Intrinsics.b(str, c0639v2.a) && Intrinsics.b(((C0639v) c4801l.i.getValue()).d().a, c0639v2.d().a));
        }
    }
}
