SELECT 'Upgrading MetaStore schema from 3.2.0 to 4.0.0';

-- HIVE-19416
ALTER TABLE "TBLS" ADD "WRITE_ID" bigint DEFAULT 0;
ALTER TABLE "PARTITIONS" ADD "WRITE_ID" bigint DEFAULT 0;


-- HIVE-20793
ALTER TABLE "WM_RESOURCEPLAN" ADD "NS" character varying(128);
UPDATE "WM_RESOURCEPLAN" SET "NS" = 'default' WHERE "NS" IS NULL;
ALTER TABLE "WM_RESOURCEPLAN" DROP CONSTRAINT "UNIQUE_WM_RESOURCEPLAN";
ALTER TABLE ONLY "WM_RESOURCEPLAN" ADD CONSTRAINT "UNIQUE_WM_RESOURCEPLAN" UNIQUE ("NS", "NAME");

-- HIVE-21063
CREATE UNIQUE INDEX "NOTIFICATION_LOG_EVENT_ID" ON "NOTIFICATION_LOG" USING btree ("EVENT_ID");

-- HIVE-22046 (DEFAULT HIVE)
ALTER TABLE "TAB_COL_STATS" ADD "ENGINE" character varying(128);
UPDATE "TAB_COL_STATS" SET "ENGINE" = 'hive' WHERE "ENGINE" IS NULL;
ALTER TABLE "PART_COL_STATS" ADD "ENGINE" character varying(128);
UPDATE "PART_COL_STATS" SET "ENGINE" = 'hive' WHERE "ENGINE" IS NULL;

CREATE TABLE "SCHEDULED_QUERIES" (
	"SCHEDULED_QUERY_ID" BIGINT NOT NULL,
	"CLUSTER_NAMESPACE" VARCHAR(256),
	"ENABLED" boolean NOT NULL,
	"NEXT_EXECUTION" INTEGER,
	"QUERY" VARCHAR(4000),
	"SCHEDULE" VARCHAR(256),
	"SCHEDULE_NAME" VARCHAR(256),
	"USER" VARCHAR(256),
	CONSTRAINT SCHEDULED_QUERIES_PK PRIMARY KEY ("SCHEDULED_QUERY_ID")
);

CREATE TABLE "SCHEDULED_EXECUTIONS" (
	"SCHEDULED_EXECUTION_ID" BIGINT NOT NULL,
	"END_TIME" INTEGER,
	"ERROR_MESSAGE" VARCHAR(2000),
	"EXECUTOR_QUERY_ID" VARCHAR(256),
	"LAST_UPDATE_TIME" INTEGER,
	"SCHEDULED_QUERY_ID" BIGINT,
	"START_TIME" INTEGER,
	"STATE" VARCHAR(256),
	CONSTRAINT SCHEDULED_EXECUTIONS_PK PRIMARY KEY ("SCHEDULED_EXECUTION_ID"),
	CONSTRAINT SCHEDULED_EXECUTIONS_SCHQ_FK FOREIGN KEY ("SCHEDULED_QUERY_ID") REFERENCES "SCHEDULED_QUERIES"("SCHEDULED_QUERY_ID") ON DELETE CASCADE
);

CREATE INDEX IDX_SCHEDULED_EXECUTIONS_LAST_UPDATE_TIME ON "SCHEDULED_EXECUTIONS" ("LAST_UPDATE_TIME");
CREATE INDEX IDX_SCHEDULED_EXECUTIONS_SCHEDULED_QUERY_ID ON "SCHEDULED_EXECUTIONS" ("SCHEDULED_QUERY_ID");
CREATE UNIQUE INDEX UNIQUE_SCHEDULED_EXECUTIONS_ID ON "SCHEDULED_EXECUTIONS" ("SCHEDULED_EXECUTION_ID");

-- HIVE-22546

ALTER TABLE aux_table RENAME TO "AUX_TABLE";
ALTER TABLE "AUX_TABLE" RENAME COLUMN mt_key1 TO "MT_KEY1";
ALTER TABLE "AUX_TABLE" RENAME COLUMN mt_key2 TO "MT_KEY2";
ALTER TABLE "AUX_TABLE" RENAME COLUMN mt_comment TO "MT_COMMENT";

ALTER TABLE compaction_queue RENAME TO "COMPACTION_QUEUE";
ALTER TABLE "COMPACTION_QUEUE" RENAME COLUMN cq_id TO "CQ_ID";
ALTER TABLE "COMPACTION_QUEUE" RENAME COLUMN cq_database TO "CQ_DATABASE";
ALTER TABLE "COMPACTION_QUEUE" RENAME COLUMN cq_table TO "CQ_TABLE";
ALTER TABLE "COMPACTION_QUEUE" RENAME COLUMN cq_partition TO "CQ_PARTITION";
ALTER TABLE "COMPACTION_QUEUE" RENAME COLUMN cq_state TO "CQ_STATE";
ALTER TABLE "COMPACTION_QUEUE" RENAME COLUMN cq_type TO "CQ_TYPE";
ALTER TABLE "COMPACTION_QUEUE" RENAME COLUMN cq_tblproperties TO "CQ_TBLPROPERTIES";
ALTER TABLE "COMPACTION_QUEUE" RENAME COLUMN cq_worker_id TO "CQ_WORKER_ID";
ALTER TABLE "COMPACTION_QUEUE" RENAME COLUMN cq_start TO "CQ_START";
ALTER TABLE "COMPACTION_QUEUE" RENAME COLUMN cq_run_as TO "CQ_RUN_AS";
ALTER TABLE "COMPACTION_QUEUE" RENAME COLUMN cq_highest_write_id TO "CQ_HIGHEST_WRITE_ID";
ALTER TABLE "COMPACTION_QUEUE" RENAME COLUMN cq_meta_info TO "CQ_META_INFO";
ALTER TABLE "COMPACTION_QUEUE" RENAME COLUMN cq_hadoop_job_id TO "CQ_HADOOP_JOB_ID";

ALTER TABLE completed_compactions RENAME TO "COMPLETED_COMPACTIONS";
ALTER TABLE "COMPLETED_COMPACTIONS" RENAME COLUMN cc_id TO "CC_ID";
ALTER TABLE "COMPLETED_COMPACTIONS" RENAME COLUMN cc_database TO "CC_DATABASE";
ALTER TABLE "COMPLETED_COMPACTIONS" RENAME COLUMN cc_table TO "CC_TABLE";
ALTER TABLE "COMPLETED_COMPACTIONS" RENAME COLUMN cc_partition TO "CC_PARTITION";
ALTER TABLE "COMPLETED_COMPACTIONS" RENAME COLUMN cc_state TO "CC_STATE";
ALTER TABLE "COMPLETED_COMPACTIONS" RENAME COLUMN cc_type TO "CC_TYPE";
ALTER TABLE "COMPLETED_COMPACTIONS" RENAME COLUMN cc_tblproperties TO "CC_TBLPROPERTIES";
ALTER TABLE "COMPLETED_COMPACTIONS" RENAME COLUMN cc_worker_id TO "CC_WORKER_ID";
ALTER TABLE "COMPLETED_COMPACTIONS" RENAME COLUMN cc_start TO "CC_START";
ALTER TABLE "COMPLETED_COMPACTIONS" RENAME COLUMN cc_end TO "CC_END";
ALTER TABLE "COMPLETED_COMPACTIONS" RENAME COLUMN cc_run_as TO "CC_RUN_AS";
ALTER TABLE "COMPLETED_COMPACTIONS" RENAME COLUMN cc_highest_write_id TO "CC_HIGHEST_WRITE_ID";
ALTER TABLE "COMPLETED_COMPACTIONS" RENAME COLUMN cc_meta_info TO "CC_META_INFO";
ALTER TABLE "COMPLETED_COMPACTIONS" RENAME COLUMN cc_hadoop_job_id TO "CC_HADOOP_JOB_ID";

ALTER TABLE completed_txn_components RENAME TO "COMPLETED_TXN_COMPONENTS";
ALTER TABLE "COMPLETED_TXN_COMPONENTS" RENAME COLUMN ctc_txnid TO "CTC_TXNID";
ALTER TABLE "COMPLETED_TXN_COMPONENTS" RENAME COLUMN ctc_database TO "CTC_DATABASE";
ALTER TABLE "COMPLETED_TXN_COMPONENTS" RENAME COLUMN ctc_table TO "CTC_TABLE";
ALTER TABLE "COMPLETED_TXN_COMPONENTS" RENAME COLUMN ctc_partition TO "CTC_PARTITION";
ALTER TABLE "COMPLETED_TXN_COMPONENTS" RENAME COLUMN ctc_timestamp TO "CTC_TIMESTAMP";
ALTER TABLE "COMPLETED_TXN_COMPONENTS" RENAME COLUMN ctc_writeid TO "CTC_WRITEID";
ALTER TABLE "COMPLETED_TXN_COMPONENTS" RENAME COLUMN ctc_update_delete TO "CTC_UPDATE_DELETE";

ALTER TABLE hive_locks RENAME TO "HIVE_LOCKS";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_lock_ext_id TO "HL_LOCK_EXT_ID";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_lock_int_id TO "HL_LOCK_INT_ID";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_txnid TO "HL_TXNID";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_db TO "HL_DB";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_table TO "HL_TABLE";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_partition TO "HL_PARTITION";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_lock_state TO "HL_LOCK_STATE";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_lock_type TO "HL_LOCK_TYPE";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_last_heartbeat TO "HL_LAST_HEARTBEAT";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_acquired_at TO "HL_ACQUIRED_AT";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_user TO "HL_USER";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_host TO "HL_HOST";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_heartbeat_count TO "HL_HEARTBEAT_COUNT";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_agent_info TO "HL_AGENT_INFO";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_blockedby_ext_id TO "HL_BLOCKEDBY_EXT_ID";
ALTER TABLE "HIVE_LOCKS" RENAME COLUMN hl_blockedby_int_id TO "HL_BLOCKEDBY_INT_ID";

ALTER TABLE materialization_rebuild_locks RENAME TO "MATERIALIZATION_REBUILD_LOCKS";
ALTER TABLE "MATERIALIZATION_REBUILD_LOCKS" RENAME COLUMN mrl_txn_id TO "MRL_TXN_ID";
ALTER TABLE "MATERIALIZATION_REBUILD_LOCKS" RENAME COLUMN mrl_db_name TO "MRL_DB_NAME";
ALTER TABLE "MATERIALIZATION_REBUILD_LOCKS" RENAME COLUMN mrl_tbl_name TO "MRL_TBL_NAME";
ALTER TABLE "MATERIALIZATION_REBUILD_LOCKS" RENAME COLUMN mrl_last_heartbeat TO "MRL_LAST_HEARTBEAT";

ALTER TABLE min_history_level RENAME TO "MIN_HISTORY_LEVEL";
ALTER TABLE "MIN_HISTORY_LEVEL" RENAME COLUMN mhl_txnid TO "MHL_TXNID";
ALTER TABLE "MIN_HISTORY_LEVEL" RENAME COLUMN mhl_min_open_txnid TO "MHL_MIN_OPEN_TXNID";

ALTER TABLE next_compaction_queue_id RENAME TO "NEXT_COMPACTION_QUEUE_ID";
ALTER TABLE "NEXT_COMPACTION_QUEUE_ID" RENAME COLUMN ncq_next TO "NCQ_NEXT";

ALTER TABLE next_lock_id RENAME TO "NEXT_LOCK_ID";
ALTER TABLE "NEXT_LOCK_ID" RENAME COLUMN nl_next TO "NL_NEXT";

ALTER TABLE next_txn_id RENAME TO "NEXT_TXN_ID";
ALTER TABLE "NEXT_TXN_ID" RENAME COLUMN ntxn_next TO "NTXN_NEXT";

ALTER TABLE next_write_id RENAME TO "NEXT_WRITE_ID";
ALTER TABLE "NEXT_WRITE_ID" RENAME COLUMN nwi_database TO "NWI_DATABASE";
ALTER TABLE "NEXT_WRITE_ID" RENAME COLUMN nwi_table TO "NWI_TABLE";
ALTER TABLE "NEXT_WRITE_ID" RENAME COLUMN nwi_next TO "NWI_NEXT";

ALTER TABLE repl_txn_map RENAME TO "REPL_TXN_MAP";
ALTER TABLE "REPL_TXN_MAP" RENAME COLUMN rtm_repl_policy TO "RTM_REPL_POLICY";
ALTER TABLE "REPL_TXN_MAP" RENAME COLUMN rtm_src_txn_id TO "RTM_SRC_TXN_ID";
ALTER TABLE "REPL_TXN_MAP" RENAME COLUMN rtm_target_txn_id TO "RTM_TARGET_TXN_ID";

ALTER TABLE runtime_stats RENAME TO "RUNTIME_STATS";
ALTER TABLE "RUNTIME_STATS" RENAME COLUMN rs_id TO "RS_ID";
ALTER TABLE "RUNTIME_STATS" RENAME COLUMN create_time TO "CREATE_TIME";
ALTER TABLE "RUNTIME_STATS" RENAME COLUMN weight TO "WEIGHT";
ALTER TABLE "RUNTIME_STATS" RENAME COLUMN payload TO "PAYLOAD";

ALTER TABLE txn_components RENAME TO "TXN_COMPONENTS";
ALTER TABLE "TXN_COMPONENTS" RENAME COLUMN tc_txnid TO "TC_TXNID";
ALTER TABLE "TXN_COMPONENTS" RENAME COLUMN tc_database TO "TC_DATABASE";
ALTER TABLE "TXN_COMPONENTS" RENAME COLUMN tc_table TO "TC_TABLE";
ALTER TABLE "TXN_COMPONENTS" RENAME COLUMN tc_partition TO "TC_PARTITION";
ALTER TABLE "TXN_COMPONENTS" RENAME COLUMN tc_operation_type TO "TC_OPERATION_TYPE";
ALTER TABLE "TXN_COMPONENTS" RENAME COLUMN tc_writeid TO "TC_WRITEID";

ALTER TABLE txn_to_write_id RENAME TO "TXN_TO_WRITE_ID";
ALTER TABLE "TXN_TO_WRITE_ID" RENAME COLUMN t2w_txnid TO "T2W_TXNID";
ALTER TABLE "TXN_TO_WRITE_ID" RENAME COLUMN t2w_database TO "T2W_DATABASE";
ALTER TABLE "TXN_TO_WRITE_ID" RENAME COLUMN t2w_table TO "T2W_TABLE";
ALTER TABLE "TXN_TO_WRITE_ID" RENAME COLUMN t2w_writeid TO "T2W_WRITEID";

ALTER TABLE txns RENAME TO "TXNS";
ALTER TABLE "TXNS" RENAME COLUMN txn_id TO "TXN_ID";
ALTER TABLE "TXNS" RENAME COLUMN txn_state TO "TXN_STATE";
ALTER TABLE "TXNS" RENAME COLUMN txn_started TO "TXN_STARTED";
ALTER TABLE "TXNS" RENAME COLUMN txn_last_heartbeat TO "TXN_LAST_HEARTBEAT";
ALTER TABLE "TXNS" RENAME COLUMN txn_user TO "TXN_USER";
ALTER TABLE "TXNS" RENAME COLUMN txn_host TO "TXN_HOST";
ALTER TABLE "TXNS" RENAME COLUMN txn_agent_info TO "TXN_AGENT_INFO";
ALTER TABLE "TXNS" RENAME COLUMN txn_meta_info TO "TXN_META_INFO";
ALTER TABLE "TXNS" RENAME COLUMN txn_heartbeat_count TO "TXN_HEARTBEAT_COUNT";
ALTER TABLE "TXNS" RENAME COLUMN txn_type TO "TXN_TYPE";

ALTER TABLE write_set RENAME TO "WRITE_SET";
ALTER TABLE "WRITE_SET" RENAME COLUMN ws_database TO "WS_DATABASE";
ALTER TABLE "WRITE_SET" RENAME COLUMN ws_table TO "WS_TABLE";
ALTER TABLE "WRITE_SET" RENAME COLUMN ws_partition TO "WS_PARTITION";
ALTER TABLE "WRITE_SET" RENAME COLUMN ws_txnid TO "WS_TXNID";
ALTER TABLE "WRITE_SET" RENAME COLUMN ws_commit_id TO "WS_COMMIT_ID";
ALTER TABLE "WRITE_SET" RENAME COLUMN ws_operation_type TO "WS_OPERATION_TYPE";

-- HIVE-22729
ALTER TABLE "COMPACTION_QUEUE" ADD "CQ_ERROR_MESSAGE" text;
ALTER TABLE "COMPLETED_COMPACTIONS" ADD "CC_ERROR_MESSAGE" text;

-- HIVE-23683
ALTER TABLE "COMPACTION_QUEUE" ADD "CQ_ENQUEUE_TIME" bigint;
ALTER TABLE "COMPLETED_COMPACTIONS" ADD "CC_ENQUEUE_TIME" bigint;

-- HIVE-22728
ALTER TABLE "KEY_CONSTRAINTS" DROP CONSTRAINT "KEY_CONSTRAINTS_pkey";
ALTER TABLE "KEY_CONSTRAINTS" ADD CONSTRAINT "CONSTRAINTS_PK" PRIMARY KEY ("PARENT_TBL_ID", "CONSTRAINT_NAME", "POSITION");

-- HIVE-21487
CREATE INDEX "COMPLETED_COMPACTIONS_RES" ON "COMPLETED_COMPACTIONS" ("CC_DATABASE","CC_TABLE","CC_PARTITION");
-- HIVE-22872
ALTER TABLE "SCHEDULED_QUERIES" ADD "ACTIVE_EXECUTION_ID" bigint;

-- HIVE-22995
ALTER TABLE "DBS" ADD "DB_MANAGED_LOCATION_URI" character varying(4000);

-- HIVE-23107
ALTER TABLE "COMPACTION_QUEUE" ADD "CQ_NEXT_TXN_ID" bigint;

-- HIVE-23048
INSERT INTO "TXNS" ("TXN_ID", "TXN_STATE", "TXN_STARTED", "TXN_LAST_HEARTBEAT", "TXN_USER", "TXN_HOST")
  SELECT COALESCE(MAX("CTC_TXNID"),0), 'c', 0, 0, '', '' FROM "COMPLETED_TXN_COMPONENTS";
CREATE SEQUENCE "TXNS_TXN_ID_SEQ" MINVALUE 0 OWNED BY "TXNS"."TXN_ID";
select setval('"TXNS_TXN_ID_SEQ"',  (SELECT MAX("TXN_ID") FROM "TXNS"));
ALTER TABLE "TXNS" ALTER "TXN_ID" SET DEFAULT nextval('"TXNS_TXN_ID_SEQ"');

ALTER TABLE "NEXT_TXN_ID" RENAME TO "TXN_LOCK_TBL";
ALTER TABLE "TXN_LOCK_TBL" RENAME COLUMN "NTXN_NEXT" TO "TXN_LOCK";


--Create table replication metrics
CREATE TABLE "REPLICATION_METRICS" (
  "RM_SCHEDULED_EXECUTION_ID" bigint NOT NULL,
  "RM_POLICY" varchar(256) NOT NULL,
  "RM_DUMP_EXECUTION_ID" bigint NOT NULL,
  "RM_METADATA" varchar(4000),
  "RM_PROGRESS" varchar(4000),
  "RM_START_TIME" integer NOT NULL,
  PRIMARY KEY("RM_SCHEDULED_EXECUTION_ID")
);

--Increase the size of RM_PROGRESS to accomodate the replication statistics
ALTER TABLE "REPLICATION_METRICS" ALTER "RM_PROGRESS" TYPE varchar(24000);

ALTER TABLE "REPLICATION_METRICS" ALTER "RM_PROGRESS" TYPE varchar(10000);

ALTER TABLE "REPLICATION_METRICS" ADD "MESSAGE_FORMAT" varchar(16) DEFAULT 'json-0.2';

--Create indexes for the replication metrics table
CREATE INDEX "POLICY_IDX" ON "REPLICATION_METRICS" ("RM_POLICY");
CREATE INDEX "DUMP_IDX" ON "REPLICATION_METRICS" ("RM_DUMP_EXECUTION_ID");

-- Create stored procedure tables
CREATE TABLE "STORED_PROCS" (
  "SP_ID" BIGINT NOT NULL,
  "CREATE_TIME" INTEGER NOT NULL,
  "DB_ID" BIGINT NOT NULL,
  "NAME" VARCHAR(256) NOT NULL,
  "OWNER_NAME" VARCHAR(128) NOT NULL,
  "SOURCE" TEXT NOT NULL,
  PRIMARY KEY ("SP_ID")
);

CREATE UNIQUE INDEX "UNIQUESTOREDPROC" ON "STORED_PROCS" ("NAME", "DB_ID");
ALTER TABLE ONLY "STORED_PROCS" ADD CONSTRAINT "STOREDPROC_FK1" FOREIGN KEY ("DB_ID") REFERENCES "DBS" ("DB_ID") DEFERRABLE;

-- Create stored procedure tables
CREATE TABLE "PACKAGES" (
  "PKG_ID" BIGINT NOT NULL,
  "CREATE_TIME" INTEGER NOT NULL,
  "DB_ID" BIGINT NOT NULL,
  "NAME" VARCHAR(256) NOT NULL,
  "OWNER_NAME" VARCHAR(128) NOT NULL,
  "HEADER" TEXT NOT NULL,
  "BODY" TEXT NOT NULL,
  PRIMARY KEY ("PKG_ID")
);

CREATE UNIQUE INDEX "UNIQUEPKG" ON "PACKAGES" ("NAME", "DB_ID");
ALTER TABLE ONLY "PACKAGES" ADD CONSTRAINT "PACKAGES_FK1" FOREIGN KEY ("DB_ID") REFERENCES "DBS" ("DB_ID")  DEFERRABLE;

-- HIVE-24291
ALTER TABLE "COMPACTION_QUEUE" ADD "CQ_TXN_ID" bigint;

-- HIVE-24275
ALTER TABLE "COMPACTION_QUEUE" ADD "CQ_COMMIT_TIME" bigint;

-- HIVE-24770
UPDATE "SERDES" SET "SLIB"='org.apache.hadoop.hive.serde2.MultiDelimitSerDe' where "SLIB"='org.apache.hadoop.hive.contrib.serde2.MultiDelimitSerDe';

-- HIVE-24880
ALTER TABLE "COMPACTION_QUEUE" ADD "CQ_INITIATOR_ID" varchar(128);
ALTER TABLE "COMPACTION_QUEUE" ADD "CQ_INITIATOR_VERSION" varchar(128);
ALTER TABLE "COMPACTION_QUEUE" ADD "CQ_WORKER_VERSION" varchar(128);
ALTER TABLE "COMPLETED_COMPACTIONS" ADD "CC_INITIATOR_ID" varchar(128);
ALTER TABLE "COMPLETED_COMPACTIONS" ADD "CC_INITIATOR_VERSION" varchar(128);
ALTER TABLE "COMPLETED_COMPACTIONS" ADD "CC_WORKER_VERSION" varchar(128);

-- HIVE-24396
-- Create DataConnectors and DataConnector_Params tables
CREATE TABLE "DATACONNECTORS" (
  "NAME" character varying(128) NOT NULL,
  "TYPE" character varying(32) NOT NULL,
  "URL" character varying(4000) NOT NULL,
  "COMMENT" character varying(256),
  "OWNER_NAME" character varying(256),
  "OWNER_TYPE" character varying(10),
  "CREATE_TIME" INTEGER NOT NULL,
  PRIMARY KEY ("NAME")
);

CREATE TABLE "DATACONNECTOR_PARAMS" (
  "NAME" character varying(128) NOT NULL,
  "PARAM_KEY" character varying(180) NOT NULL,
  "PARAM_VALUE" character varying(4000),
  PRIMARY KEY ("NAME", "PARAM_KEY"),
  CONSTRAINT "DATACONNECTOR_NAME_FK1" FOREIGN KEY ("NAME") REFERENCES "DATACONNECTORS"("NAME") ON DELETE CASCADE
);
ALTER TABLE "DBS" ADD "TYPE" character varying(32) DEFAULT 'NATIVE' NOT NULL;
ALTER TABLE "DBS" ADD "DATACONNECTOR_NAME" character varying(128);
ALTER TABLE "DBS" ADD "REMOTE_DBNAME" character varying(128);
UPDATE "DBS" SET "TYPE"= 'NATIVE' WHERE "TYPE" IS NULL;


CREATE TABLE "DC_PRIVS" (
                            "DC_GRANT_ID" bigint NOT NULL,
                            "CREATE_TIME" bigint NOT NULL,
                            "NAME" character varying(128),
                            "GRANT_OPTION" smallint NOT NULL,
                            "GRANTOR" character varying(128) DEFAULT NULL::character varying,
                            "GRANTOR_TYPE" character varying(128) DEFAULT NULL::character varying,
                            "PRINCIPAL_NAME" character varying(128) DEFAULT NULL::character varying,
                            "PRINCIPAL_TYPE" character varying(128) DEFAULT NULL::character varying,
                            "DC_PRIV" character varying(128) DEFAULT NULL::character varying,
                            "AUTHORIZER" character varying(128) DEFAULT NULL::character varying
);

ALTER TABLE ONLY "DC_PRIVS"
    ADD CONSTRAINT "DCPRIVILEGEINDEX" UNIQUE ("AUTHORIZER", "NAME", "PRINCIPAL_NAME", "PRINCIPAL_TYPE", "DC_PRIV", "GRANTOR", "GRANTOR_TYPE");

ALTER TABLE ONLY "DC_PRIVS"
    ADD CONSTRAINT "DC_PRIVS_pkey" PRIMARY KEY ("DC_GRANT_ID");

CREATE INDEX "DC_PRIVS_N49" ON "DC_PRIVS" USING btree ("NAME");

ALTER TABLE ONLY "DC_PRIVS"
    ADD CONSTRAINT "DC_PRIVS_DC_ID_fkey" FOREIGN KEY ("NAME") REFERENCES "DATACONNECTORS"("NAME") DEFERRABLE;

-- HIVE-24911
CREATE INDEX "SDS_N50" ON "SDS" USING btree ("CD_ID");

-- HIVE-25656
ALTER TABLE "MV_TABLES_USED" ADD "INSERTED_COUNT" bigint NOT NULL DEFAULT 0;
ALTER TABLE "MV_TABLES_USED" ADD "UPDATED_COUNT" bigint NOT NULL DEFAULT 0;
ALTER TABLE "MV_TABLES_USED" ADD "DELETED_COUNT" bigint NOT NULL DEFAULT 0;
ALTER TABLE "MV_TABLES_USED" ADD CONSTRAINT "MV_TABLES_USED_PK" PRIMARY KEY ("TBL_ID", "MV_CREATION_METADATA_ID");

-- HIVE-25737
ALTER TABLE "COMPACTION_QUEUE" ADD "CQ_CLEANER_START" bigint;

-- These lines need to be last. Insert any changes above.
UPDATE "VERSION" SET "SCHEMA_VERSION"='4.0.0', "VERSION_COMMENT"='Hive release version 4.0.0' where "VER_ID"=1;
SELECT 'Finished upgrading MetaStore schema from 3.2.0 to 4.0.0';
