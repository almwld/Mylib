package Dd;

import eg.EnumC3133p;
import je.n1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Xk.i implements Function2 {
    public nk.b a;
    public String b;
    public int c;
    public int d;
    public final /* synthetic */ qk.E e;
    public final /* synthetic */ Bk.q f;
    public final /* synthetic */ n1 g;
    public final /* synthetic */ qk.M h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(qk.E e, Bk.q qVar, n1 n1Var, qk.M m, Vk.a aVar) {
        super(2, aVar);
        EnumC3133p enumC3133p = EnumC3133p.a;
        this.e = e;
        this.f = qVar;
        this.g = n1Var;
        this.h = m;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        EnumC3133p enumC3133p = EnumC3133p.a;
        return new Y(this.e, this.f, this.g, this.h, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x015d, code lost:
    
        if (r2 == r5) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f5 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x001e, B:61:0x0162, B:63:0x0177, B:64:0x017e, B:15:0x0034, B:41:0x00f5, B:43:0x0102, B:44:0x0109, B:18:0x0045, B:30:0x00b6, B:32:0x00c2, B:36:0x00de, B:45:0x010a, B:47:0x0114, B:53:0x0131, B:57:0x014d, B:21:0x004e, B:23:0x0087, B:27:0x0098), top: B:67:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102 A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:8:0x001e, B:61:0x0162, B:63:0x0177, B:64:0x017e, B:15:0x0034, B:41:0x00f5, B:43:0x0102, B:44:0x0109, B:18:0x0045, B:30:0x00b6, B:32:0x00c2, B:36:0x00de, B:45:0x010a, B:47:0x0114, B:53:0x0131, B:57:0x014d, B:21:0x004e, B:23:0x0087, B:27:0x0098), top: B:67:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Dd.Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
