.class public com/company/Main
.super java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
.limit locals 10
.limit stack 10
ldc 0.0
fstore 0
fstore 1
LoopStart:
i2f
i2f
fcmpl
ifle truelabel
iconst_0
goto endlabel
truelabel:
iconst_1
endlabel:
ifeq BranchEnd
i2f
ldc 4.0
fcmpl
ifeq truelabel
iconst_0
goto endlabel
truelabel:
iconst_1
endlabel:
ifeq BranchEnd
fload 0
fload 1
fadd
fstore 0
BranchEnd:
fconst_1
fload 1
fadd
fstore 1
goto LoopStart
BranchEnd:
getstatic java/lang/System/out Ljava/io/PrintStream;
astore_1
invokestatic java/lang/String/valueOf(F)Ljava/lang/String;
astore_3
aload_1
aload_3
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
.limit locals 50
.limit stack 10
return
.end method
