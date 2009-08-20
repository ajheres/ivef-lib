######################################################################
# Automatically generated by qmake (2.01a) Wed Jul 30 09:18:51 2008
######################################################################

DESTDIR = bin
MOC_DIR = tmp/moc
OBJECTS_DIR = tmp/objects
TEMPLATE = lib
macx {
   CONFIG += lib_bundle 
   FRAMEWORK_HEADERS.version = VERSION
   FRAMEWORK_HEADERS.files = \
	IVEFArea.h \
	IVEFBody.h \
	IVEFHeader.h \
	IVEFItem.h \
	IVEFLoginRequest.h \
	IVEFLoginResponse.h \
	IVEFLogout.h \
	IVEFMSG_LoginRequest.h \
	IVEFMSG_LoginResponse.h \
	IVEFMSG_Logout.h \
	IVEFMSG_Ping.h \
	IVEFMSG_Pong.h \
	IVEFMSG_ServerStatus.h \
	IVEFMSG_ServiceRequest.h \
	IVEFMSG_VesselData.h \
	IVEFObject.h \
	IVEFParser.h \
	IVEFPing.h \
	IVEFPong.h \
	IVEFPos.h \
	IVEFPosReport.h \
	IVEFSchema.h \
	IVEFSensor.h \
	IVEFServerStatus.h \
	IVEFServiceRequest.h \
	IVEFStaticData.h \
	IVEFTransmission.h \
	IVEFVesselData.h \
	IVEFVoyage.h

   FRAMEWORK_HEADERS.path = .
   QMAKE_BUNDLE_DATA += FRAMEWORK_HEADERS
}
TARGET = ivef
DEPENDPATH += .
INCLUDEPATH += .

# Input
HEADERS += \
	IVEFArea.h \
	IVEFBody.h \
	IVEFHeader.h \
	IVEFItem.h \
	IVEFLoginRequest.h \
	IVEFLoginResponse.h \
	IVEFLogout.h \
	IVEFMSG_LoginRequest.h \
	IVEFMSG_LoginResponse.h \
	IVEFMSG_Logout.h \
	IVEFMSG_Ping.h \
	IVEFMSG_Pong.h \
	IVEFMSG_ServerStatus.h \
	IVEFMSG_ServiceRequest.h \
	IVEFMSG_VesselData.h \
	IVEFObject.h \
	IVEFParser.h \
	IVEFPing.h \
	IVEFPong.h \
	IVEFPos.h \
	IVEFPosReport.h \
	IVEFSchema.h \
	IVEFSensor.h \
	IVEFServerStatus.h \
	IVEFServiceRequest.h \
	IVEFStaticData.h \
	IVEFTransmission.h \
	IVEFVesselData.h \
	IVEFVoyage.h
SOURCES += \
	IVEFArea.cpp \
	IVEFBody.cpp \
	IVEFHeader.cpp \
	IVEFItem.cpp \
	IVEFLoginRequest.cpp \
	IVEFLoginResponse.cpp \
	IVEFLogout.cpp \
	IVEFMSG_LoginRequest.cpp \
	IVEFMSG_LoginResponse.cpp \
	IVEFMSG_Logout.cpp \
	IVEFMSG_Ping.cpp \
	IVEFMSG_Pong.cpp \
	IVEFMSG_ServerStatus.cpp \
	IVEFMSG_ServiceRequest.cpp \
	IVEFMSG_VesselData.cpp \
	IVEFObject.cpp \
	IVEFParser.cpp \
	IVEFPing.cpp \
	IVEFPong.cpp \
	IVEFPos.cpp \
	IVEFPosReport.cpp \
	IVEFSchema.cpp \
	IVEFSensor.cpp \
	IVEFServerStatus.cpp \
	IVEFServiceRequest.cpp \
	IVEFStaticData.cpp \
	IVEFTransmission.cpp \
	IVEFVesselData.cpp \
	IVEFVoyage.cpp

QT += xml
