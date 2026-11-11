package R0;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p0.d2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes.dex */
public final class Y implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f7381b;

    public /* synthetic */ Y(int i4, Function1 function1) {
        this.f7380a = i4;
        this.f7381b = function1;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(J1.z zVar, Vk.a aVar) {
        switch (this.f7380a) {
            case 0:
                Object objD1 = ((J1.O) zVar).d1(new X(this.f7381b, null), aVar);
                if (objD1 != Wk.a.a) {
                    break;
                }
                break;
            case 1:
                Object objE = d2.e(zVar, new aj.B(this.f7381b, (Vk.a) null), aVar);
                if (objE != Wk.a.a) {
                    break;
                }
                break;
            case 2:
                Object objL = Mm.E.l(new aj.G(zVar, this.f7381b, (Vk.a) null), aVar);
                if (objL != Wk.a.a) {
                    break;
                }
                break;
            default:
                Object objE2 = d2.e(zVar, new H0.b(this.f7381b, null), aVar);
                Wk.a aVar2 = Wk.a.a;
                if (objE2 != aVar2) {
                    objE2 = Unit.a;
                }
                if (objE2 != aVar2) {
                    break;
                }
                break;
        }
        return Unit.a;
    }
}
