package Hf;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ue.C4801l;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class f5 extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ C4801l b;
    public final /* synthetic */ i5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f5(C4801l c4801l, i5 i5Var, Vk.a aVar) {
        super(2, aVar);
        this.b = c4801l;
        this.c = i5Var;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new f5(this.b, this.c, aVar);
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
        Pm.r0 r0Var = this.b.i;
        a5 a5Var = new a5(this.c, 1);
        this.a = 1;
        r0Var.collect(a5Var, this);
        return aVar;
    }
}
