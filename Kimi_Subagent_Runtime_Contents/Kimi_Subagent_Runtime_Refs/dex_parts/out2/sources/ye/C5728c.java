package ye;

import Mm.B;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ue.C4801l;

/* JADX INFO: renamed from: ye.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class C5728c extends Xk.i implements Function2 {
    public int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C5729d c;
    public final /* synthetic */ String d;
    public final /* synthetic */ C4801l e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5728c(String str, C5729d c5729d, String str2, C4801l c4801l, Vk.a aVar) {
        super(2, aVar);
        this.b = str;
        this.c = c5729d;
        this.d = str2;
        this.e = c4801l;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new C5728c(this.b, this.c, this.d, this.e, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
        if (r2 == r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00dc, code lost:
    
        if (r2 == r3) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ye.C5728c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
