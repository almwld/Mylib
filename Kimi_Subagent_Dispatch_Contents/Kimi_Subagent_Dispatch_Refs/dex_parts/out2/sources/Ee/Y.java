package Ee;

import eh.AbstractC3144a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ng.C4068d;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Xk.i implements Function2 {
    public final /* synthetic */ i0 a;
    public final /* synthetic */ boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(i0 i0Var, boolean z, Vk.a aVar) {
        super(2, aVar);
        this.a = i0Var;
        this.b = z;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new Y(this.a, this.b, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        i0 i0Var = this.a;
        if (!i0Var.b() && i0Var.a() && this.b) {
            C4068d c4068d = com.moonshot.kimichat.abconfig.a.a;
            if (com.moonshot.kimichat.abconfig.a.d() && !((Boolean) AbstractC3144a.a.getValue()).booleanValue()) {
                AbstractC3144a.a();
            }
        }
        return Unit.a;
    }
}
