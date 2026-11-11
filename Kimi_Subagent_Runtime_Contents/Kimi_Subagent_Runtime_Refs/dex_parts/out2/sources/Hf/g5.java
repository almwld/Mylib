package Hf;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import ue.C4801l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class g5 extends Xk.i implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ C4801l b;
    public final /* synthetic */ i5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(C4801l c4801l, i5 i5Var, Vk.a aVar) {
        super(2, aVar);
        this.b = c4801l;
        this.c = i5Var;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        g5 g5Var = new g5(this.b, this.c, aVar);
        g5Var.a = obj;
        return g5Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Mm.B b = (Mm.B) this.a;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        Mm.E.z(b, (CoroutineContext) null, (Mm.C) null, new f5(this.b, this.c, null), 3);
        return Unit.a;
    }
}
