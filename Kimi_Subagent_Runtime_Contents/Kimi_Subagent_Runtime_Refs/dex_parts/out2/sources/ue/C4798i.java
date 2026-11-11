package ue;

import Mm.B;
import Pm.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ze.a0;

/* JADX INFO: renamed from: ue.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C4798i extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ C4801l b;
    public final /* synthetic */ a0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4798i(C4801l c4801l, a0 a0Var, Vk.a aVar) {
        super(2, aVar);
        this.b = c4801l;
        this.c = a0Var;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new C4798i(this.b, this.c, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Wk.a aVar = Wk.a.a;
        int i = this.a;
        if (i == 0) {
            P8.a.s(obj);
            h0 h0Var = this.b.u;
            this.a = 1;
            if (h0Var.emit(this.c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P8.a.s(obj);
        }
        return Unit.a;
    }
}
