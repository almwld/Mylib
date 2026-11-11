package Cf;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import ue.C4801l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class H6 extends Xk.i implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4801l b;
    public final /* synthetic */ C0439y6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H6(C0439y6 c0439y6, Vk.a aVar, C4801l c4801l) {
        super(2, aVar);
        this.b = c4801l;
        this.c = c0439y6;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        H6 h6 = new H6(this.c, aVar, this.b);
        h6.a = obj;
        return h6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Mm.B b = (Mm.B) this.a;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        C0439y6 c0439y6 = this.c;
        C4801l c4801l = this.b;
        Mm.E.z(b, (CoroutineContext) null, (Mm.C) null, new C6(c0439y6, null, c4801l), 3);
        Mm.E.z(b, (CoroutineContext) null, (Mm.C) null, new D6(c0439y6, null, c4801l), 3);
        Mm.E.z(b, (CoroutineContext) null, (Mm.C) null, new E6(c0439y6, null, c4801l), 3);
        Mm.E.z(b, (CoroutineContext) null, (Mm.C) null, new F6(c4801l, c0439y6, c4801l, null), 3);
        Mm.E.z(b, Rm.n.a, (Mm.C) null, new G6(c0439y6, null, c4801l), 2);
        return Unit.a;
    }
}
