package bf;

import Cf.P3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ng.C4068d;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ P3 b;
    public final /* synthetic */ C4068d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(P3 p3, C4068d c4068d, Vk.a aVar) {
        super(2, aVar);
        this.b = p3;
        this.c = c4068d;
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
            this.a = 1;
            if (Mm.E.m(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            P8.a.s(obj);
        }
        if (this.b.m().b) {
            this.c.setValue(Boolean.TRUE);
        }
        return Unit.a;
    }
}
