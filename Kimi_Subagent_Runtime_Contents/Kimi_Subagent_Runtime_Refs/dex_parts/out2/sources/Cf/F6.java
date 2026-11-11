package Cf;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ue.C4801l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class F6 extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ C4801l b;
    public final /* synthetic */ C0439y6 c;
    public final /* synthetic */ C4801l d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F6(C4801l c4801l, C0439y6 c0439y6, C4801l c4801l2, Vk.a aVar) {
        super(2, aVar);
        this.b = c4801l;
        this.c = c0439y6;
        this.d = c4801l2;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new F6(this.b, this.c, this.d, aVar);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Sk.i */
    public final Object invoke(Object obj, Object obj2) throws Sk.i {
        create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
        return Wk.a.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: Sk.i */
    public final Object invokeSuspend(Object obj) throws Sk.i {
        Wk.a aVar = Wk.a.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw Ie.K0.e(obj);
        }
        P8.a.s(obj);
        Pm.h0 h0Var = this.b.u;
        C.l lVar = new C.l(2, this.c, this.d);
        this.a = 1;
        h0Var.getClass();
        Pm.h0.k(h0Var, lVar, this);
        return aVar;
    }
}
