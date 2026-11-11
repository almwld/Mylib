package Fh;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /data/data/com.termux/files/home/downloads/Kimi3/dex_parts/classes2.dex */
public final class Y extends Xk.i implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ bf.Q c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(String str, String str2, bf.Q q, Vk.a aVar) {
        super(2, aVar);
        this.a = str;
        this.b = str2;
        this.c = q;
    }

    public final Vk.a create(Object obj, Vk.a aVar) {
        return new Y(this.a, this.b, this.c, aVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((Mm.B) obj, (Vk.a) obj2).invokeSuspend(Unit.a);
    }

    public final Object invokeSuspend(Object obj) {
        Wk.a aVar = Wk.a.a;
        P8.a.s(obj);
        Y6.k kVar = new Y6.k("web_card_view", 29);
        kVar.y(this.a, "msh_xml_tag_type");
        kVar.y("chat_detail", "enter_from");
        kVar.y(this.b, "msh_conversation_id");
        kVar.y(this.c.a, "msh_message_id");
        kVar.v();
        return Unit.a;
    }
}
