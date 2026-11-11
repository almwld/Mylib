package Hf;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ue.C4801l;

/* JADX INFO: renamed from: Hf.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C1126k1 extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ C4801l b;
    public final /* synthetic */ C1144n1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1126k1(C4801l c4801l, C1144n1 c1144n1, Vk.a aVar) {
        super(2, aVar);
        this.b = c4801l;
        this.c = c1144n1;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new C1126k1(this.b, this.c, aVar);
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
        Pm.r0 r0Var = this.b.j;
        Bg.u uVar = new Bg.u(3, this.c);
        this.a = 1;
        r0Var.collect(uVar, this);
        return aVar;
    }
}
