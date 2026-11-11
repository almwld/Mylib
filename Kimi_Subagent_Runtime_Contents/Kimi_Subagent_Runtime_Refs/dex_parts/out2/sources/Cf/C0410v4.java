package Cf;

import com.google.firebase.messaging.Constants;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ue.C4801l;

/* JADX INFO: renamed from: Cf.v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C0410v4 extends Xk.i implements Function2 {
    public /* synthetic */ boolean a;
    public final /* synthetic */ C0439y6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0410v4(C0439y6 c0439y6, Vk.a aVar) {
        super(2, aVar);
        this.b = c0439y6;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        C0410v4 c0410v4 = new C0410v4(this.b, aVar);
        c0410v4.a = ((Boolean) obj).booleanValue();
        return c0410v4;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((C0410v4) create(bool, (Vk.a) obj2)).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        if (z) {
            C4801l c4801l = this.b.n;
            c4801l.getClass();
            Intrinsics.checkNotNullParameter("app_visible", Constants.MessagePayloadKeys.FROM);
            c4801l.c.l("app_visible");
        }
        return Unit.a;
    }
}
