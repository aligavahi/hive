<?php
namespace metastore;

/**
 * Autogenerated by Thrift Compiler (0.16.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class TxnInfo
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'id',
            'isRequired' => true,
            'type' => TType::I64,
        ),
        2 => array(
            'var' => 'state',
            'isRequired' => true,
            'type' => TType::I32,
            'class' => '\metastore\TxnState',
        ),
        3 => array(
            'var' => 'user',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        4 => array(
            'var' => 'hostname',
            'isRequired' => true,
            'type' => TType::STRING,
        ),
        5 => array(
            'var' => 'agentInfo',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        6 => array(
            'var' => 'heartbeatCount',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        7 => array(
            'var' => 'metaInfo',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        8 => array(
            'var' => 'startedTime',
            'isRequired' => false,
            'type' => TType::I64,
        ),
        9 => array(
            'var' => 'lastHeartbeatTime',
            'isRequired' => false,
            'type' => TType::I64,
        ),
    );

    /**
     * @var int
     */
    public $id = null;
    /**
     * @var int
     */
    public $state = null;
    /**
     * @var string
     */
    public $user = null;
    /**
     * @var string
     */
    public $hostname = null;
    /**
     * @var string
     */
    public $agentInfo = "Unknown";
    /**
     * @var int
     */
    public $heartbeatCount = 0;
    /**
     * @var string
     */
    public $metaInfo = null;
    /**
     * @var int
     */
    public $startedTime = null;
    /**
     * @var int
     */
    public $lastHeartbeatTime = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['id'])) {
                $this->id = $vals['id'];
            }
            if (isset($vals['state'])) {
                $this->state = $vals['state'];
            }
            if (isset($vals['user'])) {
                $this->user = $vals['user'];
            }
            if (isset($vals['hostname'])) {
                $this->hostname = $vals['hostname'];
            }
            if (isset($vals['agentInfo'])) {
                $this->agentInfo = $vals['agentInfo'];
            }
            if (isset($vals['heartbeatCount'])) {
                $this->heartbeatCount = $vals['heartbeatCount'];
            }
            if (isset($vals['metaInfo'])) {
                $this->metaInfo = $vals['metaInfo'];
            }
            if (isset($vals['startedTime'])) {
                $this->startedTime = $vals['startedTime'];
            }
            if (isset($vals['lastHeartbeatTime'])) {
                $this->lastHeartbeatTime = $vals['lastHeartbeatTime'];
            }
        }
    }

    public function getName()
    {
        return 'TxnInfo';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->id);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->state);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->user);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->hostname);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->agentInfo);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->heartbeatCount);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 7:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->metaInfo);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 8:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->startedTime);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 9:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->lastHeartbeatTime);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('TxnInfo');
        if ($this->id !== null) {
            $xfer += $output->writeFieldBegin('id', TType::I64, 1);
            $xfer += $output->writeI64($this->id);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->state !== null) {
            $xfer += $output->writeFieldBegin('state', TType::I32, 2);
            $xfer += $output->writeI32($this->state);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->user !== null) {
            $xfer += $output->writeFieldBegin('user', TType::STRING, 3);
            $xfer += $output->writeString($this->user);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->hostname !== null) {
            $xfer += $output->writeFieldBegin('hostname', TType::STRING, 4);
            $xfer += $output->writeString($this->hostname);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->agentInfo !== null) {
            $xfer += $output->writeFieldBegin('agentInfo', TType::STRING, 5);
            $xfer += $output->writeString($this->agentInfo);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->heartbeatCount !== null) {
            $xfer += $output->writeFieldBegin('heartbeatCount', TType::I32, 6);
            $xfer += $output->writeI32($this->heartbeatCount);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->metaInfo !== null) {
            $xfer += $output->writeFieldBegin('metaInfo', TType::STRING, 7);
            $xfer += $output->writeString($this->metaInfo);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->startedTime !== null) {
            $xfer += $output->writeFieldBegin('startedTime', TType::I64, 8);
            $xfer += $output->writeI64($this->startedTime);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->lastHeartbeatTime !== null) {
            $xfer += $output->writeFieldBegin('lastHeartbeatTime', TType::I64, 9);
            $xfer += $output->writeI64($this->lastHeartbeatTime);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
