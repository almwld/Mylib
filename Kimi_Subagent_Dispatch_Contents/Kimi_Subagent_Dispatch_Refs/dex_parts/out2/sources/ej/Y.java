package ej;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ j0.d b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(j0.d dVar, float f, Vk.a aVar) {
        super(2, aVar);
        this.b = dVar;
        this.c = f;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new Y(this.b, this.c, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Wk.a aVar = Wk.a.a;
        int i = this.a;
        if (i == 0) {
            P8.a.s(obj);
            float f = this.c;
            n2.f fVar = new n2.f(f);
            j0.d dVar = this.b;
            j0.l0 l0VarQ = Float.compare(((n2.f) dVar.e.getValue()).a, f) < 0 ? j0.e.q(1.0f, 1000.0f, (Object) null, 4) : j0.e.q(1.0f, 250.0f, (Object) null, 4);
            this.a = 1;
            if (j0.d.b(dVar, fVar, l0VarQ, (v1.b) null, (Function1) null, this, 12) == aVar) {
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
