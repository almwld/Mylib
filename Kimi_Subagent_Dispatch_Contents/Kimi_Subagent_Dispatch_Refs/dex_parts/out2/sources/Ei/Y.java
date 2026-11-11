package Ei;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Xk.i implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ l0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(l0 l0Var, Vk.a aVar) {
        super(2, aVar);
        this.b = l0Var;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        Y y = new Y(this.b, aVar);
        y.a = obj;
        return y;
    }

    public final Object invoke(Object obj, Object obj2) {
        if (obj != null) {
            throw new ClassCastException();
        }
        create(null, (Vk.a) obj2).invokeSuspend(Unit.a);
        throw null;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.a != null) {
            throw new ClassCastException();
        }
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        throw null;
    }
}
