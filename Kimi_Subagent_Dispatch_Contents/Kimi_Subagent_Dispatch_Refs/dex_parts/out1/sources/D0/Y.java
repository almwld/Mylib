package D0;

import c1.InterfaceC1014f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y extends Xk.i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC1014f0 f1324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1014f0 f1326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ R0.Q0 f1327d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(InterfaceC1014f0 interfaceC1014f0, R0.Q0 q02, Vk.a aVar) {
        super(2, aVar);
        this.f1326c = interfaceC1014f0;
        this.f1327d = q02;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new Y(this.f1326c, this.f1327d, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        InterfaceC1014f0 interfaceC1014f0;
        Wk.a aVar = Wk.a.a;
        int i4 = this.f1325b;
        if (i4 == 0) {
            P8.a.s(obj);
            InterfaceC1014f0 interfaceC1014f02 = this.f1326c;
            this.f1324a = interfaceC1014f02;
            this.f1325b = 1;
            Object objY = H0.y(this.f1327d, this);
            if (objY == aVar) {
                return aVar;
            }
            interfaceC1014f0 = interfaceC1014f02;
            obj = objY;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC1014f0 = this.f1324a;
            P8.a.s(obj);
        }
        interfaceC1014f0.setValue(obj);
        return Unit.a;
    }
}
