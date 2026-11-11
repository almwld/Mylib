package kf;

import Dc.Z6;
import Zd.B;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ B b;
    public final /* synthetic */ Z6 c;
    public final /* synthetic */ int d;

    public /* synthetic */ g(B b, Z6 z6, int i, int i2) {
        this.a = i2;
        this.b = b;
        this.c = z6;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        c1.o oVar = (c1.o) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                a.c(this.b, this.c, oVar, c1.c.J(this.d | 1));
                break;
            default:
                a.f(this.b, this.c, oVar, c1.c.J(this.d | 1));
                break;
        }
        return Unit.a;
    }
}
