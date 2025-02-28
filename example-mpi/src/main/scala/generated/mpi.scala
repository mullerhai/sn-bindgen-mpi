package mpi

import _root_.scala.scalanative.unsafe.*
import _root_.scala.scalanative.unsigned.*
import _root_.scala.scalanative.libc.*
import _root_.scala.scalanative.*

object aliases:
  import _root_.mpi.aliases.*
  import _root_.mpi.structs.*
  type MPI_Aint = _MSMPI_int64_t
  object MPI_Aint: 
    given _tag: Tag[MPI_Aint] = _MSMPI_int64_t._tag
    inline def apply(inline o: _MSMPI_int64_t): MPI_Aint = o
    extension (v: MPI_Aint)
      inline def value: _MSMPI_int64_t = v

  opaque type MPI_Comm = CInt
  object MPI_Comm: 
    given _tag: Tag[MPI_Comm] = Tag.Int
    inline def apply(inline o: CInt): MPI_Comm = o
    extension (v: MPI_Comm)
      inline def value: CInt = v

  type MPI_Comm_copy_attr_function = CFuncPtr6[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt]
  object MPI_Comm_copy_attr_function: 
    given _tag: Tag[MPI_Comm_copy_attr_function] = Tag.materializeCFuncPtr6[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt]
    inline def apply(inline o: CFuncPtr6[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt]): MPI_Comm_copy_attr_function = o
    extension (v: MPI_Comm_copy_attr_function)
      inline def value: CFuncPtr6[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt] = v

  type MPI_Comm_delete_attr_function = CFuncPtr4[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], CInt]
  object MPI_Comm_delete_attr_function: 
    given _tag: Tag[MPI_Comm_delete_attr_function] = Tag.materializeCFuncPtr4[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], CInt]
    inline def apply(inline o: CFuncPtr4[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], CInt]): MPI_Comm_delete_attr_function = o
    extension (v: MPI_Comm_delete_attr_function)
      inline def value: CFuncPtr4[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], CInt] = v

  type MPI_Comm_errhandler_fn = CFuncPtr2[Ptr[MPI_Comm], Ptr[CInt], Unit]
  object MPI_Comm_errhandler_fn: 
    given _tag: Tag[MPI_Comm_errhandler_fn] = Tag.materializeCFuncPtr2[Ptr[MPI_Comm], Ptr[CInt], Unit]
    inline def apply(inline o: CFuncPtr2[Ptr[MPI_Comm], Ptr[CInt], Unit]): MPI_Comm_errhandler_fn = o
    extension (v: MPI_Comm_errhandler_fn)
      inline def value: CFuncPtr2[Ptr[MPI_Comm], Ptr[CInt], Unit] = v

  type MPI_Copy_function = CFuncPtr6[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt]
  object MPI_Copy_function: 
    given _tag: Tag[MPI_Copy_function] = Tag.materializeCFuncPtr6[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt]
    inline def apply(inline o: CFuncPtr6[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt]): MPI_Copy_function = o
    extension (v: MPI_Copy_function)
      inline def value: CFuncPtr6[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt] = v

  type MPI_Count = _MSMPI_int64_t
  object MPI_Count: 
    given _tag: Tag[MPI_Count] = _MSMPI_int64_t._tag
    inline def apply(inline o: _MSMPI_int64_t): MPI_Count = o
    extension (v: MPI_Count)
      inline def value: _MSMPI_int64_t = v

  type MPI_Datarep_conversion_function = CFuncPtr6[Ptr[Byte], MPI_Datatype, CInt, Ptr[Byte], MPI_Offset, Ptr[Byte], CInt]
  object MPI_Datarep_conversion_function: 
    given _tag: Tag[MPI_Datarep_conversion_function] = Tag.materializeCFuncPtr6[Ptr[Byte], MPI_Datatype, CInt, Ptr[Byte], MPI_Offset, Ptr[Byte], CInt]
    inline def apply(inline o: CFuncPtr6[Ptr[Byte], MPI_Datatype, CInt, Ptr[Byte], MPI_Offset, Ptr[Byte], CInt]): MPI_Datarep_conversion_function = o
    extension (v: MPI_Datarep_conversion_function)
      inline def value: CFuncPtr6[Ptr[Byte], MPI_Datatype, CInt, Ptr[Byte], MPI_Offset, Ptr[Byte], CInt] = v

  type MPI_Datarep_extent_function = CFuncPtr3[MPI_Datatype, Ptr[MPI_Aint], Ptr[Byte], CInt]
  object MPI_Datarep_extent_function: 
    given _tag: Tag[MPI_Datarep_extent_function] = Tag.materializeCFuncPtr3[MPI_Datatype, Ptr[MPI_Aint], Ptr[Byte], CInt]
    inline def apply(inline o: CFuncPtr3[MPI_Datatype, Ptr[MPI_Aint], Ptr[Byte], CInt]): MPI_Datarep_extent_function = o
    extension (v: MPI_Datarep_extent_function)
      inline def value: CFuncPtr3[MPI_Datatype, Ptr[MPI_Aint], Ptr[Byte], CInt] = v

  opaque type MPI_Datatype = CInt
  object MPI_Datatype: 
    given _tag: Tag[MPI_Datatype] = Tag.Int
    inline def apply(inline o: CInt): MPI_Datatype = o
    extension (v: MPI_Datatype)
      inline def value: CInt = v

  type MPI_Delete_function = CFuncPtr4[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], CInt]
  object MPI_Delete_function: 
    given _tag: Tag[MPI_Delete_function] = Tag.materializeCFuncPtr4[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], CInt]
    inline def apply(inline o: CFuncPtr4[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], CInt]): MPI_Delete_function = o
    extension (v: MPI_Delete_function)
      inline def value: CFuncPtr4[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], CInt] = v

  opaque type MPI_Errhandler = CInt
  object MPI_Errhandler: 
    given _tag: Tag[MPI_Errhandler] = Tag.Int
    inline def apply(inline o: CInt): MPI_Errhandler = o
    extension (v: MPI_Errhandler)
      inline def value: CInt = v

  opaque type MPI_File = Ptr[ADIOI_FileD]
  object MPI_File: 
    given _tag: Tag[MPI_File] = Tag.Ptr[ADIOI_FileD](ADIOI_FileD._tag)
    inline def apply(inline o: Ptr[ADIOI_FileD]): MPI_File = o
    extension (v: MPI_File)
      inline def value: Ptr[ADIOI_FileD] = v

  type MPI_File_errhandler_fn = CFuncPtr2[Ptr[MPI_File], Ptr[CInt], Unit]
  object MPI_File_errhandler_fn: 
    given _tag: Tag[MPI_File_errhandler_fn] = Tag.materializeCFuncPtr2[Ptr[MPI_File], Ptr[CInt], Unit]
    inline def apply(inline o: CFuncPtr2[Ptr[MPI_File], Ptr[CInt], Unit]): MPI_File_errhandler_fn = o
    extension (v: MPI_File_errhandler_fn)
      inline def value: CFuncPtr2[Ptr[MPI_File], Ptr[CInt], Unit] = v

  opaque type MPI_Fint = CInt
  object MPI_Fint: 
    given _tag: Tag[MPI_Fint] = Tag.Int
    inline def apply(inline o: CInt): MPI_Fint = o
    extension (v: MPI_Fint)
      inline def value: CInt = v

  type MPI_Grequest_cancel_function = CFuncPtr2[Ptr[Byte], CInt, CInt]
  object MPI_Grequest_cancel_function: 
    given _tag: Tag[MPI_Grequest_cancel_function] = Tag.materializeCFuncPtr2[Ptr[Byte], CInt, CInt]
    inline def apply(inline o: CFuncPtr2[Ptr[Byte], CInt, CInt]): MPI_Grequest_cancel_function = o
    extension (v: MPI_Grequest_cancel_function)
      inline def value: CFuncPtr2[Ptr[Byte], CInt, CInt] = v

  type MPI_Grequest_free_function = CFuncPtr1[Ptr[Byte], CInt]
  object MPI_Grequest_free_function: 
    given _tag: Tag[MPI_Grequest_free_function] = Tag.materializeCFuncPtr1[Ptr[Byte], CInt]
    inline def apply(inline o: CFuncPtr1[Ptr[Byte], CInt]): MPI_Grequest_free_function = o
    extension (v: MPI_Grequest_free_function)
      inline def value: CFuncPtr1[Ptr[Byte], CInt] = v

  type MPI_Grequest_query_function = CFuncPtr2[Ptr[Byte], Ptr[MPI_Status], CInt]
  object MPI_Grequest_query_function: 
    given _tag: Tag[MPI_Grequest_query_function] = Tag.materializeCFuncPtr2[Ptr[Byte], Ptr[MPI_Status], CInt]
    inline def apply(inline o: CFuncPtr2[Ptr[Byte], Ptr[MPI_Status], CInt]): MPI_Grequest_query_function = o
    extension (v: MPI_Grequest_query_function)
      inline def value: CFuncPtr2[Ptr[Byte], Ptr[MPI_Status], CInt] = v

  opaque type MPI_Group = CInt
  object MPI_Group: 
    given _tag: Tag[MPI_Group] = Tag.Int
    inline def apply(inline o: CInt): MPI_Group = o
    extension (v: MPI_Group)
      inline def value: CInt = v

  type MPI_Handler_function = CFuncPtr2[Ptr[MPI_Comm], Ptr[CInt], Unit]
  object MPI_Handler_function: 
    given _tag: Tag[MPI_Handler_function] = Tag.materializeCFuncPtr2[Ptr[MPI_Comm], Ptr[CInt], Unit]
    inline def apply(inline o: CFuncPtr2[Ptr[MPI_Comm], Ptr[CInt], Unit]): MPI_Handler_function = o
    extension (v: MPI_Handler_function)
      inline def value: CFuncPtr2[Ptr[MPI_Comm], Ptr[CInt], Unit] = v

  opaque type MPI_Info = CInt
  object MPI_Info: 
    given _tag: Tag[MPI_Info] = Tag.Int
    inline def apply(inline o: CInt): MPI_Info = o
    extension (v: MPI_Info)
      inline def value: CInt = v

  opaque type MPI_Message = CInt
  object MPI_Message: 
    given _tag: Tag[MPI_Message] = Tag.Int
    inline def apply(inline o: CInt): MPI_Message = o
    extension (v: MPI_Message)
      inline def value: CInt = v

  type MPI_Offset = _MSMPI_int64_t
  object MPI_Offset: 
    given _tag: Tag[MPI_Offset] = _MSMPI_int64_t._tag
    inline def apply(inline o: _MSMPI_int64_t): MPI_Offset = o
    extension (v: MPI_Offset)
      inline def value: _MSMPI_int64_t = v

  opaque type MPI_Op = CInt
  object MPI_Op: 
    given _tag: Tag[MPI_Op] = Tag.Int
    inline def apply(inline o: CInt): MPI_Op = o
    extension (v: MPI_Op)
      inline def value: CInt = v

  opaque type MPI_Request = CInt
  object MPI_Request: 
    given _tag: Tag[MPI_Request] = Tag.Int
    inline def apply(inline o: CInt): MPI_Request = o
    extension (v: MPI_Request)
      inline def value: CInt = v

  type MPI_Type_copy_attr_function = CFuncPtr6[MPI_Datatype, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt]
  object MPI_Type_copy_attr_function: 
    given _tag: Tag[MPI_Type_copy_attr_function] = Tag.materializeCFuncPtr6[MPI_Datatype, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt]
    inline def apply(inline o: CFuncPtr6[MPI_Datatype, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt]): MPI_Type_copy_attr_function = o
    extension (v: MPI_Type_copy_attr_function)
      inline def value: CFuncPtr6[MPI_Datatype, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt] = v

  type MPI_Type_delete_attr_function = CFuncPtr4[MPI_Datatype, CInt, Ptr[Byte], Ptr[Byte], CInt]
  object MPI_Type_delete_attr_function: 
    given _tag: Tag[MPI_Type_delete_attr_function] = Tag.materializeCFuncPtr4[MPI_Datatype, CInt, Ptr[Byte], Ptr[Byte], CInt]
    inline def apply(inline o: CFuncPtr4[MPI_Datatype, CInt, Ptr[Byte], Ptr[Byte], CInt]): MPI_Type_delete_attr_function = o
    extension (v: MPI_Type_delete_attr_function)
      inline def value: CFuncPtr4[MPI_Datatype, CInt, Ptr[Byte], Ptr[Byte], CInt] = v

  type MPI_User_function = CFuncPtr4[Ptr[Byte], Ptr[Byte], Ptr[CInt], Ptr[MPI_Datatype], Unit]
  object MPI_User_function: 
    given _tag: Tag[MPI_User_function] = Tag.materializeCFuncPtr4[Ptr[Byte], Ptr[Byte], Ptr[CInt], Ptr[MPI_Datatype], Unit]
    inline def apply(inline o: CFuncPtr4[Ptr[Byte], Ptr[Byte], Ptr[CInt], Ptr[MPI_Datatype], Unit]): MPI_User_function = o
    extension (v: MPI_User_function)
      inline def value: CFuncPtr4[Ptr[Byte], Ptr[Byte], Ptr[CInt], Ptr[MPI_Datatype], Unit] = v

  opaque type MPI_Win = CInt
  object MPI_Win: 
    given _tag: Tag[MPI_Win] = Tag.Int
    inline def apply(inline o: CInt): MPI_Win = o
    extension (v: MPI_Win)
      inline def value: CInt = v

  type MPI_Win_copy_attr_function = CFuncPtr6[MPI_Win, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt]
  object MPI_Win_copy_attr_function: 
    given _tag: Tag[MPI_Win_copy_attr_function] = Tag.materializeCFuncPtr6[MPI_Win, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt]
    inline def apply(inline o: CFuncPtr6[MPI_Win, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt]): MPI_Win_copy_attr_function = o
    extension (v: MPI_Win_copy_attr_function)
      inline def value: CFuncPtr6[MPI_Win, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt] = v

  type MPI_Win_delete_attr_function = CFuncPtr4[MPI_Win, CInt, Ptr[Byte], Ptr[Byte], CInt]
  object MPI_Win_delete_attr_function: 
    given _tag: Tag[MPI_Win_delete_attr_function] = Tag.materializeCFuncPtr4[MPI_Win, CInt, Ptr[Byte], Ptr[Byte], CInt]
    inline def apply(inline o: CFuncPtr4[MPI_Win, CInt, Ptr[Byte], Ptr[Byte], CInt]): MPI_Win_delete_attr_function = o
    extension (v: MPI_Win_delete_attr_function)
      inline def value: CFuncPtr4[MPI_Win, CInt, Ptr[Byte], Ptr[Byte], CInt] = v

  type MPI_Win_errhandler_fn = CFuncPtr2[Ptr[MPI_Win], Ptr[CInt], Unit]
  object MPI_Win_errhandler_fn: 
    given _tag: Tag[MPI_Win_errhandler_fn] = Tag.materializeCFuncPtr2[Ptr[MPI_Win], Ptr[CInt], Unit]
    inline def apply(inline o: CFuncPtr2[Ptr[MPI_Win], Ptr[CInt], Unit]): MPI_Win_errhandler_fn = o
    extension (v: MPI_Win_errhandler_fn)
      inline def value: CFuncPtr2[Ptr[MPI_Win], Ptr[CInt], Unit] = v

  type MSMPI_Request_callback = CFuncPtr1[Ptr[MPI_Status], Unit]
  object MSMPI_Request_callback: 
    given _tag: Tag[MSMPI_Request_callback] = Tag.materializeCFuncPtr1[Ptr[MPI_Status], Unit]
    inline def apply(inline o: CFuncPtr1[Ptr[MPI_Status], Unit]): MSMPI_Request_callback = o
    extension (v: MSMPI_Request_callback)
      inline def value: CFuncPtr1[Ptr[MPI_Status], Unit] = v

  type _MSMPI_int64_t = int64_t
  object _MSMPI_int64_t: 
    given _tag: Tag[_MSMPI_int64_t] = int64_t._tag
    inline def apply(inline o: int64_t): _MSMPI_int64_t = o
    extension (v: _MSMPI_int64_t)
      inline def value: int64_t = v

  type int64_t = scala.Long
  object int64_t: 
    val _tag: Tag[int64_t] = summon[Tag[scala.Long]]
    inline def apply(inline o: scala.Long): int64_t = o
    extension (v: int64_t)
      inline def value: scala.Long = v

object structs:
  import _root_.mpi.aliases.*
  import _root_.mpi.structs.*
  opaque type ADIOI_FileD = CStruct0
  object ADIOI_FileD:
    given _tag: Tag[ADIOI_FileD] = Tag.materializeCStruct0Tag

  opaque type MPI_Status = CStruct4[CArray[CInt, Nat._2], CInt, CInt, CInt]
  object MPI_Status:
    given _tag: Tag[MPI_Status] = Tag.materializeCStruct4Tag[CArray[CInt, Nat._2], CInt, CInt, CInt]
    def apply()(using Zone): Ptr[MPI_Status] = scala.scalanative.unsafe.alloc[MPI_Status](1)
    def apply(internal : CArray[CInt, Nat._2], MPI_SOURCE : CInt, MPI_TAG : CInt, MPI_ERROR : CInt)(using Zone): Ptr[MPI_Status] = 
      val ____ptr = apply()
      (!____ptr).internal = internal
      (!____ptr).MPI_SOURCE = MPI_SOURCE
      (!____ptr).MPI_TAG = MPI_TAG
      (!____ptr).MPI_ERROR = MPI_ERROR
      ____ptr
    extension (struct: MPI_Status)
      def internal : CArray[CInt, Nat._2] = struct._1
      def internal_=(value: CArray[CInt, Nat._2]): Unit = !struct.at1 = value
      def MPI_SOURCE : CInt = struct._2
      def MPI_SOURCE_=(value: CInt): Unit = !struct.at2 = value
      def MPI_TAG : CInt = struct._3
      def MPI_TAG_=(value: CInt): Unit = !struct.at3 = value
      def MPI_ERROR : CInt = struct._4
      def MPI_ERROR_=(value: CInt): Unit = !struct.at4 = value

  opaque type MSMPI_Lock_queue = CStruct2[Ptr[Byte], MPI_Aint]
  object MSMPI_Lock_queue:
    given _tag: Tag[MSMPI_Lock_queue] = Tag.materializeCStruct2Tag[Ptr[Byte], MPI_Aint]
    def apply()(using Zone): Ptr[MSMPI_Lock_queue] = scala.scalanative.unsafe.alloc[MSMPI_Lock_queue](1)
    def apply(next : Ptr[_MSMPI_LOCK_QUEUE], flags : MPI_Aint)(using Zone): Ptr[MSMPI_Lock_queue] = 
      val ____ptr = apply()
      (!____ptr).next = next
      (!____ptr).flags = flags
      ____ptr
    extension (struct: MSMPI_Lock_queue)
      def next : Ptr[_MSMPI_LOCK_QUEUE] = struct._1.asInstanceOf[Ptr[_MSMPI_LOCK_QUEUE]]
      def next_=(value: Ptr[_MSMPI_LOCK_QUEUE]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def flags : MPI_Aint = struct._2
      def flags_=(value: MPI_Aint): Unit = !struct.at2 = value

  opaque type _MSMPI_LOCK_QUEUE = CStruct2[Ptr[Byte], MPI_Aint]
  object _MSMPI_LOCK_QUEUE:
    given _tag: Tag[_MSMPI_LOCK_QUEUE] = Tag.materializeCStruct2Tag[Ptr[Byte], MPI_Aint]
    def apply()(using Zone): Ptr[_MSMPI_LOCK_QUEUE] = scala.scalanative.unsafe.alloc[_MSMPI_LOCK_QUEUE](1)
    def apply(next : Ptr[_MSMPI_LOCK_QUEUE], flags : MPI_Aint)(using Zone): Ptr[_MSMPI_LOCK_QUEUE] = 
      val ____ptr = apply()
      (!____ptr).next = next
      (!____ptr).flags = flags
      ____ptr
    extension (struct: _MSMPI_LOCK_QUEUE)
      def next : Ptr[_MSMPI_LOCK_QUEUE] = struct._1.asInstanceOf[Ptr[_MSMPI_LOCK_QUEUE]]
      def next_=(value: Ptr[_MSMPI_LOCK_QUEUE]): Unit = !struct.at1 = value.asInstanceOf[Ptr[Byte]]
      def flags : MPI_Aint = struct._2
      def flags_=(value: MPI_Aint): Unit = !struct.at2 = value


@extern
private[mpi] object extern_functions:
  import _root_.mpi.aliases.*
  import _root_.mpi.structs.*
  def MPIR_Dup_fn(oldcomm : MPI_Comm, keyval : CInt, extra_state : Ptr[Byte], attribute_val_in : Ptr[Byte], attribute_val_out : Ptr[Byte], flag : Ptr[CInt]): CInt = extern

  def MPI_Abort(comm : MPI_Comm, errorcode : CInt): CInt = extern

  def MPI_Accumulate(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, op : MPI_Op, win : MPI_Win): CInt = extern

  def MPI_Add_error_class(errorclass : Ptr[CInt]): CInt = extern

  def MPI_Add_error_code(errorclass : CInt, errorcode : Ptr[CInt]): CInt = extern

  def MPI_Add_error_string(errorcode : CInt, string : CString): CInt = extern

  def MPI_Address(location : Ptr[Byte], address : Ptr[MPI_Aint]): CInt = extern

  def MPI_Aint_add(base : MPI_Aint, disp : MPI_Aint): MPI_Aint = extern

  def MPI_Aint_diff(base : MPI_Aint, disp : MPI_Aint): MPI_Aint = extern

  def MPI_Allgather(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, comm : MPI_Comm): CInt = extern

  def MPI_Allgatherv(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], displs : Ptr[CInt], recvtype : MPI_Datatype, comm : MPI_Comm): CInt = extern

  def MPI_Alloc_mem(size : MPI_Aint, info : MPI_Info, baseptr : Ptr[Byte]): CInt = extern

  def MPI_Allreduce(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm): CInt = extern

  def MPI_Alltoall(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, comm : MPI_Comm): CInt = extern

  def MPI_Alltoallv(sendbuf : Ptr[Byte], sendcounts : Ptr[CInt], sdispls : Ptr[CInt], sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], rdispls : Ptr[CInt], recvtype : MPI_Datatype, comm : MPI_Comm): CInt = extern

  def MPI_Alltoallw(sendbuf : Ptr[Byte], sendcounts : Ptr[CInt], sdispls : Ptr[CInt], sendtypes : Ptr[MPI_Datatype], recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], rdispls : Ptr[CInt], recvtypes : Ptr[MPI_Datatype], comm : MPI_Comm): CInt = extern

  def MPI_Attr_delete(comm : MPI_Comm, keyval : CInt): CInt = extern

  def MPI_Attr_get(comm : MPI_Comm, keyval : CInt, attribute_val : Ptr[Byte], flag : Ptr[CInt]): CInt = extern

  def MPI_Attr_put(comm : MPI_Comm, keyval : CInt, attribute_val : Ptr[Byte]): CInt = extern

  def MPI_Barrier(comm : MPI_Comm): CInt = extern

  def MPI_Bcast(buffer : Ptr[Byte], count : CInt, datatype : MPI_Datatype, root : CInt, comm : MPI_Comm): CInt = extern

  def MPI_Bsend(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm): CInt = extern

  def MPI_Bsend_init(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Buffer_attach(buffer : Ptr[Byte], size : CInt): CInt = extern

  def MPI_Buffer_detach(buffer_addr : Ptr[Byte], size : Ptr[CInt]): CInt = extern

  def MPI_Cancel(request : Ptr[MPI_Request]): CInt = extern

  def MPI_Cart_coords(comm : MPI_Comm, rank : CInt, maxdims : CInt, coords : Ptr[CInt]): CInt = extern

  def MPI_Cart_create(comm_old : MPI_Comm, ndims : CInt, dims : Ptr[CInt], periods : Ptr[CInt], reorder : CInt, comm_cart : Ptr[MPI_Comm]): CInt = extern

  def MPI_Cart_get(comm : MPI_Comm, maxdims : CInt, dims : Ptr[CInt], periods : Ptr[CInt], coords : Ptr[CInt]): CInt = extern

  def MPI_Cart_map(comm : MPI_Comm, ndims : CInt, dims : Ptr[CInt], periods : Ptr[CInt], newrank : Ptr[CInt]): CInt = extern

  def MPI_Cart_rank(comm : MPI_Comm, coords : Ptr[CInt], rank : Ptr[CInt]): CInt = extern

  def MPI_Cart_shift(comm : MPI_Comm, direction : CInt, disp : CInt, rank_source : Ptr[CInt], rank_dest : Ptr[CInt]): CInt = extern

  def MPI_Cart_sub(comm : MPI_Comm, remain_dims : Ptr[CInt], newcomm : Ptr[MPI_Comm]): CInt = extern

  def MPI_Cartdim_get(comm : MPI_Comm, ndims : Ptr[CInt]): CInt = extern

  def MPI_Close_port(port_name : CString): CInt = extern

  def MPI_Comm_accept(port_name : CString, info : MPI_Info, root : CInt, comm : MPI_Comm, newcomm : Ptr[MPI_Comm]): CInt = extern

  def MPI_Comm_call_errhandler(comm : MPI_Comm, errorcode : CInt): CInt = extern

  def MPI_Comm_compare(comm1 : MPI_Comm, comm2 : MPI_Comm, result : Ptr[CInt]): CInt = extern

  def MPI_Comm_connect(port_name : CString, info : MPI_Info, root : CInt, comm : MPI_Comm, newcomm : Ptr[MPI_Comm]): CInt = extern

  def MPI_Comm_create(comm : MPI_Comm, group : MPI_Group, newcomm : Ptr[MPI_Comm]): CInt = extern

  def MPI_Comm_create_errhandler(function : CFuncPtr2[Ptr[MPI_Comm], Ptr[CInt], Unit], errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def MPI_Comm_create_keyval(comm_copy_attr_fn : CFuncPtr6[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt], comm_delete_attr_fn : CFuncPtr4[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], CInt], comm_keyval : Ptr[CInt], extra_state : Ptr[Byte]): CInt = extern

  def MPI_Comm_delete_attr(comm : MPI_Comm, comm_keyval : CInt): CInt = extern

  def MPI_Comm_disconnect(comm : Ptr[MPI_Comm]): CInt = extern

  def MPI_Comm_dup(comm : MPI_Comm, newcomm : Ptr[MPI_Comm]): CInt = extern

  def MPI_Comm_free(comm : Ptr[MPI_Comm]): CInt = extern

  def MPI_Comm_free_keyval(comm_keyval : Ptr[CInt]): CInt = extern

  def MPI_Comm_get_attr(comm : MPI_Comm, comm_keyval : CInt, attribute_val : Ptr[Byte], flag : Ptr[CInt]): CInt = extern

  def MPI_Comm_get_errhandler(comm : MPI_Comm, errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def MPI_Comm_get_name(comm : MPI_Comm, comm_name : CString, resultlen : Ptr[CInt]): CInt = extern

  def MPI_Comm_get_parent(parent : Ptr[MPI_Comm]): CInt = extern

  def MPI_Comm_group(comm : MPI_Comm, group : Ptr[MPI_Group]): CInt = extern

  def MPI_Comm_join(fd : CInt, intercomm : Ptr[MPI_Comm]): CInt = extern

  def MPI_Comm_rank(comm : MPI_Comm, rank : Ptr[CInt]): CInt = extern

  def MPI_Comm_remote_group(comm : MPI_Comm, group : Ptr[MPI_Group]): CInt = extern

  def MPI_Comm_remote_size(comm : MPI_Comm, size : Ptr[CInt]): CInt = extern

  def MPI_Comm_set_attr(comm : MPI_Comm, comm_keyval : CInt, attribute_val : Ptr[Byte]): CInt = extern

  def MPI_Comm_set_errhandler(comm : MPI_Comm, errhandler : MPI_Errhandler): CInt = extern

  def MPI_Comm_set_name(comm : MPI_Comm, comm_name : CString): CInt = extern

  def MPI_Comm_size(comm : MPI_Comm, size : Ptr[CInt]): CInt = extern

  def MPI_Comm_spawn(command : CString, argv : Ptr[CString], maxprocs : CInt, info : MPI_Info, root : CInt, comm : MPI_Comm, intercomm : Ptr[MPI_Comm], array_of_errcodes : Ptr[CInt]): CInt = extern

  def MPI_Comm_spawn_multiple(count : CInt, array_of_commands : Ptr[CString], array_of_argv : Ptr[Ptr[CString]], array_of_maxprocs : Ptr[CInt], array_of_info : Ptr[MPI_Info], root : CInt, comm : MPI_Comm, intercomm : Ptr[MPI_Comm], array_of_errcodes : Ptr[CInt]): CInt = extern

  def MPI_Comm_split(comm : MPI_Comm, color : CInt, key : CInt, newcomm : Ptr[MPI_Comm]): CInt = extern

  def MPI_Comm_split_type(comm : MPI_Comm, split_type : CInt, key : CInt, info : MPI_Info, newcomm : Ptr[MPI_Comm]): CInt = extern

  def MPI_Comm_test_inter(comm : MPI_Comm, flag : Ptr[CInt]): CInt = extern

  def MPI_Compare_and_swap(origin_addr : Ptr[Byte], compare_addr : Ptr[Byte], result_addr : Ptr[Byte], datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, win : MPI_Win): CInt = extern

  def MPI_Dims_create(nnodes : CInt, ndims : CInt, dims : Ptr[CInt]): CInt = extern

  def MPI_Dist_graph_create(comm_old : MPI_Comm, n : CInt, sources : Ptr[CInt], degrees : Ptr[CInt], destinations : Ptr[CInt], weights : Ptr[CInt], info : MPI_Info, reorder : CInt, comm_dist_graph : Ptr[MPI_Comm]): CInt = extern

  def MPI_Dist_graph_create_adjacent(comm_old : MPI_Comm, indegree : CInt, sources : Ptr[CInt], sourceweights : Ptr[CInt], outdegree : CInt, destinations : Ptr[CInt], destweights : Ptr[CInt], info : MPI_Info, reorder : CInt, comm_dist_graph : Ptr[MPI_Comm]): CInt = extern

  def MPI_Dist_graph_neighbors(comm : MPI_Comm, maxindegree : CInt, sources : Ptr[CInt], sourceweights : Ptr[CInt], maxoutdegree : CInt, destinations : Ptr[CInt], destweights : Ptr[CInt]): CInt = extern

  def MPI_Dist_graph_neighbors_count(comm : MPI_Comm, indegree : Ptr[CInt], outdegree : Ptr[CInt], weighted : Ptr[CInt]): CInt = extern

  def MPI_Errhandler_create(function : CFuncPtr2[Ptr[MPI_Comm], Ptr[CInt], Unit], errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def MPI_Errhandler_free(errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def MPI_Errhandler_get(comm : MPI_Comm, errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def MPI_Errhandler_set(comm : MPI_Comm, errhandler : MPI_Errhandler): CInt = extern

  def MPI_Error_class(errorcode : CInt, errorclass : Ptr[CInt]): CInt = extern

  def MPI_Error_string(errorcode : CInt, string : CString, resultlen : Ptr[CInt]): CInt = extern

  def MPI_Exscan(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm): CInt = extern

  def MPI_Fetch_and_op(origin_addr : Ptr[Byte], result_addr : Ptr[Byte], datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, op : MPI_Op, win : MPI_Win): CInt = extern

  def MPI_File_c2f(file : MPI_File): MPI_Fint = extern

  def MPI_File_call_errhandler(file : MPI_File, errorcode : CInt): CInt = extern

  def MPI_File_close(fh : Ptr[MPI_File]): CInt = extern

  def MPI_File_create_errhandler(function : CFuncPtr2[Ptr[MPI_File], Ptr[CInt], Unit], errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def MPI_File_delete(filename : CString, info : MPI_Info): CInt = extern

  def MPI_File_f2c(file : MPI_Fint): MPI_File = extern

  def MPI_File_get_amode(fh : MPI_File, amode : Ptr[CInt]): CInt = extern

  def MPI_File_get_atomicity(fh : MPI_File, flag : Ptr[CInt]): CInt = extern

  def MPI_File_get_byte_offset(fh : MPI_File, offset : MPI_Offset, disp : Ptr[MPI_Offset]): CInt = extern

  def MPI_File_get_errhandler(file : MPI_File, errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def MPI_File_get_group(fh : MPI_File, group : Ptr[MPI_Group]): CInt = extern

  def MPI_File_get_info(fh : MPI_File, info_used : Ptr[MPI_Info]): CInt = extern

  def MPI_File_get_position(fh : MPI_File, offset : Ptr[MPI_Offset]): CInt = extern

  def MPI_File_get_position_shared(fh : MPI_File, offset : Ptr[MPI_Offset]): CInt = extern

  def MPI_File_get_size(fh : MPI_File, size : Ptr[MPI_Offset]): CInt = extern

  def MPI_File_get_type_extent(fh : MPI_File, datatype : MPI_Datatype, extent : Ptr[MPI_Aint]): CInt = extern

  def MPI_File_get_view(fh : MPI_File, disp : Ptr[MPI_Offset], etype : Ptr[MPI_Datatype], filetype : Ptr[MPI_Datatype], datarep : CString): CInt = extern

  def MPI_File_iread(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, request : Ptr[MPI_Request]): CInt = extern

  def MPI_File_iread_at(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, request : Ptr[MPI_Request]): CInt = extern

  def MPI_File_iread_shared(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, request : Ptr[MPI_Request]): CInt = extern

  def MPI_File_iwrite(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, request : Ptr[MPI_Request]): CInt = extern

  def MPI_File_iwrite_at(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, request : Ptr[MPI_Request]): CInt = extern

  def MPI_File_iwrite_shared(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, request : Ptr[MPI_Request]): CInt = extern

  def MPI_File_open(comm : MPI_Comm, filename : CString, amode : CInt, info : MPI_Info, fh : Ptr[MPI_File]): CInt = extern

  def MPI_File_preallocate(fh : MPI_File, size : MPI_Offset): CInt = extern

  def MPI_File_read(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_read_all(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_read_all_begin(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype): CInt = extern

  def MPI_File_read_all_end(fh : MPI_File, buf : Ptr[Byte], status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_read_at(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_read_at_all(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_read_at_all_begin(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype): CInt = extern

  def MPI_File_read_at_all_end(fh : MPI_File, buf : Ptr[Byte], status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_read_ordered(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_read_ordered_begin(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype): CInt = extern

  def MPI_File_read_ordered_end(fh : MPI_File, buf : Ptr[Byte], status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_read_shared(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_seek(fh : MPI_File, offset : MPI_Offset, whence : CInt): CInt = extern

  def MPI_File_seek_shared(fh : MPI_File, offset : MPI_Offset, whence : CInt): CInt = extern

  def MPI_File_set_atomicity(fh : MPI_File, flag : CInt): CInt = extern

  def MPI_File_set_errhandler(file : MPI_File, errhandler : MPI_Errhandler): CInt = extern

  def MPI_File_set_info(fh : MPI_File, info : MPI_Info): CInt = extern

  def MPI_File_set_size(fh : MPI_File, size : MPI_Offset): CInt = extern

  def MPI_File_set_view(fh : MPI_File, disp : MPI_Offset, etype : MPI_Datatype, filetype : MPI_Datatype, datarep : CString, info : MPI_Info): CInt = extern

  def MPI_File_sync(fh : MPI_File): CInt = extern

  def MPI_File_write(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_write_all(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_write_all_begin(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype): CInt = extern

  def MPI_File_write_all_end(fh : MPI_File, buf : Ptr[Byte], status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_write_at(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_write_at_all(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_write_at_all_begin(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype): CInt = extern

  def MPI_File_write_at_all_end(fh : MPI_File, buf : Ptr[Byte], status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_write_ordered(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_write_ordered_begin(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype): CInt = extern

  def MPI_File_write_ordered_end(fh : MPI_File, buf : Ptr[Byte], status : Ptr[MPI_Status]): CInt = extern

  def MPI_File_write_shared(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def MPI_Finalize(): CInt = extern

  def MPI_Finalized(flag : Ptr[CInt]): CInt = extern

  def MPI_Free_mem(base : Ptr[Byte]): CInt = extern

  def MPI_Gather(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm): CInt = extern

  def MPI_Gatherv(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], displs : Ptr[CInt], recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm): CInt = extern

  def MPI_Get(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, win : MPI_Win): CInt = extern

  def MPI_Get_accumulate(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, result_addr : Ptr[Byte], result_count : CInt, result_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, op : MPI_Op, win : MPI_Win): CInt = extern

  def MPI_Get_address(location : Ptr[Byte], address : Ptr[MPI_Aint]): CInt = extern

  def MPI_Get_count(status : Ptr[MPI_Status], datatype : MPI_Datatype, count : Ptr[CInt]): CInt = extern

  def MPI_Get_elements(status : Ptr[MPI_Status], datatype : MPI_Datatype, count : Ptr[CInt]): CInt = extern

  def MPI_Get_elements_x(status : Ptr[MPI_Status], datatype : MPI_Datatype, count : Ptr[MPI_Count]): CInt = extern

  def MPI_Get_library_version(version : CString, resultlen : Ptr[CInt]): CInt = extern

  def MPI_Get_processor_name(name : CString, resultlen : Ptr[CInt]): CInt = extern

  def MPI_Get_version(version : Ptr[CInt], subversion : Ptr[CInt]): CInt = extern

  def MPI_Graph_create(comm_old : MPI_Comm, nnodes : CInt, index : Ptr[CInt], edges : Ptr[CInt], reorder : CInt, comm_graph : Ptr[MPI_Comm]): CInt = extern

  def MPI_Graph_get(comm : MPI_Comm, maxindex : CInt, maxedges : CInt, index : Ptr[CInt], edges : Ptr[CInt]): CInt = extern

  def MPI_Graph_map(comm : MPI_Comm, nnodes : CInt, index : Ptr[CInt], edges : Ptr[CInt], newrank : Ptr[CInt]): CInt = extern

  def MPI_Graph_neighbors(comm : MPI_Comm, rank : CInt, maxneighbors : CInt, neighbors : Ptr[CInt]): CInt = extern

  def MPI_Graph_neighbors_count(comm : MPI_Comm, rank : CInt, nneighbors : Ptr[CInt]): CInt = extern

  def MPI_Graphdims_get(comm : MPI_Comm, nnodes : Ptr[CInt], nedges : Ptr[CInt]): CInt = extern

  def MPI_Grequest_complete(request : MPI_Request): CInt = extern

  def MPI_Grequest_start(query_fn : CFuncPtr2[Ptr[Byte], Ptr[MPI_Status], CInt], free_fn : CFuncPtr1[Ptr[Byte], CInt], cancel_fn : CFuncPtr2[Ptr[Byte], CInt, CInt], extra_state : Ptr[Byte], request : Ptr[MPI_Request]): CInt = extern

  def MPI_Group_compare(group1 : MPI_Group, group2 : MPI_Group, result : Ptr[CInt]): CInt = extern

  def MPI_Group_difference(group1 : MPI_Group, group2 : MPI_Group, newgroup : Ptr[MPI_Group]): CInt = extern

  def MPI_Group_excl(group : MPI_Group, n : CInt, ranks : Ptr[CInt], newgroup : Ptr[MPI_Group]): CInt = extern

  def MPI_Group_free(group : Ptr[MPI_Group]): CInt = extern

  def MPI_Group_incl(group : MPI_Group, n : CInt, ranks : Ptr[CInt], newgroup : Ptr[MPI_Group]): CInt = extern

  def MPI_Group_intersection(group1 : MPI_Group, group2 : MPI_Group, newgroup : Ptr[MPI_Group]): CInt = extern

  def MPI_Group_range_excl(group : MPI_Group, n : CInt, ranges : Ptr[CArray[CInt, Nat._3]], newgroup : Ptr[MPI_Group]): CInt = extern

  def MPI_Group_range_incl(group : MPI_Group, n : CInt, ranges : Ptr[CArray[CInt, Nat._3]], newgroup : Ptr[MPI_Group]): CInt = extern

  def MPI_Group_rank(group : MPI_Group, rank : Ptr[CInt]): CInt = extern

  def MPI_Group_size(group : MPI_Group, size : Ptr[CInt]): CInt = extern

  def MPI_Group_translate_ranks(group1 : MPI_Group, n : CInt, ranks1 : Ptr[CInt], group2 : MPI_Group, ranks2 : Ptr[CInt]): CInt = extern

  def MPI_Group_union(group1 : MPI_Group, group2 : MPI_Group, newgroup : Ptr[MPI_Group]): CInt = extern

  def MPI_Iallgather(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Iallgatherv(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], displs : Ptr[CInt], recvtype : MPI_Datatype, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Iallreduce(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Ialltoall(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Ialltoallv(sendbuf : Ptr[Byte], sendcounts : Ptr[CInt], sdispls : Ptr[CInt], sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], rdispls : Ptr[CInt], recvtype : MPI_Datatype, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Ialltoallw(sendbuf : Ptr[Byte], sendcounts : Ptr[CInt], sdispls : Ptr[CInt], sendtypes : Ptr[MPI_Datatype], recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], rdispls : Ptr[CInt], recvtypes : Ptr[MPI_Datatype], comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Ibarrier(comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Ibcast(buffer : Ptr[Byte], count : CInt, datatype : MPI_Datatype, root : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Ibsend(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Iexscan(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Igather(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Igatherv(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], displs : Ptr[CInt], recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Improbe(source : CInt, tag : CInt, comm : MPI_Comm, flag : Ptr[CInt], message : Ptr[MPI_Message], status : Ptr[MPI_Status]): CInt = extern

  def MPI_Imrecv(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, message : Ptr[MPI_Message], request : Ptr[MPI_Request]): CInt = extern

  def MPI_Info_create(info : Ptr[MPI_Info]): CInt = extern

  def MPI_Info_delete(info : MPI_Info, key : CString): CInt = extern

  def MPI_Info_dup(info : MPI_Info, newinfo : Ptr[MPI_Info]): CInt = extern

  def MPI_Info_free(info : Ptr[MPI_Info]): CInt = extern

  def MPI_Info_get(info : MPI_Info, key : CString, valuelen : CInt, value : CString, flag : Ptr[CInt]): CInt = extern

  def MPI_Info_get_nkeys(info : MPI_Info, nkeys : Ptr[CInt]): CInt = extern

  def MPI_Info_get_nthkey(info : MPI_Info, n : CInt, key : CString): CInt = extern

  def MPI_Info_get_valuelen(info : MPI_Info, key : CString, valuelen : Ptr[CInt], flag : Ptr[CInt]): CInt = extern

  def MPI_Info_set(info : MPI_Info, key : CString, value : CString): CInt = extern

  def MPI_Init(argc : Ptr[CInt], argv : Ptr[Ptr[CString]]): CInt = extern

  def MPI_Init_thread(argc : Ptr[CInt], argv : Ptr[Ptr[CString]], required : CInt, provided : Ptr[CInt]): CInt = extern

  def MPI_Initialized(flag : Ptr[CInt]): CInt = extern

  def MPI_Intercomm_create(local_comm : MPI_Comm, local_leader : CInt, peer_comm : MPI_Comm, remote_leader : CInt, tag : CInt, newintercomm : Ptr[MPI_Comm]): CInt = extern

  def MPI_Intercomm_merge(intercomm : MPI_Comm, high : CInt, newintracomm : Ptr[MPI_Comm]): CInt = extern

  def MPI_Iprobe(source : CInt, tag : CInt, comm : MPI_Comm, flag : Ptr[CInt], status : Ptr[MPI_Status]): CInt = extern

  def MPI_Irecv(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, source : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Ireduce(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, root : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Ireduce_scatter(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Ireduce_scatter_block(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], recvcount : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Irsend(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Is_thread_main(flag : Ptr[CInt]): CInt = extern

  def MPI_Iscan(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Iscatter(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Iscatterv(sendbuf : Ptr[Byte], sendcounts : Ptr[CInt], displs : Ptr[CInt], sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Isend(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Issend(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Keyval_create(copy_fn : CFuncPtr6[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt], delete_fn : CFuncPtr4[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], CInt], keyval : Ptr[CInt], extra_state : Ptr[Byte]): CInt = extern

  def MPI_Keyval_free(keyval : Ptr[CInt]): CInt = extern

  def MPI_Lookup_name(service_name : CString, info : MPI_Info, port_name : CString): CInt = extern

  def MPI_Mprobe(source : CInt, tag : CInt, comm : MPI_Comm, message : Ptr[MPI_Message], status : Ptr[MPI_Status]): CInt = extern

  def MPI_Mrecv(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, message : Ptr[MPI_Message], status : Ptr[MPI_Status]): CInt = extern

  def MPI_Op_commutative(op : MPI_Op, commute : Ptr[CInt]): CInt = extern

  def MPI_Op_create(user_fn : CFuncPtr4[Ptr[Byte], Ptr[Byte], Ptr[CInt], Ptr[MPI_Datatype], Unit], commute : CInt, op : Ptr[MPI_Op]): CInt = extern

  def MPI_Op_free(op : Ptr[MPI_Op]): CInt = extern

  def MPI_Open_port(info : MPI_Info, port_name : CString): CInt = extern

  def MPI_Pack(inbuf : Ptr[Byte], incount : CInt, datatype : MPI_Datatype, outbuf : Ptr[Byte], outsize : CInt, position : Ptr[CInt], comm : MPI_Comm): CInt = extern

  def MPI_Pack_external(datarep : CString, inbuf : Ptr[Byte], incount : CInt, datatype : MPI_Datatype, outbuf : Ptr[Byte], outsize : MPI_Aint, position : Ptr[MPI_Aint]): CInt = extern

  def MPI_Pack_external_size(datarep : CString, incount : CInt, datatype : MPI_Datatype, size : Ptr[MPI_Aint]): CInt = extern

  def MPI_Pack_size(incount : CInt, datatype : MPI_Datatype, comm : MPI_Comm, size : Ptr[CInt]): CInt = extern

  def MPI_Pcontrol(level : CInt, rest: Any*): CInt = extern

  def MPI_Probe(source : CInt, tag : CInt, comm : MPI_Comm, status : Ptr[MPI_Status]): CInt = extern

  def MPI_Publish_name(service_name : CString, info : MPI_Info, port_name : CString): CInt = extern

  def MPI_Put(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, win : MPI_Win): CInt = extern

  def MPI_Query_thread(provided : Ptr[CInt]): CInt = extern

  def MPI_Raccumulate(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, op : MPI_Op, win : MPI_Win, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Recv(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, source : CInt, tag : CInt, comm : MPI_Comm, status : Ptr[MPI_Status]): CInt = extern

  def MPI_Recv_init(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, source : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Reduce(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, root : CInt, comm : MPI_Comm): CInt = extern

  def MPI_Reduce_local(inbuf : Ptr[Byte], inoutbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op): CInt = extern

  def MPI_Reduce_scatter(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm): CInt = extern

  def MPI_Reduce_scatter_block(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], recvcount : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm): CInt = extern

  def MPI_Register_datarep(datarep : CString, read_conversion_fn : CFuncPtr6[Ptr[Byte], MPI_Datatype, CInt, Ptr[Byte], MPI_Offset, Ptr[Byte], CInt], write_conversion_fn : CFuncPtr6[Ptr[Byte], MPI_Datatype, CInt, Ptr[Byte], MPI_Offset, Ptr[Byte], CInt], dtype_file_extent_fn : CFuncPtr3[MPI_Datatype, Ptr[MPI_Aint], Ptr[Byte], CInt], extra_state : Ptr[Byte]): CInt = extern

  def MPI_Request_free(request : Ptr[MPI_Request]): CInt = extern

  def MPI_Request_get_status(request : MPI_Request, flag : Ptr[CInt], status : Ptr[MPI_Status]): CInt = extern

  def MPI_Rget(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, win : MPI_Win, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Rget_accumulate(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, result_addr : Ptr[Byte], result_count : CInt, result_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, op : MPI_Op, win : MPI_Win, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Rput(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, win : MPI_Win, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Rsend(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm): CInt = extern

  def MPI_Rsend_init(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Scan(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm): CInt = extern

  def MPI_Scatter(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm): CInt = extern

  def MPI_Scatterv(sendbuf : Ptr[Byte], sendcounts : Ptr[CInt], displs : Ptr[CInt], sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm): CInt = extern

  def MPI_Send(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm): CInt = extern

  def MPI_Send_init(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Sendrecv(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, dest : CInt, sendtag : CInt, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, source : CInt, recvtag : CInt, comm : MPI_Comm, status : Ptr[MPI_Status]): CInt = extern

  def MPI_Sendrecv_replace(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, sendtag : CInt, source : CInt, recvtag : CInt, comm : MPI_Comm, status : Ptr[MPI_Status]): CInt = extern

  def MPI_Ssend(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm): CInt = extern

  def MPI_Ssend_init(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def MPI_Start(request : Ptr[MPI_Request]): CInt = extern

  def MPI_Startall(count : CInt, array_of_requests : Ptr[MPI_Request]): CInt = extern

  def MPI_Status_c2f(c_status : Ptr[MPI_Status], f_status : Ptr[MPI_Fint]): CInt = extern

  def MPI_Status_f2c(f_status : Ptr[MPI_Fint], c_status : Ptr[MPI_Status]): CInt = extern

  def MPI_Status_set_cancelled(status : Ptr[MPI_Status], flag : CInt): CInt = extern

  def MPI_Status_set_elements(status : Ptr[MPI_Status], datatype : MPI_Datatype, count : CInt): CInt = extern

  def MPI_Status_set_elements_x(status : Ptr[MPI_Status], datatype : MPI_Datatype, count : MPI_Count): CInt = extern

  def MPI_Test(request : Ptr[MPI_Request], flag : Ptr[CInt], status : Ptr[MPI_Status]): CInt = extern

  def MPI_Test_cancelled(status : Ptr[MPI_Status], flag : Ptr[CInt]): CInt = extern

  def MPI_Testall(count : CInt, array_of_requests : Ptr[MPI_Request], flag : Ptr[CInt], array_of_statuses : Ptr[MPI_Status]): CInt = extern

  def MPI_Testany(count : CInt, array_of_requests : Ptr[MPI_Request], index : Ptr[CInt], flag : Ptr[CInt], status : Ptr[MPI_Status]): CInt = extern

  def MPI_Testsome(incount : CInt, array_of_requests : Ptr[MPI_Request], outcount : Ptr[CInt], array_of_indices : Ptr[CInt], array_of_statuses : Ptr[MPI_Status]): CInt = extern

  def MPI_Topo_test(comm : MPI_Comm, status : Ptr[CInt]): CInt = extern

  def MPI_Type_commit(datatype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_contiguous(count : CInt, oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_create_darray(size : CInt, rank : CInt, ndims : CInt, array_of_gsizes : Ptr[CInt], array_of_distribs : Ptr[CInt], array_of_dargs : Ptr[CInt], array_of_psizes : Ptr[CInt], order : CInt, oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_create_f90_complex(p : CInt, r : CInt, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_create_f90_integer(r : CInt, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_create_f90_real(p : CInt, r : CInt, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_create_hindexed(count : CInt, array_of_blocklengths : Ptr[CInt], array_of_displacements : Ptr[MPI_Aint], oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_create_hindexed_block(count : CInt, blocklength : CInt, array_of_displacements : Ptr[MPI_Aint], oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_create_hvector(count : CInt, blocklength : CInt, stride : MPI_Aint, oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_create_indexed_block(count : CInt, blocklength : CInt, array_of_displacements : Ptr[CInt], oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_create_keyval(type_copy_attr_fn : CFuncPtr6[MPI_Datatype, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt], type_delete_attr_fn : CFuncPtr4[MPI_Datatype, CInt, Ptr[Byte], Ptr[Byte], CInt], type_keyval : Ptr[CInt], extra_state : Ptr[Byte]): CInt = extern

  def MPI_Type_create_resized(oldtype : MPI_Datatype, lb : MPI_Aint, extent : MPI_Aint, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_create_struct(count : CInt, array_of_blocklengths : Ptr[CInt], array_of_displacements : Ptr[MPI_Aint], array_of_types : Ptr[MPI_Datatype], newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_create_subarray(ndims : CInt, array_of_sizes : Ptr[CInt], array_of_subsizes : Ptr[CInt], array_of_starts : Ptr[CInt], order : CInt, oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_delete_attr(`type` : MPI_Datatype, type_keyval : CInt): CInt = extern

  def MPI_Type_dup(oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_extent(datatype : MPI_Datatype, extent : Ptr[MPI_Aint]): CInt = extern

  def MPI_Type_free(datatype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_free_keyval(type_keyval : Ptr[CInt]): CInt = extern

  def MPI_Type_get_attr(`type` : MPI_Datatype, type_keyval : CInt, attribute_val : Ptr[Byte], flag : Ptr[CInt]): CInt = extern

  def MPI_Type_get_contents(datatype : MPI_Datatype, max_integers : CInt, max_addresses : CInt, max_datatypes : CInt, array_of_integers : Ptr[CInt], array_of_addresses : Ptr[MPI_Aint], array_of_datatypes : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_get_envelope(datatype : MPI_Datatype, num_integers : Ptr[CInt], num_addresses : Ptr[CInt], num_datatypes : Ptr[CInt], combiner : Ptr[CInt]): CInt = extern

  def MPI_Type_get_extent(datatype : MPI_Datatype, lb : Ptr[MPI_Aint], extent : Ptr[MPI_Aint]): CInt = extern

  def MPI_Type_get_extent_x(datatype : MPI_Datatype, lb : Ptr[MPI_Count], extent : Ptr[MPI_Count]): CInt = extern

  def MPI_Type_get_name(datatype : MPI_Datatype, type_name : CString, resultlen : Ptr[CInt]): CInt = extern

  def MPI_Type_get_true_extent(datatype : MPI_Datatype, true_lb : Ptr[MPI_Aint], true_extent : Ptr[MPI_Aint]): CInt = extern

  def MPI_Type_get_true_extent_x(datatype : MPI_Datatype, true_lb : Ptr[MPI_Count], true_extent : Ptr[MPI_Count]): CInt = extern

  def MPI_Type_hindexed(count : CInt, array_of_blocklengths : Ptr[CInt], array_of_displacements : Ptr[MPI_Aint], oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_hvector(count : CInt, blocklength : CInt, stride : MPI_Aint, oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_indexed(count : CInt, array_of_blocklengths : Ptr[CInt], array_of_displacements : Ptr[CInt], oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_lb(datatype : MPI_Datatype, displacement : Ptr[MPI_Aint]): CInt = extern

  def MPI_Type_match_size(typeclass : CInt, size : CInt, datatype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_set_attr(`type` : MPI_Datatype, type_keyval : CInt, attribute_val : Ptr[Byte]): CInt = extern

  def MPI_Type_set_name(datatype : MPI_Datatype, type_name : CString): CInt = extern

  def MPI_Type_size(datatype : MPI_Datatype, size : Ptr[CInt]): CInt = extern

  def MPI_Type_size_x(datatype : MPI_Datatype, size : Ptr[MPI_Count]): CInt = extern

  def MPI_Type_struct(count : CInt, array_of_blocklengths : Ptr[CInt], array_of_displacements : Ptr[MPI_Aint], array_of_types : Ptr[MPI_Datatype], newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Type_ub(datatype : MPI_Datatype, displacement : Ptr[MPI_Aint]): CInt = extern

  def MPI_Type_vector(count : CInt, blocklength : CInt, stride : CInt, oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def MPI_Unpack(inbuf : Ptr[Byte], insize : CInt, position : Ptr[CInt], outbuf : Ptr[Byte], outcount : CInt, datatype : MPI_Datatype, comm : MPI_Comm): CInt = extern

  def MPI_Unpack_external(datarep : CString, inbuf : Ptr[Byte], insize : MPI_Aint, position : Ptr[MPI_Aint], outbuf : Ptr[Byte], outcount : CInt, datatype : MPI_Datatype): CInt = extern

  def MPI_Unpublish_name(service_name : CString, info : MPI_Info, port_name : CString): CInt = extern

  def MPI_Wait(request : Ptr[MPI_Request], status : Ptr[MPI_Status]): CInt = extern

  def MPI_Waitall(count : CInt, array_of_requests : Ptr[MPI_Request], array_of_statuses : Ptr[MPI_Status]): CInt = extern

  def MPI_Waitany(count : CInt, array_of_requests : Ptr[MPI_Request], index : Ptr[CInt], status : Ptr[MPI_Status]): CInt = extern

  def MPI_Waitsome(incount : CInt, array_of_requests : Ptr[MPI_Request], outcount : Ptr[CInt], array_of_indices : Ptr[CInt], array_of_statuses : Ptr[MPI_Status]): CInt = extern

  def MPI_Win_allocate(size : MPI_Aint, disp_unit : CInt, info : MPI_Info, comm : MPI_Comm, baseptr : Ptr[Byte], win : Ptr[MPI_Win]): CInt = extern

  def MPI_Win_allocate_shared(size : MPI_Aint, disp_unit : CInt, info : MPI_Info, comm : MPI_Comm, baseptr : Ptr[Byte], win : Ptr[MPI_Win]): CInt = extern

  def MPI_Win_attach(win : MPI_Win, base : Ptr[Byte], size : MPI_Aint): CInt = extern

  def MPI_Win_call_errhandler(win : MPI_Win, errorcode : CInt): CInt = extern

  def MPI_Win_complete(win : MPI_Win): CInt = extern

  def MPI_Win_create(base : Ptr[Byte], size : MPI_Aint, disp_unit : CInt, info : MPI_Info, comm : MPI_Comm, win : Ptr[MPI_Win]): CInt = extern

  def MPI_Win_create_dynamic(info : MPI_Info, comm : MPI_Comm, win : Ptr[MPI_Win]): CInt = extern

  def MPI_Win_create_errhandler(function : CFuncPtr2[Ptr[MPI_Win], Ptr[CInt], Unit], errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def MPI_Win_create_keyval(win_copy_attr_fn : CFuncPtr6[MPI_Win, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt], win_delete_attr_fn : CFuncPtr4[MPI_Win, CInt, Ptr[Byte], Ptr[Byte], CInt], win_keyval : Ptr[CInt], extra_state : Ptr[Byte]): CInt = extern

  def MPI_Win_delete_attr(win : MPI_Win, win_keyval : CInt): CInt = extern

  def MPI_Win_detach(win : MPI_Win, base : Ptr[Byte]): CInt = extern

  def MPI_Win_fence(assert : CInt, win : MPI_Win): CInt = extern

  def MPI_Win_flush(rank : CInt, win : MPI_Win): CInt = extern

  def MPI_Win_flush_all(win : MPI_Win): CInt = extern

  def MPI_Win_flush_local(rank : CInt, win : MPI_Win): CInt = extern

  def MPI_Win_flush_local_all(win : MPI_Win): CInt = extern

  def MPI_Win_free(win : Ptr[MPI_Win]): CInt = extern

  def MPI_Win_free_keyval(win_keyval : Ptr[CInt]): CInt = extern

  def MPI_Win_get_attr(win : MPI_Win, win_keyval : CInt, attribute_val : Ptr[Byte], flag : Ptr[CInt]): CInt = extern

  def MPI_Win_get_errhandler(win : MPI_Win, errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def MPI_Win_get_group(win : MPI_Win, group : Ptr[MPI_Group]): CInt = extern

  def MPI_Win_get_name(win : MPI_Win, win_name : CString, resultlen : Ptr[CInt]): CInt = extern

  def MPI_Win_lock(lock_type : CInt, rank : CInt, assert : CInt, win : MPI_Win): CInt = extern

  def MPI_Win_lock_all(assert : CInt, win : MPI_Win): CInt = extern

  def MPI_Win_post(group : MPI_Group, assert : CInt, win : MPI_Win): CInt = extern

  def MPI_Win_set_attr(win : MPI_Win, win_keyval : CInt, attribute_val : Ptr[Byte]): CInt = extern

  def MPI_Win_set_errhandler(win : MPI_Win, errhandler : MPI_Errhandler): CInt = extern

  def MPI_Win_set_name(win : MPI_Win, win_name : CString): CInt = extern

  def MPI_Win_shared_query(win : MPI_Win, rank : CInt, size : Ptr[MPI_Aint], disp_unit : Ptr[CInt], baseptr : Ptr[Byte]): CInt = extern

  def MPI_Win_start(group : MPI_Group, assert : CInt, win : MPI_Win): CInt = extern

  def MPI_Win_sync(win : MPI_Win): CInt = extern

  def MPI_Win_test(win : MPI_Win, flag : Ptr[CInt]): CInt = extern

  def MPI_Win_unlock(rank : CInt, win : MPI_Win): CInt = extern

  def MPI_Win_unlock_all(win : MPI_Win): CInt = extern

  def MPI_Win_wait(win : MPI_Win): CInt = extern

  def MPI_Wtick(): Double = extern

  def MPI_Wtime(): Double = extern

  def MSMPI_Queuelock_acquire(queue : Ptr[MSMPI_Lock_queue]): Unit = extern

  def MSMPI_Queuelock_release(queue : Ptr[MSMPI_Lock_queue]): Unit = extern

  def MSMPI_Request_set_apc(request : MPI_Request, callback_fn : CFuncPtr1[Ptr[MPI_Status], Unit], callback_status : Ptr[MPI_Status]): CInt = extern

  def MSMPI_Waitsome_interruptible(incount : CInt, array_of_requests : Ptr[MPI_Request], outcount : Ptr[CInt], array_of_indices : Ptr[CInt], array_of_statuses : Ptr[MPI_Status]): CInt = extern

  def PMPI_Abort(comm : MPI_Comm, errorcode : CInt): CInt = extern

  def PMPI_Accumulate(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, op : MPI_Op, win : MPI_Win): CInt = extern

  def PMPI_Add_error_class(errorclass : Ptr[CInt]): CInt = extern

  def PMPI_Add_error_code(errorclass : CInt, errorcode : Ptr[CInt]): CInt = extern

  def PMPI_Add_error_string(errorcode : CInt, string : CString): CInt = extern

  def PMPI_Address(location : Ptr[Byte], address : Ptr[MPI_Aint]): CInt = extern

  def PMPI_Aint_add(base : MPI_Aint, disp : MPI_Aint): MPI_Aint = extern

  def PMPI_Aint_diff(base : MPI_Aint, disp : MPI_Aint): MPI_Aint = extern

  def PMPI_Allgather(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, comm : MPI_Comm): CInt = extern

  def PMPI_Allgatherv(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], displs : Ptr[CInt], recvtype : MPI_Datatype, comm : MPI_Comm): CInt = extern

  def PMPI_Alloc_mem(size : MPI_Aint, info : MPI_Info, baseptr : Ptr[Byte]): CInt = extern

  def PMPI_Allreduce(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm): CInt = extern

  def PMPI_Alltoall(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, comm : MPI_Comm): CInt = extern

  def PMPI_Alltoallv(sendbuf : Ptr[Byte], sendcounts : Ptr[CInt], sdispls : Ptr[CInt], sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], rdispls : Ptr[CInt], recvtype : MPI_Datatype, comm : MPI_Comm): CInt = extern

  def PMPI_Alltoallw(sendbuf : Ptr[Byte], sendcounts : Ptr[CInt], sdispls : Ptr[CInt], sendtypes : Ptr[MPI_Datatype], recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], rdispls : Ptr[CInt], recvtypes : Ptr[MPI_Datatype], comm : MPI_Comm): CInt = extern

  def PMPI_Attr_delete(comm : MPI_Comm, keyval : CInt): CInt = extern

  def PMPI_Attr_get(comm : MPI_Comm, keyval : CInt, attribute_val : Ptr[Byte], flag : Ptr[CInt]): CInt = extern

  def PMPI_Attr_put(comm : MPI_Comm, keyval : CInt, attribute_val : Ptr[Byte]): CInt = extern

  def PMPI_Barrier(comm : MPI_Comm): CInt = extern

  def PMPI_Bcast(buffer : Ptr[Byte], count : CInt, datatype : MPI_Datatype, root : CInt, comm : MPI_Comm): CInt = extern

  def PMPI_Bsend(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm): CInt = extern

  def PMPI_Bsend_init(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Buffer_attach(buffer : Ptr[Byte], size : CInt): CInt = extern

  def PMPI_Buffer_detach(buffer_addr : Ptr[Byte], size : Ptr[CInt]): CInt = extern

  def PMPI_Cancel(request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Cart_coords(comm : MPI_Comm, rank : CInt, maxdims : CInt, coords : Ptr[CInt]): CInt = extern

  def PMPI_Cart_create(comm_old : MPI_Comm, ndims : CInt, dims : Ptr[CInt], periods : Ptr[CInt], reorder : CInt, comm_cart : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Cart_get(comm : MPI_Comm, maxdims : CInt, dims : Ptr[CInt], periods : Ptr[CInt], coords : Ptr[CInt]): CInt = extern

  def PMPI_Cart_map(comm : MPI_Comm, ndims : CInt, dims : Ptr[CInt], periods : Ptr[CInt], newrank : Ptr[CInt]): CInt = extern

  def PMPI_Cart_rank(comm : MPI_Comm, coords : Ptr[CInt], rank : Ptr[CInt]): CInt = extern

  def PMPI_Cart_shift(comm : MPI_Comm, direction : CInt, disp : CInt, rank_source : Ptr[CInt], rank_dest : Ptr[CInt]): CInt = extern

  def PMPI_Cart_sub(comm : MPI_Comm, remain_dims : Ptr[CInt], newcomm : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Cartdim_get(comm : MPI_Comm, ndims : Ptr[CInt]): CInt = extern

  def PMPI_Close_port(port_name : CString): CInt = extern

  def PMPI_Comm_accept(port_name : CString, info : MPI_Info, root : CInt, comm : MPI_Comm, newcomm : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Comm_call_errhandler(comm : MPI_Comm, errorcode : CInt): CInt = extern

  def PMPI_Comm_compare(comm1 : MPI_Comm, comm2 : MPI_Comm, result : Ptr[CInt]): CInt = extern

  def PMPI_Comm_connect(port_name : CString, info : MPI_Info, root : CInt, comm : MPI_Comm, newcomm : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Comm_create(comm : MPI_Comm, group : MPI_Group, newcomm : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Comm_create_errhandler(function : CFuncPtr2[Ptr[MPI_Comm], Ptr[CInt], Unit], errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def PMPI_Comm_create_keyval(comm_copy_attr_fn : CFuncPtr6[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt], comm_delete_attr_fn : CFuncPtr4[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], CInt], comm_keyval : Ptr[CInt], extra_state : Ptr[Byte]): CInt = extern

  def PMPI_Comm_delete_attr(comm : MPI_Comm, comm_keyval : CInt): CInt = extern

  def PMPI_Comm_disconnect(comm : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Comm_dup(comm : MPI_Comm, newcomm : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Comm_free(comm : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Comm_free_keyval(comm_keyval : Ptr[CInt]): CInt = extern

  def PMPI_Comm_get_attr(comm : MPI_Comm, comm_keyval : CInt, attribute_val : Ptr[Byte], flag : Ptr[CInt]): CInt = extern

  def PMPI_Comm_get_errhandler(comm : MPI_Comm, errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def PMPI_Comm_get_name(comm : MPI_Comm, comm_name : CString, resultlen : Ptr[CInt]): CInt = extern

  def PMPI_Comm_get_parent(parent : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Comm_group(comm : MPI_Comm, group : Ptr[MPI_Group]): CInt = extern

  def PMPI_Comm_join(fd : CInt, intercomm : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Comm_rank(comm : MPI_Comm, rank : Ptr[CInt]): CInt = extern

  def PMPI_Comm_remote_group(comm : MPI_Comm, group : Ptr[MPI_Group]): CInt = extern

  def PMPI_Comm_remote_size(comm : MPI_Comm, size : Ptr[CInt]): CInt = extern

  def PMPI_Comm_set_attr(comm : MPI_Comm, comm_keyval : CInt, attribute_val : Ptr[Byte]): CInt = extern

  def PMPI_Comm_set_errhandler(comm : MPI_Comm, errhandler : MPI_Errhandler): CInt = extern

  def PMPI_Comm_set_name(comm : MPI_Comm, comm_name : CString): CInt = extern

  def PMPI_Comm_size(comm : MPI_Comm, size : Ptr[CInt]): CInt = extern

  def PMPI_Comm_spawn(command : CString, argv : Ptr[CString], maxprocs : CInt, info : MPI_Info, root : CInt, comm : MPI_Comm, intercomm : Ptr[MPI_Comm], array_of_errcodes : Ptr[CInt]): CInt = extern

  def PMPI_Comm_spawn_multiple(count : CInt, array_of_commands : Ptr[CString], array_of_argv : Ptr[Ptr[CString]], array_of_maxprocs : Ptr[CInt], array_of_info : Ptr[MPI_Info], root : CInt, comm : MPI_Comm, intercomm : Ptr[MPI_Comm], array_of_errcodes : Ptr[CInt]): CInt = extern

  def PMPI_Comm_split(comm : MPI_Comm, color : CInt, key : CInt, newcomm : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Comm_split_type(comm : MPI_Comm, split_type : CInt, key : CInt, info : MPI_Info, newcomm : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Comm_test_inter(comm : MPI_Comm, flag : Ptr[CInt]): CInt = extern

  def PMPI_Compare_and_swap(origin_addr : Ptr[Byte], compare_addr : Ptr[Byte], result_addr : Ptr[Byte], datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, win : MPI_Win): CInt = extern

  def PMPI_Dims_create(nnodes : CInt, ndims : CInt, dims : Ptr[CInt]): CInt = extern

  def PMPI_Dist_graph_create(comm_old : MPI_Comm, n : CInt, sources : Ptr[CInt], degrees : Ptr[CInt], destinations : Ptr[CInt], weights : Ptr[CInt], info : MPI_Info, reorder : CInt, comm_dist_graph : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Dist_graph_create_adjacent(comm_old : MPI_Comm, indegree : CInt, sources : Ptr[CInt], sourceweights : Ptr[CInt], outdegree : CInt, destinations : Ptr[CInt], destweights : Ptr[CInt], info : MPI_Info, reorder : CInt, comm_dist_graph : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Dist_graph_neighbors(comm : MPI_Comm, maxindegree : CInt, sources : Ptr[CInt], sourceweights : Ptr[CInt], maxoutdegree : CInt, destinations : Ptr[CInt], destweights : Ptr[CInt]): CInt = extern

  def PMPI_Dist_graph_neighbors_count(comm : MPI_Comm, indegree : Ptr[CInt], outdegree : Ptr[CInt], weighted : Ptr[CInt]): CInt = extern

  def PMPI_Errhandler_create(function : CFuncPtr2[Ptr[MPI_Comm], Ptr[CInt], Unit], errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def PMPI_Errhandler_free(errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def PMPI_Errhandler_get(comm : MPI_Comm, errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def PMPI_Errhandler_set(comm : MPI_Comm, errhandler : MPI_Errhandler): CInt = extern

  def PMPI_Error_class(errorcode : CInt, errorclass : Ptr[CInt]): CInt = extern

  def PMPI_Error_string(errorcode : CInt, string : CString, resultlen : Ptr[CInt]): CInt = extern

  def PMPI_Exscan(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm): CInt = extern

  def PMPI_Fetch_and_op(origin_addr : Ptr[Byte], result_addr : Ptr[Byte], datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, op : MPI_Op, win : MPI_Win): CInt = extern

  def PMPI_File_c2f(file : MPI_File): MPI_Fint = extern

  def PMPI_File_call_errhandler(file : MPI_File, errorcode : CInt): CInt = extern

  def PMPI_File_close(fh : Ptr[MPI_File]): CInt = extern

  def PMPI_File_create_errhandler(function : CFuncPtr2[Ptr[MPI_File], Ptr[CInt], Unit], errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def PMPI_File_delete(filename : CString, info : MPI_Info): CInt = extern

  def PMPI_File_f2c(file : MPI_Fint): MPI_File = extern

  def PMPI_File_get_amode(fh : MPI_File, amode : Ptr[CInt]): CInt = extern

  def PMPI_File_get_atomicity(fh : MPI_File, flag : Ptr[CInt]): CInt = extern

  def PMPI_File_get_byte_offset(fh : MPI_File, offset : MPI_Offset, disp : Ptr[MPI_Offset]): CInt = extern

  def PMPI_File_get_errhandler(file : MPI_File, errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def PMPI_File_get_group(fh : MPI_File, group : Ptr[MPI_Group]): CInt = extern

  def PMPI_File_get_info(fh : MPI_File, info_used : Ptr[MPI_Info]): CInt = extern

  def PMPI_File_get_position(fh : MPI_File, offset : Ptr[MPI_Offset]): CInt = extern

  def PMPI_File_get_position_shared(fh : MPI_File, offset : Ptr[MPI_Offset]): CInt = extern

  def PMPI_File_get_size(fh : MPI_File, size : Ptr[MPI_Offset]): CInt = extern

  def PMPI_File_get_type_extent(fh : MPI_File, datatype : MPI_Datatype, extent : Ptr[MPI_Aint]): CInt = extern

  def PMPI_File_get_view(fh : MPI_File, disp : Ptr[MPI_Offset], etype : Ptr[MPI_Datatype], filetype : Ptr[MPI_Datatype], datarep : CString): CInt = extern

  def PMPI_File_iread(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_File_iread_at(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_File_iread_shared(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_File_iwrite(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_File_iwrite_at(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_File_iwrite_shared(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_File_open(comm : MPI_Comm, filename : CString, amode : CInt, info : MPI_Info, fh : Ptr[MPI_File]): CInt = extern

  def PMPI_File_preallocate(fh : MPI_File, size : MPI_Offset): CInt = extern

  def PMPI_File_read(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_read_all(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_read_all_begin(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype): CInt = extern

  def PMPI_File_read_all_end(fh : MPI_File, buf : Ptr[Byte], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_read_at(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_read_at_all(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_read_at_all_begin(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype): CInt = extern

  def PMPI_File_read_at_all_end(fh : MPI_File, buf : Ptr[Byte], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_read_ordered(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_read_ordered_begin(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype): CInt = extern

  def PMPI_File_read_ordered_end(fh : MPI_File, buf : Ptr[Byte], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_read_shared(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_seek(fh : MPI_File, offset : MPI_Offset, whence : CInt): CInt = extern

  def PMPI_File_seek_shared(fh : MPI_File, offset : MPI_Offset, whence : CInt): CInt = extern

  def PMPI_File_set_atomicity(fh : MPI_File, flag : CInt): CInt = extern

  def PMPI_File_set_errhandler(file : MPI_File, errhandler : MPI_Errhandler): CInt = extern

  def PMPI_File_set_info(fh : MPI_File, info : MPI_Info): CInt = extern

  def PMPI_File_set_size(fh : MPI_File, size : MPI_Offset): CInt = extern

  def PMPI_File_set_view(fh : MPI_File, disp : MPI_Offset, etype : MPI_Datatype, filetype : MPI_Datatype, datarep : CString, info : MPI_Info): CInt = extern

  def PMPI_File_sync(fh : MPI_File): CInt = extern

  def PMPI_File_write(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_write_all(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_write_all_begin(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype): CInt = extern

  def PMPI_File_write_all_end(fh : MPI_File, buf : Ptr[Byte], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_write_at(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_write_at_all(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_write_at_all_begin(fh : MPI_File, offset : MPI_Offset, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype): CInt = extern

  def PMPI_File_write_at_all_end(fh : MPI_File, buf : Ptr[Byte], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_write_ordered(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_write_ordered_begin(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype): CInt = extern

  def PMPI_File_write_ordered_end(fh : MPI_File, buf : Ptr[Byte], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_File_write_shared(fh : MPI_File, buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Finalize(): CInt = extern

  def PMPI_Finalized(flag : Ptr[CInt]): CInt = extern

  def PMPI_Free_mem(base : Ptr[Byte]): CInt = extern

  def PMPI_Gather(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm): CInt = extern

  def PMPI_Gatherv(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], displs : Ptr[CInt], recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm): CInt = extern

  def PMPI_Get(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, win : MPI_Win): CInt = extern

  def PMPI_Get_accumulate(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, result_addr : Ptr[Byte], result_count : CInt, result_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, op : MPI_Op, win : MPI_Win): CInt = extern

  def PMPI_Get_address(location : Ptr[Byte], address : Ptr[MPI_Aint]): CInt = extern

  def PMPI_Get_count(status : Ptr[MPI_Status], datatype : MPI_Datatype, count : Ptr[CInt]): CInt = extern

  def PMPI_Get_elements(status : Ptr[MPI_Status], datatype : MPI_Datatype, count : Ptr[CInt]): CInt = extern

  def PMPI_Get_elements_x(status : Ptr[MPI_Status], datatype : MPI_Datatype, count : Ptr[MPI_Count]): CInt = extern

  def PMPI_Get_library_version(version : CString, resultlen : Ptr[CInt]): CInt = extern

  def PMPI_Get_processor_name(name : CString, resultlen : Ptr[CInt]): CInt = extern

  def PMPI_Get_version(version : Ptr[CInt], subversion : Ptr[CInt]): CInt = extern

  def PMPI_Graph_create(comm_old : MPI_Comm, nnodes : CInt, index : Ptr[CInt], edges : Ptr[CInt], reorder : CInt, comm_graph : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Graph_get(comm : MPI_Comm, maxindex : CInt, maxedges : CInt, index : Ptr[CInt], edges : Ptr[CInt]): CInt = extern

  def PMPI_Graph_map(comm : MPI_Comm, nnodes : CInt, index : Ptr[CInt], edges : Ptr[CInt], newrank : Ptr[CInt]): CInt = extern

  def PMPI_Graph_neighbors(comm : MPI_Comm, rank : CInt, maxneighbors : CInt, neighbors : Ptr[CInt]): CInt = extern

  def PMPI_Graph_neighbors_count(comm : MPI_Comm, rank : CInt, nneighbors : Ptr[CInt]): CInt = extern

  def PMPI_Graphdims_get(comm : MPI_Comm, nnodes : Ptr[CInt], nedges : Ptr[CInt]): CInt = extern

  def PMPI_Grequest_complete(request : MPI_Request): CInt = extern

  def PMPI_Grequest_start(query_fn : CFuncPtr2[Ptr[Byte], Ptr[MPI_Status], CInt], free_fn : CFuncPtr1[Ptr[Byte], CInt], cancel_fn : CFuncPtr2[Ptr[Byte], CInt, CInt], extra_state : Ptr[Byte], request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Group_compare(group1 : MPI_Group, group2 : MPI_Group, result : Ptr[CInt]): CInt = extern

  def PMPI_Group_difference(group1 : MPI_Group, group2 : MPI_Group, newgroup : Ptr[MPI_Group]): CInt = extern

  def PMPI_Group_excl(group : MPI_Group, n : CInt, ranks : Ptr[CInt], newgroup : Ptr[MPI_Group]): CInt = extern

  def PMPI_Group_free(group : Ptr[MPI_Group]): CInt = extern

  def PMPI_Group_incl(group : MPI_Group, n : CInt, ranks : Ptr[CInt], newgroup : Ptr[MPI_Group]): CInt = extern

  def PMPI_Group_intersection(group1 : MPI_Group, group2 : MPI_Group, newgroup : Ptr[MPI_Group]): CInt = extern

  def PMPI_Group_range_excl(group : MPI_Group, n : CInt, ranges : Ptr[CArray[CInt, Nat._3]], newgroup : Ptr[MPI_Group]): CInt = extern

  def PMPI_Group_range_incl(group : MPI_Group, n : CInt, ranges : Ptr[CArray[CInt, Nat._3]], newgroup : Ptr[MPI_Group]): CInt = extern

  def PMPI_Group_rank(group : MPI_Group, rank : Ptr[CInt]): CInt = extern

  def PMPI_Group_size(group : MPI_Group, size : Ptr[CInt]): CInt = extern

  def PMPI_Group_translate_ranks(group1 : MPI_Group, n : CInt, ranks1 : Ptr[CInt], group2 : MPI_Group, ranks2 : Ptr[CInt]): CInt = extern

  def PMPI_Group_union(group1 : MPI_Group, group2 : MPI_Group, newgroup : Ptr[MPI_Group]): CInt = extern

  def PMPI_Iallgather(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Iallgatherv(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], displs : Ptr[CInt], recvtype : MPI_Datatype, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Iallreduce(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Ialltoall(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Ialltoallv(sendbuf : Ptr[Byte], sendcounts : Ptr[CInt], sdispls : Ptr[CInt], sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], rdispls : Ptr[CInt], recvtype : MPI_Datatype, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Ialltoallw(sendbuf : Ptr[Byte], sendcounts : Ptr[CInt], sdispls : Ptr[CInt], sendtypes : Ptr[MPI_Datatype], recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], rdispls : Ptr[CInt], recvtypes : Ptr[MPI_Datatype], comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Ibarrier(comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Ibcast(buffer : Ptr[Byte], count : CInt, datatype : MPI_Datatype, root : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Ibsend(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Iexscan(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Igather(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Igatherv(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], displs : Ptr[CInt], recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Improbe(source : CInt, tag : CInt, comm : MPI_Comm, flag : Ptr[CInt], message : Ptr[MPI_Message], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Imrecv(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, message : Ptr[MPI_Message], request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Info_create(info : Ptr[MPI_Info]): CInt = extern

  def PMPI_Info_delete(info : MPI_Info, key : CString): CInt = extern

  def PMPI_Info_dup(info : MPI_Info, newinfo : Ptr[MPI_Info]): CInt = extern

  def PMPI_Info_free(info : Ptr[MPI_Info]): CInt = extern

  def PMPI_Info_get(info : MPI_Info, key : CString, valuelen : CInt, value : CString, flag : Ptr[CInt]): CInt = extern

  def PMPI_Info_get_nkeys(info : MPI_Info, nkeys : Ptr[CInt]): CInt = extern

  def PMPI_Info_get_nthkey(info : MPI_Info, n : CInt, key : CString): CInt = extern

  def PMPI_Info_get_valuelen(info : MPI_Info, key : CString, valuelen : Ptr[CInt], flag : Ptr[CInt]): CInt = extern

  def PMPI_Info_set(info : MPI_Info, key : CString, value : CString): CInt = extern

  def PMPI_Init(argc : Ptr[CInt], argv : Ptr[Ptr[CString]]): CInt = extern

  def PMPI_Init_thread(argc : Ptr[CInt], argv : Ptr[Ptr[CString]], required : CInt, provided : Ptr[CInt]): CInt = extern

  def PMPI_Initialized(flag : Ptr[CInt]): CInt = extern

  def PMPI_Intercomm_create(local_comm : MPI_Comm, local_leader : CInt, peer_comm : MPI_Comm, remote_leader : CInt, tag : CInt, newintercomm : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Intercomm_merge(intercomm : MPI_Comm, high : CInt, newintracomm : Ptr[MPI_Comm]): CInt = extern

  def PMPI_Iprobe(source : CInt, tag : CInt, comm : MPI_Comm, flag : Ptr[CInt], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Irecv(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, source : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Ireduce(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, root : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Ireduce_scatter(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Ireduce_scatter_block(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], recvcount : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Irsend(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Is_thread_main(flag : Ptr[CInt]): CInt = extern

  def PMPI_Iscan(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Iscatter(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Iscatterv(sendbuf : Ptr[Byte], sendcounts : Ptr[CInt], displs : Ptr[CInt], sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Isend(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Issend(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Keyval_create(copy_fn : CFuncPtr6[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt], delete_fn : CFuncPtr4[MPI_Comm, CInt, Ptr[Byte], Ptr[Byte], CInt], keyval : Ptr[CInt], extra_state : Ptr[Byte]): CInt = extern

  def PMPI_Keyval_free(keyval : Ptr[CInt]): CInt = extern

  def PMPI_Lookup_name(service_name : CString, info : MPI_Info, port_name : CString): CInt = extern

  def PMPI_Mprobe(source : CInt, tag : CInt, comm : MPI_Comm, message : Ptr[MPI_Message], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Mrecv(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, message : Ptr[MPI_Message], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Op_commutative(op : MPI_Op, commute : Ptr[CInt]): CInt = extern

  def PMPI_Op_create(user_fn : CFuncPtr4[Ptr[Byte], Ptr[Byte], Ptr[CInt], Ptr[MPI_Datatype], Unit], commute : CInt, op : Ptr[MPI_Op]): CInt = extern

  def PMPI_Op_free(op : Ptr[MPI_Op]): CInt = extern

  def PMPI_Open_port(info : MPI_Info, port_name : CString): CInt = extern

  def PMPI_Pack(inbuf : Ptr[Byte], incount : CInt, datatype : MPI_Datatype, outbuf : Ptr[Byte], outsize : CInt, position : Ptr[CInt], comm : MPI_Comm): CInt = extern

  def PMPI_Pack_external(datarep : CString, inbuf : Ptr[Byte], incount : CInt, datatype : MPI_Datatype, outbuf : Ptr[Byte], outsize : MPI_Aint, position : Ptr[MPI_Aint]): CInt = extern

  def PMPI_Pack_external_size(datarep : CString, incount : CInt, datatype : MPI_Datatype, size : Ptr[MPI_Aint]): CInt = extern

  def PMPI_Pack_size(incount : CInt, datatype : MPI_Datatype, comm : MPI_Comm, size : Ptr[CInt]): CInt = extern

  def PMPI_Pcontrol(level : CInt, rest: Any*): CInt = extern

  def PMPI_Probe(source : CInt, tag : CInt, comm : MPI_Comm, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Publish_name(service_name : CString, info : MPI_Info, port_name : CString): CInt = extern

  def PMPI_Put(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, win : MPI_Win): CInt = extern

  def PMPI_Query_thread(provided : Ptr[CInt]): CInt = extern

  def PMPI_Raccumulate(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, op : MPI_Op, win : MPI_Win, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Recv(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, source : CInt, tag : CInt, comm : MPI_Comm, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Recv_init(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, source : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Reduce(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, root : CInt, comm : MPI_Comm): CInt = extern

  def PMPI_Reduce_local(inbuf : Ptr[Byte], inoutbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op): CInt = extern

  def PMPI_Reduce_scatter(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], recvcounts : Ptr[CInt], datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm): CInt = extern

  def PMPI_Reduce_scatter_block(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], recvcount : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm): CInt = extern

  def PMPI_Register_datarep(datarep : CString, read_conversion_fn : CFuncPtr6[Ptr[Byte], MPI_Datatype, CInt, Ptr[Byte], MPI_Offset, Ptr[Byte], CInt], write_conversion_fn : CFuncPtr6[Ptr[Byte], MPI_Datatype, CInt, Ptr[Byte], MPI_Offset, Ptr[Byte], CInt], dtype_file_extent_fn : CFuncPtr3[MPI_Datatype, Ptr[MPI_Aint], Ptr[Byte], CInt], extra_state : Ptr[Byte]): CInt = extern

  def PMPI_Request_free(request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Request_get_status(request : MPI_Request, flag : Ptr[CInt], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Rget(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, win : MPI_Win, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Rget_accumulate(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, result_addr : Ptr[Byte], result_count : CInt, result_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, op : MPI_Op, win : MPI_Win, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Rput(origin_addr : Ptr[Byte], origin_count : CInt, origin_datatype : MPI_Datatype, target_rank : CInt, target_disp : MPI_Aint, target_count : CInt, target_datatype : MPI_Datatype, win : MPI_Win, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Rsend(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm): CInt = extern

  def PMPI_Rsend_init(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Scan(sendbuf : Ptr[Byte], recvbuf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, op : MPI_Op, comm : MPI_Comm): CInt = extern

  def PMPI_Scatter(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm): CInt = extern

  def PMPI_Scatterv(sendbuf : Ptr[Byte], sendcounts : Ptr[CInt], displs : Ptr[CInt], sendtype : MPI_Datatype, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, root : CInt, comm : MPI_Comm): CInt = extern

  def PMPI_Send(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm): CInt = extern

  def PMPI_Send_init(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Sendrecv(sendbuf : Ptr[Byte], sendcount : CInt, sendtype : MPI_Datatype, dest : CInt, sendtag : CInt, recvbuf : Ptr[Byte], recvcount : CInt, recvtype : MPI_Datatype, source : CInt, recvtag : CInt, comm : MPI_Comm, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Sendrecv_replace(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, sendtag : CInt, source : CInt, recvtag : CInt, comm : MPI_Comm, status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Ssend(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm): CInt = extern

  def PMPI_Ssend_init(buf : Ptr[Byte], count : CInt, datatype : MPI_Datatype, dest : CInt, tag : CInt, comm : MPI_Comm, request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Start(request : Ptr[MPI_Request]): CInt = extern

  def PMPI_Startall(count : CInt, array_of_requests : Ptr[MPI_Request]): CInt = extern

  def PMPI_Status_c2f(c_status : Ptr[MPI_Status], f_status : Ptr[MPI_Fint]): CInt = extern

  def PMPI_Status_f2c(f_status : Ptr[MPI_Fint], c_status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Status_set_cancelled(status : Ptr[MPI_Status], flag : CInt): CInt = extern

  def PMPI_Status_set_elements(status : Ptr[MPI_Status], datatype : MPI_Datatype, count : CInt): CInt = extern

  def PMPI_Status_set_elements_x(status : Ptr[MPI_Status], datatype : MPI_Datatype, count : MPI_Count): CInt = extern

  def PMPI_Test(request : Ptr[MPI_Request], flag : Ptr[CInt], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Test_cancelled(status : Ptr[MPI_Status], flag : Ptr[CInt]): CInt = extern

  def PMPI_Testall(count : CInt, array_of_requests : Ptr[MPI_Request], flag : Ptr[CInt], array_of_statuses : Ptr[MPI_Status]): CInt = extern

  def PMPI_Testany(count : CInt, array_of_requests : Ptr[MPI_Request], index : Ptr[CInt], flag : Ptr[CInt], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Testsome(incount : CInt, array_of_requests : Ptr[MPI_Request], outcount : Ptr[CInt], array_of_indices : Ptr[CInt], array_of_statuses : Ptr[MPI_Status]): CInt = extern

  def PMPI_Topo_test(comm : MPI_Comm, status : Ptr[CInt]): CInt = extern

  def PMPI_Type_commit(datatype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_contiguous(count : CInt, oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_create_darray(size : CInt, rank : CInt, ndims : CInt, array_of_gsizes : Ptr[CInt], array_of_distribs : Ptr[CInt], array_of_dargs : Ptr[CInt], array_of_psizes : Ptr[CInt], order : CInt, oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_create_f90_complex(p : CInt, r : CInt, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_create_f90_integer(r : CInt, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_create_f90_real(p : CInt, r : CInt, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_create_hindexed(count : CInt, array_of_blocklengths : Ptr[CInt], array_of_displacements : Ptr[MPI_Aint], oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_create_hindexed_block(count : CInt, blocklength : CInt, array_of_displacements : Ptr[MPI_Aint], oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_create_hvector(count : CInt, blocklength : CInt, stride : MPI_Aint, oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_create_indexed_block(count : CInt, blocklength : CInt, array_of_displacements : Ptr[CInt], oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_create_keyval(type_copy_attr_fn : CFuncPtr6[MPI_Datatype, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt], type_delete_attr_fn : CFuncPtr4[MPI_Datatype, CInt, Ptr[Byte], Ptr[Byte], CInt], type_keyval : Ptr[CInt], extra_state : Ptr[Byte]): CInt = extern

  def PMPI_Type_create_resized(oldtype : MPI_Datatype, lb : MPI_Aint, extent : MPI_Aint, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_create_struct(count : CInt, array_of_blocklengths : Ptr[CInt], array_of_displacements : Ptr[MPI_Aint], array_of_types : Ptr[MPI_Datatype], newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_create_subarray(ndims : CInt, array_of_sizes : Ptr[CInt], array_of_subsizes : Ptr[CInt], array_of_starts : Ptr[CInt], order : CInt, oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_delete_attr(`type` : MPI_Datatype, type_keyval : CInt): CInt = extern

  def PMPI_Type_dup(oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_extent(datatype : MPI_Datatype, extent : Ptr[MPI_Aint]): CInt = extern

  def PMPI_Type_free(datatype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_free_keyval(type_keyval : Ptr[CInt]): CInt = extern

  def PMPI_Type_get_attr(`type` : MPI_Datatype, type_keyval : CInt, attribute_val : Ptr[Byte], flag : Ptr[CInt]): CInt = extern

  def PMPI_Type_get_contents(datatype : MPI_Datatype, max_integers : CInt, max_addresses : CInt, max_datatypes : CInt, array_of_integers : Ptr[CInt], array_of_addresses : Ptr[MPI_Aint], array_of_datatypes : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_get_envelope(datatype : MPI_Datatype, num_integers : Ptr[CInt], num_addresses : Ptr[CInt], num_datatypes : Ptr[CInt], combiner : Ptr[CInt]): CInt = extern

  def PMPI_Type_get_extent(datatype : MPI_Datatype, lb : Ptr[MPI_Aint], extent : Ptr[MPI_Aint]): CInt = extern

  def PMPI_Type_get_extent_x(datatype : MPI_Datatype, lb : Ptr[MPI_Count], extent : Ptr[MPI_Count]): CInt = extern

  def PMPI_Type_get_name(datatype : MPI_Datatype, type_name : CString, resultlen : Ptr[CInt]): CInt = extern

  def PMPI_Type_get_true_extent(datatype : MPI_Datatype, true_lb : Ptr[MPI_Aint], true_extent : Ptr[MPI_Aint]): CInt = extern

  def PMPI_Type_get_true_extent_x(datatype : MPI_Datatype, true_lb : Ptr[MPI_Count], true_extent : Ptr[MPI_Count]): CInt = extern

  def PMPI_Type_hindexed(count : CInt, array_of_blocklengths : Ptr[CInt], array_of_displacements : Ptr[MPI_Aint], oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_hvector(count : CInt, blocklength : CInt, stride : MPI_Aint, oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_indexed(count : CInt, array_of_blocklengths : Ptr[CInt], array_of_displacements : Ptr[CInt], oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_lb(datatype : MPI_Datatype, displacement : Ptr[MPI_Aint]): CInt = extern

  def PMPI_Type_match_size(typeclass : CInt, size : CInt, datatype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_set_attr(`type` : MPI_Datatype, type_keyval : CInt, attribute_val : Ptr[Byte]): CInt = extern

  def PMPI_Type_set_name(datatype : MPI_Datatype, type_name : CString): CInt = extern

  def PMPI_Type_size(datatype : MPI_Datatype, size : Ptr[CInt]): CInt = extern

  def PMPI_Type_size_x(datatype : MPI_Datatype, size : Ptr[MPI_Count]): CInt = extern

  def PMPI_Type_struct(count : CInt, array_of_blocklengths : Ptr[CInt], array_of_displacements : Ptr[MPI_Aint], array_of_types : Ptr[MPI_Datatype], newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Type_ub(datatype : MPI_Datatype, displacement : Ptr[MPI_Aint]): CInt = extern

  def PMPI_Type_vector(count : CInt, blocklength : CInt, stride : CInt, oldtype : MPI_Datatype, newtype : Ptr[MPI_Datatype]): CInt = extern

  def PMPI_Unpack(inbuf : Ptr[Byte], insize : CInt, position : Ptr[CInt], outbuf : Ptr[Byte], outcount : CInt, datatype : MPI_Datatype, comm : MPI_Comm): CInt = extern

  def PMPI_Unpack_external(datarep : CString, inbuf : Ptr[Byte], insize : MPI_Aint, position : Ptr[MPI_Aint], outbuf : Ptr[Byte], outcount : CInt, datatype : MPI_Datatype): CInt = extern

  def PMPI_Unpublish_name(service_name : CString, info : MPI_Info, port_name : CString): CInt = extern

  def PMPI_Wait(request : Ptr[MPI_Request], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Waitall(count : CInt, array_of_requests : Ptr[MPI_Request], array_of_statuses : Ptr[MPI_Status]): CInt = extern

  def PMPI_Waitany(count : CInt, array_of_requests : Ptr[MPI_Request], index : Ptr[CInt], status : Ptr[MPI_Status]): CInt = extern

  def PMPI_Waitsome(incount : CInt, array_of_requests : Ptr[MPI_Request], outcount : Ptr[CInt], array_of_indices : Ptr[CInt], array_of_statuses : Ptr[MPI_Status]): CInt = extern

  def PMPI_Win_allocate(size : MPI_Aint, disp_unit : CInt, info : MPI_Info, comm : MPI_Comm, baseptr : Ptr[Byte], win : Ptr[MPI_Win]): CInt = extern

  def PMPI_Win_allocate_shared(size : MPI_Aint, disp_unit : CInt, info : MPI_Info, comm : MPI_Comm, baseptr : Ptr[Byte], win : Ptr[MPI_Win]): CInt = extern

  def PMPI_Win_attach(win : MPI_Win, base : Ptr[Byte], size : MPI_Aint): CInt = extern

  def PMPI_Win_call_errhandler(win : MPI_Win, errorcode : CInt): CInt = extern

  def PMPI_Win_complete(win : MPI_Win): CInt = extern

  def PMPI_Win_create(base : Ptr[Byte], size : MPI_Aint, disp_unit : CInt, info : MPI_Info, comm : MPI_Comm, win : Ptr[MPI_Win]): CInt = extern

  def PMPI_Win_create_dynamic(info : MPI_Info, comm : MPI_Comm, win : Ptr[MPI_Win]): CInt = extern

  def PMPI_Win_create_errhandler(function : CFuncPtr2[Ptr[MPI_Win], Ptr[CInt], Unit], errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def PMPI_Win_create_keyval(win_copy_attr_fn : CFuncPtr6[MPI_Win, CInt, Ptr[Byte], Ptr[Byte], Ptr[Byte], Ptr[CInt], CInt], win_delete_attr_fn : CFuncPtr4[MPI_Win, CInt, Ptr[Byte], Ptr[Byte], CInt], win_keyval : Ptr[CInt], extra_state : Ptr[Byte]): CInt = extern

  def PMPI_Win_delete_attr(win : MPI_Win, win_keyval : CInt): CInt = extern

  def PMPI_Win_detach(win : MPI_Win, base : Ptr[Byte]): CInt = extern

  def PMPI_Win_fence(assert : CInt, win : MPI_Win): CInt = extern

  def PMPI_Win_flush(rank : CInt, win : MPI_Win): CInt = extern

  def PMPI_Win_flush_all(win : MPI_Win): CInt = extern

  def PMPI_Win_flush_local(rank : CInt, win : MPI_Win): CInt = extern

  def PMPI_Win_flush_local_all(win : MPI_Win): CInt = extern

  def PMPI_Win_free(win : Ptr[MPI_Win]): CInt = extern

  def PMPI_Win_free_keyval(win_keyval : Ptr[CInt]): CInt = extern

  def PMPI_Win_get_attr(win : MPI_Win, win_keyval : CInt, attribute_val : Ptr[Byte], flag : Ptr[CInt]): CInt = extern

  def PMPI_Win_get_errhandler(win : MPI_Win, errhandler : Ptr[MPI_Errhandler]): CInt = extern

  def PMPI_Win_get_group(win : MPI_Win, group : Ptr[MPI_Group]): CInt = extern

  def PMPI_Win_get_name(win : MPI_Win, win_name : CString, resultlen : Ptr[CInt]): CInt = extern

  def PMPI_Win_lock(lock_type : CInt, rank : CInt, assert : CInt, win : MPI_Win): CInt = extern

  def PMPI_Win_lock_all(assert : CInt, win : MPI_Win): CInt = extern

  def PMPI_Win_post(group : MPI_Group, assert : CInt, win : MPI_Win): CInt = extern

  def PMPI_Win_set_attr(win : MPI_Win, win_keyval : CInt, attribute_val : Ptr[Byte]): CInt = extern

  def PMPI_Win_set_errhandler(win : MPI_Win, errhandler : MPI_Errhandler): CInt = extern

  def PMPI_Win_set_name(win : MPI_Win, win_name : CString): CInt = extern

  def PMPI_Win_shared_query(win : MPI_Win, rank : CInt, size : Ptr[MPI_Aint], disp_unit : Ptr[CInt], baseptr : Ptr[Byte]): CInt = extern

  def PMPI_Win_start(group : MPI_Group, assert : CInt, win : MPI_Win): CInt = extern

  def PMPI_Win_sync(win : MPI_Win): CInt = extern

  def PMPI_Win_test(win : MPI_Win, flag : Ptr[CInt]): CInt = extern

  def PMPI_Win_unlock(rank : CInt, win : MPI_Win): CInt = extern

  def PMPI_Win_unlock_all(win : MPI_Win): CInt = extern

  def PMPI_Win_wait(win : MPI_Win): CInt = extern

  def PMPI_Wtick(): Double = extern

  def PMPI_Wtime(): Double = extern


object functions:
  import _root_.mpi.aliases.*
  import _root_.mpi.structs.*
  import extern_functions.*
  export extern_functions.*

object constants:
  val MPI_COMM_TYPE_SHARED: CInt = 1
  
  val MPI_COMBINER_NAMED: CInt = 1
  val MPI_COMBINER_DUP: CInt = 2
  val MPI_COMBINER_CONTIGUOUS: CInt = 3
  val MPI_COMBINER_VECTOR: CInt = 4
  val MPI_COMBINER_HVECTOR_INTEGER: CInt = 5
  val MPI_COMBINER_HVECTOR: CInt = 6
  val MPI_COMBINER_INDEXED: CInt = 7
  val MPI_COMBINER_HINDEXED_INTEGER: CInt = 8
  val MPI_COMBINER_HINDEXED: CInt = 9
  val MPI_COMBINER_INDEXED_BLOCK: CInt = 10
  val MPI_COMBINER_STRUCT_INTEGER: CInt = 11
  val MPI_COMBINER_STRUCT: CInt = 12
  val MPI_COMBINER_SUBARRAY: CInt = 13
  val MPI_COMBINER_DARRAY: CInt = 14
  val MPI_COMBINER_F90_REAL: CInt = 15
  val MPI_COMBINER_F90_COMPLEX: CInt = 16
  val MPI_COMBINER_F90_INTEGER: CInt = 17
  val MPI_COMBINER_RESIZED: CInt = 18
  val MPI_COMBINER_HINDEXED_BLOCK: CInt = 19
  
  val MPI_GRAPH: CInt = 1
  val MPI_CART: CInt = 2
  val MPI_DIST_GRAPH: CInt = 3
  
object types:
  export _root_.mpi.structs.*
  export _root_.mpi.aliases.*

object all:
  export _root_.mpi.aliases.MPI_Aint
  export _root_.mpi.aliases.MPI_Comm
  export _root_.mpi.aliases.MPI_Comm_copy_attr_function
  export _root_.mpi.aliases.MPI_Comm_delete_attr_function
  export _root_.mpi.aliases.MPI_Comm_errhandler_fn
  export _root_.mpi.aliases.MPI_Copy_function
  export _root_.mpi.aliases.MPI_Count
  export _root_.mpi.aliases.MPI_Datarep_conversion_function
  export _root_.mpi.aliases.MPI_Datarep_extent_function
  export _root_.mpi.aliases.MPI_Datatype
  export _root_.mpi.aliases.MPI_Delete_function
  export _root_.mpi.aliases.MPI_Errhandler
  export _root_.mpi.aliases.MPI_File
  export _root_.mpi.aliases.MPI_File_errhandler_fn
  export _root_.mpi.aliases.MPI_Fint
  export _root_.mpi.aliases.MPI_Grequest_cancel_function
  export _root_.mpi.aliases.MPI_Grequest_free_function
  export _root_.mpi.aliases.MPI_Grequest_query_function
  export _root_.mpi.aliases.MPI_Group
  export _root_.mpi.aliases.MPI_Handler_function
  export _root_.mpi.aliases.MPI_Info
  export _root_.mpi.aliases.MPI_Message
  export _root_.mpi.aliases.MPI_Offset
  export _root_.mpi.aliases.MPI_Op
  export _root_.mpi.aliases.MPI_Request
  export _root_.mpi.aliases.MPI_Type_copy_attr_function
  export _root_.mpi.aliases.MPI_Type_delete_attr_function
  export _root_.mpi.aliases.MPI_User_function
  export _root_.mpi.aliases.MPI_Win
  export _root_.mpi.aliases.MPI_Win_copy_attr_function
  export _root_.mpi.aliases.MPI_Win_delete_attr_function
  export _root_.mpi.aliases.MPI_Win_errhandler_fn
  export _root_.mpi.aliases.MSMPI_Request_callback
  export _root_.mpi.aliases._MSMPI_int64_t
  export _root_.mpi.aliases.int64_t
  export _root_.mpi.structs.ADIOI_FileD
  export _root_.mpi.structs.MPI_Status
  export _root_.mpi.structs.MSMPI_Lock_queue
  export _root_.mpi.structs._MSMPI_LOCK_QUEUE
  export _root_.mpi.functions.MPIR_Dup_fn
  export _root_.mpi.functions.MPI_Abort
  export _root_.mpi.functions.MPI_Accumulate
  export _root_.mpi.functions.MPI_Add_error_class
  export _root_.mpi.functions.MPI_Add_error_code
  export _root_.mpi.functions.MPI_Add_error_string
  export _root_.mpi.functions.MPI_Address
  export _root_.mpi.functions.MPI_Aint_add
  export _root_.mpi.functions.MPI_Aint_diff
  export _root_.mpi.functions.MPI_Allgather
  export _root_.mpi.functions.MPI_Allgatherv
  export _root_.mpi.functions.MPI_Alloc_mem
  export _root_.mpi.functions.MPI_Allreduce
  export _root_.mpi.functions.MPI_Alltoall
  export _root_.mpi.functions.MPI_Alltoallv
  export _root_.mpi.functions.MPI_Alltoallw
  export _root_.mpi.functions.MPI_Attr_delete
  export _root_.mpi.functions.MPI_Attr_get
  export _root_.mpi.functions.MPI_Attr_put
  export _root_.mpi.functions.MPI_Barrier
  export _root_.mpi.functions.MPI_Bcast
  export _root_.mpi.functions.MPI_Bsend
  export _root_.mpi.functions.MPI_Bsend_init
  export _root_.mpi.functions.MPI_Buffer_attach
  export _root_.mpi.functions.MPI_Buffer_detach
  export _root_.mpi.functions.MPI_Cancel
  export _root_.mpi.functions.MPI_Cart_coords
  export _root_.mpi.functions.MPI_Cart_create
  export _root_.mpi.functions.MPI_Cart_get
  export _root_.mpi.functions.MPI_Cart_map
  export _root_.mpi.functions.MPI_Cart_rank
  export _root_.mpi.functions.MPI_Cart_shift
  export _root_.mpi.functions.MPI_Cart_sub
  export _root_.mpi.functions.MPI_Cartdim_get
  export _root_.mpi.functions.MPI_Close_port
  export _root_.mpi.functions.MPI_Comm_accept
  export _root_.mpi.functions.MPI_Comm_call_errhandler
  export _root_.mpi.functions.MPI_Comm_compare
  export _root_.mpi.functions.MPI_Comm_connect
  export _root_.mpi.functions.MPI_Comm_create
  export _root_.mpi.functions.MPI_Comm_create_errhandler
  export _root_.mpi.functions.MPI_Comm_create_keyval
  export _root_.mpi.functions.MPI_Comm_delete_attr
  export _root_.mpi.functions.MPI_Comm_disconnect
  export _root_.mpi.functions.MPI_Comm_dup
  export _root_.mpi.functions.MPI_Comm_free
  export _root_.mpi.functions.MPI_Comm_free_keyval
  export _root_.mpi.functions.MPI_Comm_get_attr
  export _root_.mpi.functions.MPI_Comm_get_errhandler
  export _root_.mpi.functions.MPI_Comm_get_name
  export _root_.mpi.functions.MPI_Comm_get_parent
  export _root_.mpi.functions.MPI_Comm_group
  export _root_.mpi.functions.MPI_Comm_join
  export _root_.mpi.functions.MPI_Comm_rank
  export _root_.mpi.functions.MPI_Comm_remote_group
  export _root_.mpi.functions.MPI_Comm_remote_size
  export _root_.mpi.functions.MPI_Comm_set_attr
  export _root_.mpi.functions.MPI_Comm_set_errhandler
  export _root_.mpi.functions.MPI_Comm_set_name
  export _root_.mpi.functions.MPI_Comm_size
  export _root_.mpi.functions.MPI_Comm_spawn
  export _root_.mpi.functions.MPI_Comm_spawn_multiple
  export _root_.mpi.functions.MPI_Comm_split
  export _root_.mpi.functions.MPI_Comm_split_type
  export _root_.mpi.functions.MPI_Comm_test_inter
  export _root_.mpi.functions.MPI_Compare_and_swap
  export _root_.mpi.functions.MPI_Dims_create
  export _root_.mpi.functions.MPI_Dist_graph_create
  export _root_.mpi.functions.MPI_Dist_graph_create_adjacent
  export _root_.mpi.functions.MPI_Dist_graph_neighbors
  export _root_.mpi.functions.MPI_Dist_graph_neighbors_count
  export _root_.mpi.functions.MPI_Errhandler_create
  export _root_.mpi.functions.MPI_Errhandler_free
  export _root_.mpi.functions.MPI_Errhandler_get
  export _root_.mpi.functions.MPI_Errhandler_set
  export _root_.mpi.functions.MPI_Error_class
  export _root_.mpi.functions.MPI_Error_string
  export _root_.mpi.functions.MPI_Exscan
  export _root_.mpi.functions.MPI_Fetch_and_op
  export _root_.mpi.functions.MPI_File_c2f
  export _root_.mpi.functions.MPI_File_call_errhandler
  export _root_.mpi.functions.MPI_File_close
  export _root_.mpi.functions.MPI_File_create_errhandler
  export _root_.mpi.functions.MPI_File_delete
  export _root_.mpi.functions.MPI_File_f2c
  export _root_.mpi.functions.MPI_File_get_amode
  export _root_.mpi.functions.MPI_File_get_atomicity
  export _root_.mpi.functions.MPI_File_get_byte_offset
  export _root_.mpi.functions.MPI_File_get_errhandler
  export _root_.mpi.functions.MPI_File_get_group
  export _root_.mpi.functions.MPI_File_get_info
  export _root_.mpi.functions.MPI_File_get_position
  export _root_.mpi.functions.MPI_File_get_position_shared
  export _root_.mpi.functions.MPI_File_get_size
  export _root_.mpi.functions.MPI_File_get_type_extent
  export _root_.mpi.functions.MPI_File_get_view
  export _root_.mpi.functions.MPI_File_iread
  export _root_.mpi.functions.MPI_File_iread_at
  export _root_.mpi.functions.MPI_File_iread_shared
  export _root_.mpi.functions.MPI_File_iwrite
  export _root_.mpi.functions.MPI_File_iwrite_at
  export _root_.mpi.functions.MPI_File_iwrite_shared
  export _root_.mpi.functions.MPI_File_open
  export _root_.mpi.functions.MPI_File_preallocate
  export _root_.mpi.functions.MPI_File_read
  export _root_.mpi.functions.MPI_File_read_all
  export _root_.mpi.functions.MPI_File_read_all_begin
  export _root_.mpi.functions.MPI_File_read_all_end
  export _root_.mpi.functions.MPI_File_read_at
  export _root_.mpi.functions.MPI_File_read_at_all
  export _root_.mpi.functions.MPI_File_read_at_all_begin
  export _root_.mpi.functions.MPI_File_read_at_all_end
  export _root_.mpi.functions.MPI_File_read_ordered
  export _root_.mpi.functions.MPI_File_read_ordered_begin
  export _root_.mpi.functions.MPI_File_read_ordered_end
  export _root_.mpi.functions.MPI_File_read_shared
  export _root_.mpi.functions.MPI_File_seek
  export _root_.mpi.functions.MPI_File_seek_shared
  export _root_.mpi.functions.MPI_File_set_atomicity
  export _root_.mpi.functions.MPI_File_set_errhandler
  export _root_.mpi.functions.MPI_File_set_info
  export _root_.mpi.functions.MPI_File_set_size
  export _root_.mpi.functions.MPI_File_set_view
  export _root_.mpi.functions.MPI_File_sync
  export _root_.mpi.functions.MPI_File_write
  export _root_.mpi.functions.MPI_File_write_all
  export _root_.mpi.functions.MPI_File_write_all_begin
  export _root_.mpi.functions.MPI_File_write_all_end
  export _root_.mpi.functions.MPI_File_write_at
  export _root_.mpi.functions.MPI_File_write_at_all
  export _root_.mpi.functions.MPI_File_write_at_all_begin
  export _root_.mpi.functions.MPI_File_write_at_all_end
  export _root_.mpi.functions.MPI_File_write_ordered
  export _root_.mpi.functions.MPI_File_write_ordered_begin
  export _root_.mpi.functions.MPI_File_write_ordered_end
  export _root_.mpi.functions.MPI_File_write_shared
  export _root_.mpi.functions.MPI_Finalize
  export _root_.mpi.functions.MPI_Finalized
  export _root_.mpi.functions.MPI_Free_mem
  export _root_.mpi.functions.MPI_Gather
  export _root_.mpi.functions.MPI_Gatherv
  export _root_.mpi.functions.MPI_Get
  export _root_.mpi.functions.MPI_Get_accumulate
  export _root_.mpi.functions.MPI_Get_address
  export _root_.mpi.functions.MPI_Get_count
  export _root_.mpi.functions.MPI_Get_elements
  export _root_.mpi.functions.MPI_Get_elements_x
  export _root_.mpi.functions.MPI_Get_library_version
  export _root_.mpi.functions.MPI_Get_processor_name
  export _root_.mpi.functions.MPI_Get_version
  export _root_.mpi.functions.MPI_Graph_create
  export _root_.mpi.functions.MPI_Graph_get
  export _root_.mpi.functions.MPI_Graph_map
  export _root_.mpi.functions.MPI_Graph_neighbors
  export _root_.mpi.functions.MPI_Graph_neighbors_count
  export _root_.mpi.functions.MPI_Graphdims_get
  export _root_.mpi.functions.MPI_Grequest_complete
  export _root_.mpi.functions.MPI_Grequest_start
  export _root_.mpi.functions.MPI_Group_compare
  export _root_.mpi.functions.MPI_Group_difference
  export _root_.mpi.functions.MPI_Group_excl
  export _root_.mpi.functions.MPI_Group_free
  export _root_.mpi.functions.MPI_Group_incl
  export _root_.mpi.functions.MPI_Group_intersection
  export _root_.mpi.functions.MPI_Group_range_excl
  export _root_.mpi.functions.MPI_Group_range_incl
  export _root_.mpi.functions.MPI_Group_rank
  export _root_.mpi.functions.MPI_Group_size
  export _root_.mpi.functions.MPI_Group_translate_ranks
  export _root_.mpi.functions.MPI_Group_union
  export _root_.mpi.functions.MPI_Iallgather
  export _root_.mpi.functions.MPI_Iallgatherv
  export _root_.mpi.functions.MPI_Iallreduce
  export _root_.mpi.functions.MPI_Ialltoall
  export _root_.mpi.functions.MPI_Ialltoallv
  export _root_.mpi.functions.MPI_Ialltoallw
  export _root_.mpi.functions.MPI_Ibarrier
  export _root_.mpi.functions.MPI_Ibcast
  export _root_.mpi.functions.MPI_Ibsend
  export _root_.mpi.functions.MPI_Iexscan
  export _root_.mpi.functions.MPI_Igather
  export _root_.mpi.functions.MPI_Igatherv
  export _root_.mpi.functions.MPI_Improbe
  export _root_.mpi.functions.MPI_Imrecv
  export _root_.mpi.functions.MPI_Info_create
  export _root_.mpi.functions.MPI_Info_delete
  export _root_.mpi.functions.MPI_Info_dup
  export _root_.mpi.functions.MPI_Info_free
  export _root_.mpi.functions.MPI_Info_get
  export _root_.mpi.functions.MPI_Info_get_nkeys
  export _root_.mpi.functions.MPI_Info_get_nthkey
  export _root_.mpi.functions.MPI_Info_get_valuelen
  export _root_.mpi.functions.MPI_Info_set
  export _root_.mpi.functions.MPI_Init
  export _root_.mpi.functions.MPI_Init_thread
  export _root_.mpi.functions.MPI_Initialized
  export _root_.mpi.functions.MPI_Intercomm_create
  export _root_.mpi.functions.MPI_Intercomm_merge
  export _root_.mpi.functions.MPI_Iprobe
  export _root_.mpi.functions.MPI_Irecv
  export _root_.mpi.functions.MPI_Ireduce
  export _root_.mpi.functions.MPI_Ireduce_scatter
  export _root_.mpi.functions.MPI_Ireduce_scatter_block
  export _root_.mpi.functions.MPI_Irsend
  export _root_.mpi.functions.MPI_Is_thread_main
  export _root_.mpi.functions.MPI_Iscan
  export _root_.mpi.functions.MPI_Iscatter
  export _root_.mpi.functions.MPI_Iscatterv
  export _root_.mpi.functions.MPI_Isend
  export _root_.mpi.functions.MPI_Issend
  export _root_.mpi.functions.MPI_Keyval_create
  export _root_.mpi.functions.MPI_Keyval_free
  export _root_.mpi.functions.MPI_Lookup_name
  export _root_.mpi.functions.MPI_Mprobe
  export _root_.mpi.functions.MPI_Mrecv
  export _root_.mpi.functions.MPI_Op_commutative
  export _root_.mpi.functions.MPI_Op_create
  export _root_.mpi.functions.MPI_Op_free
  export _root_.mpi.functions.MPI_Open_port
  export _root_.mpi.functions.MPI_Pack
  export _root_.mpi.functions.MPI_Pack_external
  export _root_.mpi.functions.MPI_Pack_external_size
  export _root_.mpi.functions.MPI_Pack_size
  export _root_.mpi.functions.MPI_Pcontrol
  export _root_.mpi.functions.MPI_Probe
  export _root_.mpi.functions.MPI_Publish_name
  export _root_.mpi.functions.MPI_Put
  export _root_.mpi.functions.MPI_Query_thread
  export _root_.mpi.functions.MPI_Raccumulate
  export _root_.mpi.functions.MPI_Recv
  export _root_.mpi.functions.MPI_Recv_init
  export _root_.mpi.functions.MPI_Reduce
  export _root_.mpi.functions.MPI_Reduce_local
  export _root_.mpi.functions.MPI_Reduce_scatter
  export _root_.mpi.functions.MPI_Reduce_scatter_block
  export _root_.mpi.functions.MPI_Register_datarep
  export _root_.mpi.functions.MPI_Request_free
  export _root_.mpi.functions.MPI_Request_get_status
  export _root_.mpi.functions.MPI_Rget
  export _root_.mpi.functions.MPI_Rget_accumulate
  export _root_.mpi.functions.MPI_Rput
  export _root_.mpi.functions.MPI_Rsend
  export _root_.mpi.functions.MPI_Rsend_init
  export _root_.mpi.functions.MPI_Scan
  export _root_.mpi.functions.MPI_Scatter
  export _root_.mpi.functions.MPI_Scatterv
  export _root_.mpi.functions.MPI_Send
  export _root_.mpi.functions.MPI_Send_init
  export _root_.mpi.functions.MPI_Sendrecv
  export _root_.mpi.functions.MPI_Sendrecv_replace
  export _root_.mpi.functions.MPI_Ssend
  export _root_.mpi.functions.MPI_Ssend_init
  export _root_.mpi.functions.MPI_Start
  export _root_.mpi.functions.MPI_Startall
  export _root_.mpi.functions.MPI_Status_c2f
  export _root_.mpi.functions.MPI_Status_f2c
  export _root_.mpi.functions.MPI_Status_set_cancelled
  export _root_.mpi.functions.MPI_Status_set_elements
  export _root_.mpi.functions.MPI_Status_set_elements_x
  export _root_.mpi.functions.MPI_Test
  export _root_.mpi.functions.MPI_Test_cancelled
  export _root_.mpi.functions.MPI_Testall
  export _root_.mpi.functions.MPI_Testany
  export _root_.mpi.functions.MPI_Testsome
  export _root_.mpi.functions.MPI_Topo_test
  export _root_.mpi.functions.MPI_Type_commit
  export _root_.mpi.functions.MPI_Type_contiguous
  export _root_.mpi.functions.MPI_Type_create_darray
  export _root_.mpi.functions.MPI_Type_create_f90_complex
  export _root_.mpi.functions.MPI_Type_create_f90_integer
  export _root_.mpi.functions.MPI_Type_create_f90_real
  export _root_.mpi.functions.MPI_Type_create_hindexed
  export _root_.mpi.functions.MPI_Type_create_hindexed_block
  export _root_.mpi.functions.MPI_Type_create_hvector
  export _root_.mpi.functions.MPI_Type_create_indexed_block
  export _root_.mpi.functions.MPI_Type_create_keyval
  export _root_.mpi.functions.MPI_Type_create_resized
  export _root_.mpi.functions.MPI_Type_create_struct
  export _root_.mpi.functions.MPI_Type_create_subarray
  export _root_.mpi.functions.MPI_Type_delete_attr
  export _root_.mpi.functions.MPI_Type_dup
  export _root_.mpi.functions.MPI_Type_extent
  export _root_.mpi.functions.MPI_Type_free
  export _root_.mpi.functions.MPI_Type_free_keyval
  export _root_.mpi.functions.MPI_Type_get_attr
  export _root_.mpi.functions.MPI_Type_get_contents
  export _root_.mpi.functions.MPI_Type_get_envelope
  export _root_.mpi.functions.MPI_Type_get_extent
  export _root_.mpi.functions.MPI_Type_get_extent_x
  export _root_.mpi.functions.MPI_Type_get_name
  export _root_.mpi.functions.MPI_Type_get_true_extent
  export _root_.mpi.functions.MPI_Type_get_true_extent_x
  export _root_.mpi.functions.MPI_Type_hindexed
  export _root_.mpi.functions.MPI_Type_hvector
  export _root_.mpi.functions.MPI_Type_indexed
  export _root_.mpi.functions.MPI_Type_lb
  export _root_.mpi.functions.MPI_Type_match_size
  export _root_.mpi.functions.MPI_Type_set_attr
  export _root_.mpi.functions.MPI_Type_set_name
  export _root_.mpi.functions.MPI_Type_size
  export _root_.mpi.functions.MPI_Type_size_x
  export _root_.mpi.functions.MPI_Type_struct
  export _root_.mpi.functions.MPI_Type_ub
  export _root_.mpi.functions.MPI_Type_vector
  export _root_.mpi.functions.MPI_Unpack
  export _root_.mpi.functions.MPI_Unpack_external
  export _root_.mpi.functions.MPI_Unpublish_name
  export _root_.mpi.functions.MPI_Wait
  export _root_.mpi.functions.MPI_Waitall
  export _root_.mpi.functions.MPI_Waitany
  export _root_.mpi.functions.MPI_Waitsome
  export _root_.mpi.functions.MPI_Win_allocate
  export _root_.mpi.functions.MPI_Win_allocate_shared
  export _root_.mpi.functions.MPI_Win_attach
  export _root_.mpi.functions.MPI_Win_call_errhandler
  export _root_.mpi.functions.MPI_Win_complete
  export _root_.mpi.functions.MPI_Win_create
  export _root_.mpi.functions.MPI_Win_create_dynamic
  export _root_.mpi.functions.MPI_Win_create_errhandler
  export _root_.mpi.functions.MPI_Win_create_keyval
  export _root_.mpi.functions.MPI_Win_delete_attr
  export _root_.mpi.functions.MPI_Win_detach
  export _root_.mpi.functions.MPI_Win_fence
  export _root_.mpi.functions.MPI_Win_flush
  export _root_.mpi.functions.MPI_Win_flush_all
  export _root_.mpi.functions.MPI_Win_flush_local
  export _root_.mpi.functions.MPI_Win_flush_local_all
  export _root_.mpi.functions.MPI_Win_free
  export _root_.mpi.functions.MPI_Win_free_keyval
  export _root_.mpi.functions.MPI_Win_get_attr
  export _root_.mpi.functions.MPI_Win_get_errhandler
  export _root_.mpi.functions.MPI_Win_get_group
  export _root_.mpi.functions.MPI_Win_get_name
  export _root_.mpi.functions.MPI_Win_lock
  export _root_.mpi.functions.MPI_Win_lock_all
  export _root_.mpi.functions.MPI_Win_post
  export _root_.mpi.functions.MPI_Win_set_attr
  export _root_.mpi.functions.MPI_Win_set_errhandler
  export _root_.mpi.functions.MPI_Win_set_name
  export _root_.mpi.functions.MPI_Win_shared_query
  export _root_.mpi.functions.MPI_Win_start
  export _root_.mpi.functions.MPI_Win_sync
  export _root_.mpi.functions.MPI_Win_test
  export _root_.mpi.functions.MPI_Win_unlock
  export _root_.mpi.functions.MPI_Win_unlock_all
  export _root_.mpi.functions.MPI_Win_wait
  export _root_.mpi.functions.MPI_Wtick
  export _root_.mpi.functions.MPI_Wtime
  export _root_.mpi.functions.MSMPI_Queuelock_acquire
  export _root_.mpi.functions.MSMPI_Queuelock_release
  export _root_.mpi.functions.MSMPI_Request_set_apc
  export _root_.mpi.functions.MSMPI_Waitsome_interruptible
  export _root_.mpi.functions.PMPI_Abort
  export _root_.mpi.functions.PMPI_Accumulate
  export _root_.mpi.functions.PMPI_Add_error_class
  export _root_.mpi.functions.PMPI_Add_error_code
  export _root_.mpi.functions.PMPI_Add_error_string
  export _root_.mpi.functions.PMPI_Address
  export _root_.mpi.functions.PMPI_Aint_add
  export _root_.mpi.functions.PMPI_Aint_diff
  export _root_.mpi.functions.PMPI_Allgather
  export _root_.mpi.functions.PMPI_Allgatherv
  export _root_.mpi.functions.PMPI_Alloc_mem
  export _root_.mpi.functions.PMPI_Allreduce
  export _root_.mpi.functions.PMPI_Alltoall
  export _root_.mpi.functions.PMPI_Alltoallv
  export _root_.mpi.functions.PMPI_Alltoallw
  export _root_.mpi.functions.PMPI_Attr_delete
  export _root_.mpi.functions.PMPI_Attr_get
  export _root_.mpi.functions.PMPI_Attr_put
  export _root_.mpi.functions.PMPI_Barrier
  export _root_.mpi.functions.PMPI_Bcast
  export _root_.mpi.functions.PMPI_Bsend
  export _root_.mpi.functions.PMPI_Bsend_init
  export _root_.mpi.functions.PMPI_Buffer_attach
  export _root_.mpi.functions.PMPI_Buffer_detach
  export _root_.mpi.functions.PMPI_Cancel
  export _root_.mpi.functions.PMPI_Cart_coords
  export _root_.mpi.functions.PMPI_Cart_create
  export _root_.mpi.functions.PMPI_Cart_get
  export _root_.mpi.functions.PMPI_Cart_map
  export _root_.mpi.functions.PMPI_Cart_rank
  export _root_.mpi.functions.PMPI_Cart_shift
  export _root_.mpi.functions.PMPI_Cart_sub
  export _root_.mpi.functions.PMPI_Cartdim_get
  export _root_.mpi.functions.PMPI_Close_port
  export _root_.mpi.functions.PMPI_Comm_accept
  export _root_.mpi.functions.PMPI_Comm_call_errhandler
  export _root_.mpi.functions.PMPI_Comm_compare
  export _root_.mpi.functions.PMPI_Comm_connect
  export _root_.mpi.functions.PMPI_Comm_create
  export _root_.mpi.functions.PMPI_Comm_create_errhandler
  export _root_.mpi.functions.PMPI_Comm_create_keyval
  export _root_.mpi.functions.PMPI_Comm_delete_attr
  export _root_.mpi.functions.PMPI_Comm_disconnect
  export _root_.mpi.functions.PMPI_Comm_dup
  export _root_.mpi.functions.PMPI_Comm_free
  export _root_.mpi.functions.PMPI_Comm_free_keyval
  export _root_.mpi.functions.PMPI_Comm_get_attr
  export _root_.mpi.functions.PMPI_Comm_get_errhandler
  export _root_.mpi.functions.PMPI_Comm_get_name
  export _root_.mpi.functions.PMPI_Comm_get_parent
  export _root_.mpi.functions.PMPI_Comm_group
  export _root_.mpi.functions.PMPI_Comm_join
  export _root_.mpi.functions.PMPI_Comm_rank
  export _root_.mpi.functions.PMPI_Comm_remote_group
  export _root_.mpi.functions.PMPI_Comm_remote_size
  export _root_.mpi.functions.PMPI_Comm_set_attr
  export _root_.mpi.functions.PMPI_Comm_set_errhandler
  export _root_.mpi.functions.PMPI_Comm_set_name
  export _root_.mpi.functions.PMPI_Comm_size
  export _root_.mpi.functions.PMPI_Comm_spawn
  export _root_.mpi.functions.PMPI_Comm_spawn_multiple
  export _root_.mpi.functions.PMPI_Comm_split
  export _root_.mpi.functions.PMPI_Comm_split_type
  export _root_.mpi.functions.PMPI_Comm_test_inter
  export _root_.mpi.functions.PMPI_Compare_and_swap
  export _root_.mpi.functions.PMPI_Dims_create
  export _root_.mpi.functions.PMPI_Dist_graph_create
  export _root_.mpi.functions.PMPI_Dist_graph_create_adjacent
  export _root_.mpi.functions.PMPI_Dist_graph_neighbors
  export _root_.mpi.functions.PMPI_Dist_graph_neighbors_count
  export _root_.mpi.functions.PMPI_Errhandler_create
  export _root_.mpi.functions.PMPI_Errhandler_free
  export _root_.mpi.functions.PMPI_Errhandler_get
  export _root_.mpi.functions.PMPI_Errhandler_set
  export _root_.mpi.functions.PMPI_Error_class
  export _root_.mpi.functions.PMPI_Error_string
  export _root_.mpi.functions.PMPI_Exscan
  export _root_.mpi.functions.PMPI_Fetch_and_op
  export _root_.mpi.functions.PMPI_File_c2f
  export _root_.mpi.functions.PMPI_File_call_errhandler
  export _root_.mpi.functions.PMPI_File_close
  export _root_.mpi.functions.PMPI_File_create_errhandler
  export _root_.mpi.functions.PMPI_File_delete
  export _root_.mpi.functions.PMPI_File_f2c
  export _root_.mpi.functions.PMPI_File_get_amode
  export _root_.mpi.functions.PMPI_File_get_atomicity
  export _root_.mpi.functions.PMPI_File_get_byte_offset
  export _root_.mpi.functions.PMPI_File_get_errhandler
  export _root_.mpi.functions.PMPI_File_get_group
  export _root_.mpi.functions.PMPI_File_get_info
  export _root_.mpi.functions.PMPI_File_get_position
  export _root_.mpi.functions.PMPI_File_get_position_shared
  export _root_.mpi.functions.PMPI_File_get_size
  export _root_.mpi.functions.PMPI_File_get_type_extent
  export _root_.mpi.functions.PMPI_File_get_view
  export _root_.mpi.functions.PMPI_File_iread
  export _root_.mpi.functions.PMPI_File_iread_at
  export _root_.mpi.functions.PMPI_File_iread_shared
  export _root_.mpi.functions.PMPI_File_iwrite
  export _root_.mpi.functions.PMPI_File_iwrite_at
  export _root_.mpi.functions.PMPI_File_iwrite_shared
  export _root_.mpi.functions.PMPI_File_open
  export _root_.mpi.functions.PMPI_File_preallocate
  export _root_.mpi.functions.PMPI_File_read
  export _root_.mpi.functions.PMPI_File_read_all
  export _root_.mpi.functions.PMPI_File_read_all_begin
  export _root_.mpi.functions.PMPI_File_read_all_end
  export _root_.mpi.functions.PMPI_File_read_at
  export _root_.mpi.functions.PMPI_File_read_at_all
  export _root_.mpi.functions.PMPI_File_read_at_all_begin
  export _root_.mpi.functions.PMPI_File_read_at_all_end
  export _root_.mpi.functions.PMPI_File_read_ordered
  export _root_.mpi.functions.PMPI_File_read_ordered_begin
  export _root_.mpi.functions.PMPI_File_read_ordered_end
  export _root_.mpi.functions.PMPI_File_read_shared
  export _root_.mpi.functions.PMPI_File_seek
  export _root_.mpi.functions.PMPI_File_seek_shared
  export _root_.mpi.functions.PMPI_File_set_atomicity
  export _root_.mpi.functions.PMPI_File_set_errhandler
  export _root_.mpi.functions.PMPI_File_set_info
  export _root_.mpi.functions.PMPI_File_set_size
  export _root_.mpi.functions.PMPI_File_set_view
  export _root_.mpi.functions.PMPI_File_sync
  export _root_.mpi.functions.PMPI_File_write
  export _root_.mpi.functions.PMPI_File_write_all
  export _root_.mpi.functions.PMPI_File_write_all_begin
  export _root_.mpi.functions.PMPI_File_write_all_end
  export _root_.mpi.functions.PMPI_File_write_at
  export _root_.mpi.functions.PMPI_File_write_at_all
  export _root_.mpi.functions.PMPI_File_write_at_all_begin
  export _root_.mpi.functions.PMPI_File_write_at_all_end
  export _root_.mpi.functions.PMPI_File_write_ordered
  export _root_.mpi.functions.PMPI_File_write_ordered_begin
  export _root_.mpi.functions.PMPI_File_write_ordered_end
  export _root_.mpi.functions.PMPI_File_write_shared
  export _root_.mpi.functions.PMPI_Finalize
  export _root_.mpi.functions.PMPI_Finalized
  export _root_.mpi.functions.PMPI_Free_mem
  export _root_.mpi.functions.PMPI_Gather
  export _root_.mpi.functions.PMPI_Gatherv
  export _root_.mpi.functions.PMPI_Get
  export _root_.mpi.functions.PMPI_Get_accumulate
  export _root_.mpi.functions.PMPI_Get_address
  export _root_.mpi.functions.PMPI_Get_count
  export _root_.mpi.functions.PMPI_Get_elements
  export _root_.mpi.functions.PMPI_Get_elements_x
  export _root_.mpi.functions.PMPI_Get_library_version
  export _root_.mpi.functions.PMPI_Get_processor_name
  export _root_.mpi.functions.PMPI_Get_version
  export _root_.mpi.functions.PMPI_Graph_create
  export _root_.mpi.functions.PMPI_Graph_get
  export _root_.mpi.functions.PMPI_Graph_map
  export _root_.mpi.functions.PMPI_Graph_neighbors
  export _root_.mpi.functions.PMPI_Graph_neighbors_count
  export _root_.mpi.functions.PMPI_Graphdims_get
  export _root_.mpi.functions.PMPI_Grequest_complete
  export _root_.mpi.functions.PMPI_Grequest_start
  export _root_.mpi.functions.PMPI_Group_compare
  export _root_.mpi.functions.PMPI_Group_difference
  export _root_.mpi.functions.PMPI_Group_excl
  export _root_.mpi.functions.PMPI_Group_free
  export _root_.mpi.functions.PMPI_Group_incl
  export _root_.mpi.functions.PMPI_Group_intersection
  export _root_.mpi.functions.PMPI_Group_range_excl
  export _root_.mpi.functions.PMPI_Group_range_incl
  export _root_.mpi.functions.PMPI_Group_rank
  export _root_.mpi.functions.PMPI_Group_size
  export _root_.mpi.functions.PMPI_Group_translate_ranks
  export _root_.mpi.functions.PMPI_Group_union
  export _root_.mpi.functions.PMPI_Iallgather
  export _root_.mpi.functions.PMPI_Iallgatherv
  export _root_.mpi.functions.PMPI_Iallreduce
  export _root_.mpi.functions.PMPI_Ialltoall
  export _root_.mpi.functions.PMPI_Ialltoallv
  export _root_.mpi.functions.PMPI_Ialltoallw
  export _root_.mpi.functions.PMPI_Ibarrier
  export _root_.mpi.functions.PMPI_Ibcast
  export _root_.mpi.functions.PMPI_Ibsend
  export _root_.mpi.functions.PMPI_Iexscan
  export _root_.mpi.functions.PMPI_Igather
  export _root_.mpi.functions.PMPI_Igatherv
  export _root_.mpi.functions.PMPI_Improbe
  export _root_.mpi.functions.PMPI_Imrecv
  export _root_.mpi.functions.PMPI_Info_create
  export _root_.mpi.functions.PMPI_Info_delete
  export _root_.mpi.functions.PMPI_Info_dup
  export _root_.mpi.functions.PMPI_Info_free
  export _root_.mpi.functions.PMPI_Info_get
  export _root_.mpi.functions.PMPI_Info_get_nkeys
  export _root_.mpi.functions.PMPI_Info_get_nthkey
  export _root_.mpi.functions.PMPI_Info_get_valuelen
  export _root_.mpi.functions.PMPI_Info_set
  export _root_.mpi.functions.PMPI_Init
  export _root_.mpi.functions.PMPI_Init_thread
  export _root_.mpi.functions.PMPI_Initialized
  export _root_.mpi.functions.PMPI_Intercomm_create
  export _root_.mpi.functions.PMPI_Intercomm_merge
  export _root_.mpi.functions.PMPI_Iprobe
  export _root_.mpi.functions.PMPI_Irecv
  export _root_.mpi.functions.PMPI_Ireduce
  export _root_.mpi.functions.PMPI_Ireduce_scatter
  export _root_.mpi.functions.PMPI_Ireduce_scatter_block
  export _root_.mpi.functions.PMPI_Irsend
  export _root_.mpi.functions.PMPI_Is_thread_main
  export _root_.mpi.functions.PMPI_Iscan
  export _root_.mpi.functions.PMPI_Iscatter
  export _root_.mpi.functions.PMPI_Iscatterv
  export _root_.mpi.functions.PMPI_Isend
  export _root_.mpi.functions.PMPI_Issend
  export _root_.mpi.functions.PMPI_Keyval_create
  export _root_.mpi.functions.PMPI_Keyval_free
  export _root_.mpi.functions.PMPI_Lookup_name
  export _root_.mpi.functions.PMPI_Mprobe
  export _root_.mpi.functions.PMPI_Mrecv
  export _root_.mpi.functions.PMPI_Op_commutative
  export _root_.mpi.functions.PMPI_Op_create
  export _root_.mpi.functions.PMPI_Op_free
  export _root_.mpi.functions.PMPI_Open_port
  export _root_.mpi.functions.PMPI_Pack
  export _root_.mpi.functions.PMPI_Pack_external
  export _root_.mpi.functions.PMPI_Pack_external_size
  export _root_.mpi.functions.PMPI_Pack_size
  export _root_.mpi.functions.PMPI_Pcontrol
  export _root_.mpi.functions.PMPI_Probe
  export _root_.mpi.functions.PMPI_Publish_name
  export _root_.mpi.functions.PMPI_Put
  export _root_.mpi.functions.PMPI_Query_thread
  export _root_.mpi.functions.PMPI_Raccumulate
  export _root_.mpi.functions.PMPI_Recv
  export _root_.mpi.functions.PMPI_Recv_init
  export _root_.mpi.functions.PMPI_Reduce
  export _root_.mpi.functions.PMPI_Reduce_local
  export _root_.mpi.functions.PMPI_Reduce_scatter
  export _root_.mpi.functions.PMPI_Reduce_scatter_block
  export _root_.mpi.functions.PMPI_Register_datarep
  export _root_.mpi.functions.PMPI_Request_free
  export _root_.mpi.functions.PMPI_Request_get_status
  export _root_.mpi.functions.PMPI_Rget
  export _root_.mpi.functions.PMPI_Rget_accumulate
  export _root_.mpi.functions.PMPI_Rput
  export _root_.mpi.functions.PMPI_Rsend
  export _root_.mpi.functions.PMPI_Rsend_init
  export _root_.mpi.functions.PMPI_Scan
  export _root_.mpi.functions.PMPI_Scatter
  export _root_.mpi.functions.PMPI_Scatterv
  export _root_.mpi.functions.PMPI_Send
  export _root_.mpi.functions.PMPI_Send_init
  export _root_.mpi.functions.PMPI_Sendrecv
  export _root_.mpi.functions.PMPI_Sendrecv_replace
  export _root_.mpi.functions.PMPI_Ssend
  export _root_.mpi.functions.PMPI_Ssend_init
  export _root_.mpi.functions.PMPI_Start
  export _root_.mpi.functions.PMPI_Startall
  export _root_.mpi.functions.PMPI_Status_c2f
  export _root_.mpi.functions.PMPI_Status_f2c
  export _root_.mpi.functions.PMPI_Status_set_cancelled
  export _root_.mpi.functions.PMPI_Status_set_elements
  export _root_.mpi.functions.PMPI_Status_set_elements_x
  export _root_.mpi.functions.PMPI_Test
  export _root_.mpi.functions.PMPI_Test_cancelled
  export _root_.mpi.functions.PMPI_Testall
  export _root_.mpi.functions.PMPI_Testany
  export _root_.mpi.functions.PMPI_Testsome
  export _root_.mpi.functions.PMPI_Topo_test
  export _root_.mpi.functions.PMPI_Type_commit
  export _root_.mpi.functions.PMPI_Type_contiguous
  export _root_.mpi.functions.PMPI_Type_create_darray
  export _root_.mpi.functions.PMPI_Type_create_f90_complex
  export _root_.mpi.functions.PMPI_Type_create_f90_integer
  export _root_.mpi.functions.PMPI_Type_create_f90_real
  export _root_.mpi.functions.PMPI_Type_create_hindexed
  export _root_.mpi.functions.PMPI_Type_create_hindexed_block
  export _root_.mpi.functions.PMPI_Type_create_hvector
  export _root_.mpi.functions.PMPI_Type_create_indexed_block
  export _root_.mpi.functions.PMPI_Type_create_keyval
  export _root_.mpi.functions.PMPI_Type_create_resized
  export _root_.mpi.functions.PMPI_Type_create_struct
  export _root_.mpi.functions.PMPI_Type_create_subarray
  export _root_.mpi.functions.PMPI_Type_delete_attr
  export _root_.mpi.functions.PMPI_Type_dup
  export _root_.mpi.functions.PMPI_Type_extent
  export _root_.mpi.functions.PMPI_Type_free
  export _root_.mpi.functions.PMPI_Type_free_keyval
  export _root_.mpi.functions.PMPI_Type_get_attr
  export _root_.mpi.functions.PMPI_Type_get_contents
  export _root_.mpi.functions.PMPI_Type_get_envelope
  export _root_.mpi.functions.PMPI_Type_get_extent
  export _root_.mpi.functions.PMPI_Type_get_extent_x
  export _root_.mpi.functions.PMPI_Type_get_name
  export _root_.mpi.functions.PMPI_Type_get_true_extent
  export _root_.mpi.functions.PMPI_Type_get_true_extent_x
  export _root_.mpi.functions.PMPI_Type_hindexed
  export _root_.mpi.functions.PMPI_Type_hvector
  export _root_.mpi.functions.PMPI_Type_indexed
  export _root_.mpi.functions.PMPI_Type_lb
  export _root_.mpi.functions.PMPI_Type_match_size
  export _root_.mpi.functions.PMPI_Type_set_attr
  export _root_.mpi.functions.PMPI_Type_set_name
  export _root_.mpi.functions.PMPI_Type_size
  export _root_.mpi.functions.PMPI_Type_size_x
  export _root_.mpi.functions.PMPI_Type_struct
  export _root_.mpi.functions.PMPI_Type_ub
  export _root_.mpi.functions.PMPI_Type_vector
  export _root_.mpi.functions.PMPI_Unpack
  export _root_.mpi.functions.PMPI_Unpack_external
  export _root_.mpi.functions.PMPI_Unpublish_name
  export _root_.mpi.functions.PMPI_Wait
  export _root_.mpi.functions.PMPI_Waitall
  export _root_.mpi.functions.PMPI_Waitany
  export _root_.mpi.functions.PMPI_Waitsome
  export _root_.mpi.functions.PMPI_Win_allocate
  export _root_.mpi.functions.PMPI_Win_allocate_shared
  export _root_.mpi.functions.PMPI_Win_attach
  export _root_.mpi.functions.PMPI_Win_call_errhandler
  export _root_.mpi.functions.PMPI_Win_complete
  export _root_.mpi.functions.PMPI_Win_create
  export _root_.mpi.functions.PMPI_Win_create_dynamic
  export _root_.mpi.functions.PMPI_Win_create_errhandler
  export _root_.mpi.functions.PMPI_Win_create_keyval
  export _root_.mpi.functions.PMPI_Win_delete_attr
  export _root_.mpi.functions.PMPI_Win_detach
  export _root_.mpi.functions.PMPI_Win_fence
  export _root_.mpi.functions.PMPI_Win_flush
  export _root_.mpi.functions.PMPI_Win_flush_all
  export _root_.mpi.functions.PMPI_Win_flush_local
  export _root_.mpi.functions.PMPI_Win_flush_local_all
  export _root_.mpi.functions.PMPI_Win_free
  export _root_.mpi.functions.PMPI_Win_free_keyval
  export _root_.mpi.functions.PMPI_Win_get_attr
  export _root_.mpi.functions.PMPI_Win_get_errhandler
  export _root_.mpi.functions.PMPI_Win_get_group
  export _root_.mpi.functions.PMPI_Win_get_name
  export _root_.mpi.functions.PMPI_Win_lock
  export _root_.mpi.functions.PMPI_Win_lock_all
  export _root_.mpi.functions.PMPI_Win_post
  export _root_.mpi.functions.PMPI_Win_set_attr
  export _root_.mpi.functions.PMPI_Win_set_errhandler
  export _root_.mpi.functions.PMPI_Win_set_name
  export _root_.mpi.functions.PMPI_Win_shared_query
  export _root_.mpi.functions.PMPI_Win_start
  export _root_.mpi.functions.PMPI_Win_sync
  export _root_.mpi.functions.PMPI_Win_test
  export _root_.mpi.functions.PMPI_Win_unlock
  export _root_.mpi.functions.PMPI_Win_unlock_all
  export _root_.mpi.functions.PMPI_Win_wait
  export _root_.mpi.functions.PMPI_Wtick
  export _root_.mpi.functions.PMPI_Wtime