package Mc;

import eg.EnumC3133p;
import hg.C3431b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Xk.i implements Function2 {
    public C3431b a;
    public nk.b b;
    public int c;
    public final /* synthetic */ Q0 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Bk.q f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Q0 q0, Function1 function1, Bk.q qVar, Vk.a aVar) {
        super(2, aVar);
        EnumC3133p enumC3133p = EnumC3133p.a;
        this.d = q0;
        this.e = function1;
        this.f = qVar;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        EnumC3133p enumC3133p = EnumC3133p.a;
        return new Y(this.d, this.e, this.f, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0178, code lost:
    
        if (r3 == r6) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Mc.Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
