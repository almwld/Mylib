package Hf;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ue.C4801l;

/* JADX INFO: renamed from: Hf.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C1193v3 extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ C4801l b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1193v3(C4801l c4801l, Vk.a aVar) {
        super(2, aVar);
        this.b = c4801l;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new C1193v3(this.b, aVar);
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
        this.a = 1;
        r0Var.collect(C1187u3.a, this);
        return aVar;
    }
}
