package nh;

import Fh.C0858r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import me.C3979c;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Xk.h implements Function2 {
    public kotlin.jvm.internal.H b;
    public float c;
    public float d;
    public float e;
    public long f;
    public int g;
    public int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ J1.m k;
    public final /* synthetic */ C3979c l;
    public final /* synthetic */ Q m;
    public final /* synthetic */ V n;
    public final /* synthetic */ W o;
    public final /* synthetic */ C0858r0 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(J1.m mVar, C3979c c3979c, Q q, V v, W w, C0858r0 c0858r0, Vk.a aVar) {
        super(2, aVar);
        this.k = mVar;
        this.l = c3979c;
        this.m = q;
        this.n = v;
        this.o = w;
        this.p = c0858r0;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        Y y = new Y(this.k, this.l, this.m, this.n, this.o, this.p, aVar);
        y.j = obj;
        return y;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((J1.M) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00af, code lost:
    
        if (r7 != r2) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x022b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00af -> B:18:0x00b2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nh.Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
